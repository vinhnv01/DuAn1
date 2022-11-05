/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "chi_tiet_san_pham")
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idChiTietSanPham;

    @Column(name = "nam_bao_hanh")
    private int namBH;

    @Column(name = "trong_luong", length = 50)
    private float trongLuong;

    @Column(name = "so_luong_ton")
    private int soLuongTon;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;

    @Column(name = "mo_ta")
    private String moTa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idSanPham")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNhaSanXuat")
    private NhaSanXuat nhaSanXuat;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMaGiamGia")
    private MaGiamGia maGiamGia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idDongSP")
    private DongSP dongSP;
}
