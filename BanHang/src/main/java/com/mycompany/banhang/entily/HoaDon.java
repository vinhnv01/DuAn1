/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;

import java.io.Serializable;
import java.util.Date;
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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vinhnv
 */
@Entity
@Data
@Table(name = "hoa_don")
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idHoaDon;

    @Column(name = "ma", length = 20)
    private String ma;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_thanh_toan")
    private Date ngayThanhToan;

    @Column(name = "ngay_ship")
    private Date ngayShip;

    @Column(name = "ngay_nhan")
    private Date ngayNhan;

    @Column(name = "tinh_trang")
    private int tinhTrang;

    @Column(name = "ten_nguoi_nhan", length = 50)
    private String tenNguoiNhan;

    @Column(name = "dia_chi", length = 100)
    private String diaChhi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idKhachHang")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;
}
