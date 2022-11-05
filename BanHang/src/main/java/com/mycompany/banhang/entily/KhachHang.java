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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author vinhnv
 */
@Entity
@Data
@Table(name = "khach_hang")
public class KhachHang implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idKhachHang;

    @Column(name = "ma", length = 20)
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

    @Column(name = "dia_chi", length = 500)
    private String diaChi;

    @Column(name = "trang_thai")
    private int trangThai;

}