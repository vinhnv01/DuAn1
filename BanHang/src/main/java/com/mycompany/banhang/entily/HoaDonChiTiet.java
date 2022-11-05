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
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author vinhnv
 */
@Entity
@Data
@Table(name = "hoa_don_chi_tiet")
@ToString
public class HoaDonChiTiet implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idHoaDonChiTiet;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idChiTietSanPham")
    private ChiTietSP chiTietSP;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idHoaDon")
    private HoaDon hoaDon;
}
