/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.infrastructure;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author vinhnv
 */
public class TaoChuoiNgauNhien {

    public String getMaRanDum(String noDung) {
        String generator = noDung + RandomStringUtils.randomNumeric(6);
        return generator;
    }

    public static void main(String[] args) {
        String ktra = new TaoChuoiNgauNhien().getMaRanDum("Mật khẩu mới : ");
        System.out.println(ktra);
    }
}
