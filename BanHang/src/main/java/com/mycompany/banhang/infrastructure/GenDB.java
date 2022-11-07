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
import com.mycompany.banhang.entily.MauSac;
import com.mycompany.banhang.entily.NhaSanXuat;
import com.mycompany.banhang.entily.NhanVien;
import com.mycompany.banhang.entily.SanPham;
import static com.mycompany.banhang.infrastructure.HibernateUtil.getConfiguration;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author vinhnv
 */
public class GenDB {
    //Tạo DB trong SQL SERVER = SOFT2041_PTPM
    //Sau đó tiến hành chạy đển zen bảng

    public static void main(String[] args) {

        Properties prop = HibernateUtil.getProperties();
        prop.put(Environment.HBM2DDL_AUTO, "create");
        // Tạo đối tượng ServiceRegistry từ hibernate.cfg.xml
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(prop)
                .build();

        // tạo lớp giao tiếp với jdbc
        Configuration conf = getConfiguration(prop);
        SessionFactory factory = conf.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        // tạo giao dịch tương ứng 
        Transaction trans = session.beginTransaction();

        MauSac mauSac1 = new MauSac();
        mauSac1.setMa(new TaoChuoiNgauNhien().getMaRanDum("#"));
        mauSac1.setTen("Red");
//        mauSac1.setIdMauSac(mauSac1.getIdMauSac());
        session.save(mauSac1);

        MauSac mauSac2 = new MauSac();
        mauSac2.setMa(new TaoChuoiNgauNhien().getMaRanDum("#"));
        mauSac2.setTen("Yellow");
//        mauSac2.setIdMauSac(mauSac2.getIdMauSac());
        session.save(mauSac2);

        MauSac mauSac3 = new MauSac();
        mauSac3.setMa(new TaoChuoiNgauNhien().getMaRanDum("#"));
        mauSac3.setTen("Blue");
//        mauSac3.setIdMauSac(mauSac3.getIdMauSac());
        session.save(mauSac3);

        MauSac mauSac4 = new MauSac();
        mauSac4.setMa(new TaoChuoiNgauNhien().getMaRanDum("#"));
        mauSac4.setTen("Black");
//        mauSac4.setIdMauSac(mauSac4.getIdMauSac());
        session.save(mauSac4);

        MauSac mauSac5 = new MauSac();
        mauSac5.setMa(new TaoChuoiNgauNhien().getMaRanDum("#"));
        mauSac5.setTen("White");
//        mauSac5.setIdMauSac(mauSac5.getIdMauSac());
        session.save(mauSac5);

        DongSP dongSP = new DongSP();
        dongSP.setTen("RAM - BỘ NHỚ TRONG");
        dongSP.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP.setIdDongSP(dongSP.getIdDongSP());
        session.save(dongSP);

        DongSP dongSP1 = new DongSP();
        dongSP1.setTen("TAI NGHE");
        dongSP1.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP1.setIdDongSP(dongSP1.getIdDongSP());
        session.save(dongSP1);

        DongSP dongSP2 = new DongSP();
        dongSP2.setTen("MONITOR - MÀN HÌNH MÁY TÍNH");
        dongSP2.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP2.setIdDongSP(dongSP2.getIdDongSP());
        session.save(dongSP2);

        DongSP dongSP3 = new DongSP();
        dongSP3.setTen("MOUSE - CHUỘT");
        dongSP3.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP3.setIdDongSP(dongSP2.getIdDongSP());
        session.save(dongSP3);

        DongSP dongSP4 = new DongSP();
        dongSP4.setTen("KEYBOARD - BÀN PHÍM");
        dongSP4.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP4.setIdDongSP(dongSP2.getIdDongSP());
        session.save(dongSP4);

        DongSP dongSP5 = new DongSP();
        dongSP5.setTen("USB - Ổ CỨNG");
        dongSP5.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP5.setIdDongSP(dongSP2.getIdDongSP());
        session.save(dongSP5);

        DongSP dongSP6 = new DongSP();
        dongSP6.setTen("CÁP SẠC");
        dongSP6.setMa(new TaoChuoiNgauNhien().getMaRanDum("DO"));
//        dongSP6.setIdDongSP(dongSP2.getIdDongSP());
        session.save(dongSP6);

        // sản phẩm tai nghe
        SanPham sanPham = new SanPham();
        sanPham.setTen("Tai nghe bluetooth Oppo Enco Buds W12");
        sanPham.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham);

