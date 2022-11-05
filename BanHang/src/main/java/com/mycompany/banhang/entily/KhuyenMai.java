/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;


import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "khuyen_mai")
@AllArgsConstructor
@NoArgsConstructor
public class KhuyenMai {
    
    @Id
    @GeneratedValue
    @Column(name = "Id" , columnDefinition = "uniqueidentifier")
    private UUID idKhuyenMai;

    @Column(name = "ngay_bat_dau")
    private long ngayBatDau;

    @Column(name = "ngay_ket thuc")
    private long ngayKetThuc;

    @Column(name = "trang_thai")
    private int trangThai;
}
