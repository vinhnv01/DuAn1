/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.infrastructure;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vinhnv
 */
public class SendEmail {

    private final static String emailGui = "vinhnvph23845@fpt.edu.vn";
    private final static String matKhau = "010620Vinh";

    public static void guiMail(String emailNhan,
            String tieuDe, String noiDung)
            throws AddressException, MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailGui, matKhau);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(emailGui));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse(emailNhan));

        // Tiêu đề
        message.setSubject(tieuDe);

        // Nội dung
        message.setSubject("Testing Gmail " + tieuDe);
        message.setText("Dear ,"
                + "\n\n" + noiDung
                + "\n\n Please do not spam my email!");

        Transport.send(message);
    }

    public static void main(String[] args) throws MessagingException {
        String matKhauMoi = new TaoChuoiNgauNhien().getMaRanDum(" Mat khau cua ban : ");
        SendEmail.guiMail("anhvinh12a888@gmail.com", "", matKhauMoi);
    }
}
