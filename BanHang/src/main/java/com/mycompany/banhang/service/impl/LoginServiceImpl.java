/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.service.impl;

import com.mycompany.banhang.infrastructure.SendEmail;
import com.mycompany.banhang.infrastructure.TaoChuoiNgauNhien;
import com.mycompany.banhang.service.LoginService;
import com.mycompany.banhang.view.viewlogin.login.QuenMatKhau;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author vinhnv
 */
public class LoginServiceImpl implements LoginService {

    private String regularEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";

    @Override
    public String capMatKhau(String email) {
        
        try {
            String matKhauMoi = new TaoChuoiNgauNhien().getMaRanDum("Mật khẩu : ");
            new SendEmail().guiMail(email, "", matKhauMoi);            
        } catch (MessagingException ex) {
            Logger.getLogger(QuenMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Gủi thành cong";
    }

}
