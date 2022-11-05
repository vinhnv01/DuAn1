/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;

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
@Table(name = "ma_khuyen_mai_khach_hang")
@NoArgsConstructor
@AllArgsConstructor
public class MaKhuyenMaiKhachHang {
    
    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idKhuyenMaiKhachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idKhuyenMai")
    private KhuyenMai khuyenMai;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idKhachHang")
    private KhachHang khachHang;
}
