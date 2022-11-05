/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author vinhnv
 */
@Entity
@Table(name = "nhan_vien")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator",
        parameters = {
            @Parameter(
                name = "uuid_gen_strategy_class",
                value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
            )
        }
    )
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID idNhanVien;

    @Column(name = "ma", unique = true, length = 20)
    private String ma;

    @Column(name = "ho_ten", length = 30)
    private String hoTen;

    @Column(name = "gioi_tinh", length = 10)
    private String gioiTinh;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "sdt", length = 30)
    private String sdt;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "mat_khau", length = 30)
    private String password;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "trang_thai")
    private int trangThai;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idChucVu")
    private ChucVu chucVu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCuaHang")
    private CuaHang cuaHang;

}
