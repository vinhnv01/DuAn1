/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.entily;

import java.io.Serializable;
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
@Table(name = "Cua_Hang")
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang implements Serializable{
    
    @Id 
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID idCuaHang;
    
    @Column(name = "Ma",length = 20)
    private String ma;
    
    @Column(name = "Ten", length = 50)
    private String ten;
    
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

}