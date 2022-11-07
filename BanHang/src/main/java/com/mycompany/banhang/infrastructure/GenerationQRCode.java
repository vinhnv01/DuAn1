/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.infrastructure;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;


/**
 *
 * @author thang
 */
public class GenerationQRCode {
    private void generationQR(Object data){
        try {
            String converData = data.toString();
            ByteArrayOutputStream out = QRCode.from(converData)
                    .to(ImageType.PNG).stream();
            FileOutputStream fout = new FileOutputStream(new File("").getAbsolutePath()+"//src//main//resources//img//qr.png",true);
            fout.write(out.toByteArray());
            fout.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        GenerationQRCode code = new GenerationQRCode();
        code.generationQR( new Object());
    }
}
