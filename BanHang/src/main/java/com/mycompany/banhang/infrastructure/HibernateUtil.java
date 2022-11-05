/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.infrastructure;

import com.mycompany.banhang.entily.ChiTietSP;
import com.mycompany.banhang.entily.ChucVu;
import com.mycompany.banhang.entily.CuaHang;
import com.mycompany.banhang.entily.DongSP;
import com.mycompany.banhang.entily.HoaDon;
import com.mycompany.banhang.entily.HoaDonChiTiet;
import com.mycompany.banhang.entily.KhachHang;
import com.mycompany.banhang.entily.KhuyenMai;
import com.mycompany.banhang.entily.MaGiamGia;
import com.mycompany.banhang.entily.MaKhuyenMaiKhachHang;
import com.mycompany.banhang.entily.MauSac;
import com.mycompany.banhang.entily.NhaSanXuat;
import com.mycompany.banhang.entily.NhanVien;
import com.mycompany.banhang.entily.SanPham;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author vinhnv
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Properties prop = getProperties();

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(prop).build();
        Configuration conf = getConfiguration(prop);
        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

    public static Properties getProperties() {
        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DUAN1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB tự động
        properties.put(Environment.HBM2DDL_AUTO, "create");
        return properties;
    }

    public static Configuration getConfiguration(Properties prop) {
        Configuration conf = new Configuration();

        conf.setProperties(prop);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(DongSP.class);
        conf.addAnnotatedClass(KhuyenMai.class);
        conf.addAnnotatedClass(NhaSanXuat.class);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(MaGiamGia.class);
        conf.addAnnotatedClass(MaKhuyenMaiKhachHang.class);

        return conf;
    }
}