        SanPham sanPham1 = new SanPham();
        sanPham1.setTen("Tai nghe bluetooth TWS Belkin Soundform Freedom");
        sanPham1.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham1.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham1);

        // sản phẩm chuột
        SanPham sanPham2 = new SanPham();
        sanPham2.setTen("Chuột không dây Targus W600");
        sanPham2.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham2.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham2);

        SanPham sanPham3 = new SanPham();
        sanPham3.setTen("Chuột Gaming Asus CERBERUS");
        sanPham3.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham3.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham3);

        // sản phẩm cáp sạc
        SanPham sanPham4 = new SanPham();
        sanPham4.setTen("Cáp Lightning Aukey CB-BAL7 MFI 0.9m");
        sanPham4.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham4.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham4);

        SanPham sanPham5 = new SanPham();
        sanPham5.setTen("Sạc Magsafe không dây 2in1 Hyperjuice 7.5W");
        sanPham5.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham5.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham5);

        // sản phẩm màn hình 
        SanPham sanPham6 = new SanPham();
        sanPham6.setTen("Màn hình Acer KA242Y ");
        sanPham6.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham6.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham6);

        SanPham sanPham7 = new SanPham();
        sanPham7.setTen("Màn hình Dell P2422H");
        sanPham7.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham7.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham7);

        // sản phẩm bàn phím
        SanPham sanPham8 = new SanPham();
        sanPham8.setTen("Bàn phím không dây Apple Magic Keyboard 2021");
        sanPham8.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham8.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham8);

        SanPham sanPham9 = new SanPham();
        sanPham9.setTen("Bàn phím có dây Logitech K120");
        sanPham9.setMa(new TaoChuoiNgauNhien().getMaRanDum("SP"));
//        sanPham9.setIdSanPham(sanPham.getIdSanPham());
        session.save(sanPham9);

        NhaSanXuat nsx = new NhaSanXuat();
        nsx.setMa(new TaoChuoiNgauNhien().getMaRanDum("NSX"));
        nsx.setTen("Mainboard Asus");
//        nsx.setIdNhaSanXuat(nsx.getIdNhaSanXuat());
        session.save(nsx);

        NhaSanXuat nsx1 = new NhaSanXuat();
        nsx1.setMa(new TaoChuoiNgauNhien().getMaRanDum("NSX"));
        nsx1.setTen("Gigabyte");
//        nsx1.setIdNhaSanXuat(nsx.getIdNhaSanXuat());
        session.save(nsx1);

        NhaSanXuat nsx2 = new NhaSanXuat();
        nsx2.setMa(new TaoChuoiNgauNhien().getMaRanDum("NSX"));
        nsx2.setTen("Mainboard MSI");
//        nsx2.setIdNhaSanXuat(nsx.getIdNhaSanXuat());
        session.save(nsx2);

        NhaSanXuat nsx3 = new NhaSanXuat();
        nsx3.setMa(new TaoChuoiNgauNhien().getMaRanDum("NSX"));
        nsx3.setTen("Asrock");
//        nsx3.setIdNhaSanXuat(nsx.getIdNhaSanXuat());
        session.save(nsx3);

        NhaSanXuat nsx4 = new NhaSanXuat();
        nsx4.setMa(new TaoChuoiNgauNhien().getMaRanDum("NSX"));
        nsx4.setTen("Apple");
//        nsx4.setIdNhaSanXuat(nsx.getIdNhaSanXuat());
        session.save(nsx4);

        CuaHang cuaHang = new CuaHang();
        cuaHang.setMa(new TaoChuoiNgauNhien().getMaRanDum("CH"));
        cuaHang.setTen("Bigmax");
        cuaHang.setDiaChi("Hà Nội");
//        cuaHang.setIdCuaHang(cuaHang.getIdCuaHang());
        session.save(cuaHang);

        CuaHang cuaHang1 = new CuaHang();
        cuaHang1.setMa(new TaoChuoiNgauNhien().getMaRanDum("CH"));
        cuaHang1.setTen("Shop VonBox");
        cuaHang1.setDiaChi("HCM");
//        cuaHang1.setIdCuaHang(cuaHang1.getIdCuaHang());
        session.save(cuaHang1);

        CuaHang cuaHang2 = new CuaHang();
        cuaHang2.setMa(new TaoChuoiNgauNhien().getMaRanDum("CH"));
        cuaHang2.setTen("Onion Phụ Kiện");
        cuaHang2.setDiaChi("Da Nang");
