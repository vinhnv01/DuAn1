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
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

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
    private UUID idChiTietSanPham;

    @Column(name = "nam_bao_hanh")
    private int namBH;

    @Column(name = "trong_luong", length = 50)
    private float trongLuong;

    @Column(name = "so_luong_ton")
    private int soLuongTon;

    @Column(name = "gia_nhap")
    private BigDecimal giaNhap;

    @Column(name = "gia_ban")
    private BigDecimal giaBan;

    @Column(name = "mo_ta" ,columnDefinition="nvarchar(500)")
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
    @JoinColumn(name = "idDongSP")
    private DongSP dongSP;
}