//        cuaHang2.setIdCuaHang(cuaHang2.getIdCuaHang());
        session.save(cuaHang2);

        ChucVu chucVu = new ChucVu();
        chucVu.setMa(new TaoChuoiNgauNhien().getMaRanDum("CV"));
        chucVu.setTen("Nhân viên");
//        chucVu.setIdChucVu(chucVu.getIdChucVu());
        session.save(chucVu);

        ChucVu chucVu1 = new ChucVu();
        chucVu1.setMa(new TaoChuoiNgauNhien().getMaRanDum("CV"));
        chucVu1.setTen("Quản lý");
//        chucVu1.setIdChucVu(chucVu1.getIdChucVu());
        session.save(chucVu1);

        NhanVien nhanVien = new NhanVien();
        nhanVien.setHoTen("Nguyễn Văn Vinh");
        nhanVien.setMa("NV001");
        nhanVien.setSdt("0962784188");
        nhanVien.setTrangThai(0);
        nhanVien.setPassword("123");
        nhanVien.setChucVu(chucVu1);
        nhanVien.setCuaHang(cuaHang);
        nhanVien.setNgaySinh(Date.valueOf("2000-06-01"));
        nhanVien.setGioiTinh("Nam");
        nhanVien.setDiaChi("Hà Nội");
        nhanVien.setEmail("vinhnvph23845@fpt.edu.vn");
//        nhanVien.setIdNhanVien(nhanVien.getIdNhanVien());
        session.save(nhanVien);

        ChiTietSP chiTietSP = new ChiTietSP();
        chiTietSP.setIdChiTietSanPham(chiTietSP.getIdChiTietSanPham());
        chiTietSP.setSanPham(sanPham);
        chiTietSP.setNhaSanXuat(nsx);
        chiTietSP.setMauSac(mauSac3);
        chiTietSP.setDongSP(dongSP1);
        chiTietSP.setNamBH(2022);
        chiTietSP.setMoTa("Loại tai nghe : Tai nghe không dây \n "
                + "Thời gian sạc đầy :	2.5 giờ Hộp sạc\n"
                + "Khoảng cách kết nối : 10 m\n"
                + "Dải tần số : 20 Hz - 20 kHz\n"
                + "Trở kháng : 32 Ohm \n"
                + " Kích thước : 22.2 x 19.6 x 22.7 mm\n"
                + "Trọng lượng : 45 g");
        chiTietSP.setSoLuongTon(25);
        chiTietSP.setGiaNhap(new BigDecimal(450000.0));
        chiTietSP.setGiaBan(new BigDecimal(599000.0));
        session.save(chiTietSP);

        ChiTietSP chiTietSP1 = new ChiTietSP();
        chiTietSP1.setIdChiTietSanPham(chiTietSP1.getIdChiTietSanPham());
        chiTietSP1.setSanPham(sanPham3);
        chiTietSP1.setNhaSanXuat(nsx2);
        chiTietSP1.setMauSac(mauSac5);
        chiTietSP1.setDongSP(dongSP3);
        chiTietSP1.setNamBH(2023);
        chiTietSP1.setMoTa("Trọng lượng sản phẩm : 300 g "
                + "Loại chuột : Chuột Gaming\n"
                + "Kiểu kết nối : USB ");
        chiTietSP1.setSoLuongTon(124);
        chiTietSP1.setGiaNhap(new BigDecimal(100000.0));
        chiTietSP1.setGiaBan(new BigDecimal(200000.0));
        session.save(chiTietSP1);

        ChiTietSP chiTietSP2 = new ChiTietSP();
        chiTietSP2.setIdChiTietSanPham(chiTietSP2.getIdChiTietSanPham());
        chiTietSP2.setSanPham(sanPham4);
        chiTietSP2.setNhaSanXuat(nsx);
        chiTietSP2.setMauSac(mauSac5);
        chiTietSP2.setDongSP(dongSP6);
        chiTietSP2.setNamBH(2022);
        chiTietSP2.setMoTa("Kích thước : 0.9 m\n"
                + "Trọng lượng sản phẩm : 0.019 kg\n"
                + "Độ dài dây cáp : 0.9 m\n"
                + "Màu sắc : Đen\n"
                + "Chất liệu : Nylon");
        chiTietSP2.setSoLuongTon(30);
        chiTietSP2.setGiaNhap(new BigDecimal(350000.0));
        chiTietSP2.setGiaBan(new BigDecimal(499000.0));
        session.save(chiTietSP2);
        
        System.out.println(chiTietSP2.getMoTa());

        KhachHang khachHang = new KhachHang();
//        khachHang.setIdKhachHang(khachHang.getIdKhachHang());
        khachHang.setMa(new TaoChuoiNgauNhien().getMaRanDum("KH"));
        khachHang.setHoTen("Hà Phương Na");
        khachHang.setNgaySinh(Date.valueOf("2000-01-21"));
        khachHang.setSdt("0962784188");
        khachHang.setDiaChi("Hà Nội");
        khachHang.setPassword("123");
        khachHang.setGioiTinh("Nữ");
        khachHang.setTrangThai(0);
        khachHang.setEmail("anhvinh12a888@gmail.com");
        session.save(khachHang);

        KhachHang khachHang1 = new KhachHang();
//        khachHang1.setIdKhachHang(khachHang1.getIdKhachHang());
        khachHang1.setMa("KH001");
        khachHang1.setHoTen("Lò Thị Tòng");
        khachHang1.setNgaySinh(Date.valueOf("2003-04-22"));
        khachHang1.setSdt("0123456789");
        khachHang1.setDiaChi("Ba Vi");
        khachHang1.setEmail("tonglo@gmail.com");
        khachHang1.setPassword("123");
        khachHang1.setGioiTinh("Nữ");
        khachHang1.setTrangThai(0);
        session.save(khachHang1);

        HoaDon hd = new HoaDon();
//        hd.setIdHoaDon(hd.getIdHoaDon());
        hd.setKhachHang(khachHang1);
        hd.setNhanVien(nhanVien);
        hd.setMa(new TaoChuoiNgauNhien().getMaRanDum("HD"));
        hd.setNgayTao(Date.valueOf("2022-08-22"));
        hd.setNgayThanhToan(Date.valueOf("2022-08-22"));
        hd.setNgayShip(Date.valueOf("2022-08-22"));
        hd.setNgayNhan(Date.valueOf("2022-08-22"));
        hd.setTinhTrang(0);
        hd.setTenNguoiNhan("Huy");
        hd.setDiaChhi("Hà Nội");
        hd.setSdt("0123456789");
        session.save(hd);

        HoaDon hd1 = new HoaDon();
//        hd1.setIdHoaDon(hd.getIdHoaDon());
        hd1.setKhachHang(khachHang);
        hd1.setNhanVien(nhanVien);
        hd1.setMa(new TaoChuoiNgauNhien().getMaRanDum("HD"));
        hd1.setNgayTao(Date.valueOf("2022-08-22"));
        hd1.setNgayThanhToan(Date.valueOf("2022-08-22"));
        hd1.setNgayShip(Date.valueOf("2022-08-22"));
        hd1.setNgayNhan(Date.valueOf("2022-08-22"));
        hd1.setTinhTrang(0);
        hd1.setTenNguoiNhan("Dương Thắng");
        hd1.setDiaChhi("Hà Nội");
        hd1.setSdt("0962784188");
        session.save(hd1);

        HoaDon hd2 = new HoaDon();
//        hd2.setIdHoaDon(hd.getIdHoaDon());
        hd2.setKhachHang(khachHang);
        hd2.setNhanVien(nhanVien);
        hd2.setMa(new TaoChuoiNgauNhien().getMaRanDum("HD"));
        hd2.setNgayTao(Date.valueOf("2022-08-22"));
        hd2.setNgayThanhToan(Date.valueOf("2022-08-22"));
        hd2.setNgayShip(Date.valueOf("2022-08-22"));
        hd2.setNgayNhan(Date.valueOf("2022-08-22"));
        hd2.setTinhTrang(0);
        hd2.setTenNguoiNhan("Nguyễn Vinh");
        hd2.setDiaChhi("Hà Nội");
        hd2.setSdt("0962784188");
        session.save(hd2);

        HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setHoaDon(hd);
        hdct.setChiTietSP(chiTietSP);
        hdct.setSoLuong(2);
        hdct.setDonGia(new BigDecimal(599000.0));
        session.save(hdct);

        HoaDonChiTiet hdct1 = new HoaDonChiTiet();
        hdct1.setHoaDon(hd1);
        hdct1.setChiTietSP(chiTietSP);
        hdct1.setSoLuong(2);
        hdct1.setDonGia(new BigDecimal(599000.0));
        session.save(hdct1);

        HoaDonChiTiet hdct2 = new HoaDonChiTiet();
        hdct2.setHoaDon(hd);
        hdct2.setChiTietSP(chiTietSP1);
        hdct2.setSoLuong(2);
        hdct2.setDonGia(new BigDecimal(200000.0));
        session.save(hdct2);

        // db generator : gen bảng tự động
        trans.commit();
    }

}
