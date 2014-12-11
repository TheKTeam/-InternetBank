package Sevice_layer;

import Integration_layer.SenderTls;


public class MailSender {

    public static void send(String subject, String text, String mail){
    	SenderTls tlsSender = new SenderTls("kbanukarine@gmai.com", "kbank123");
        tlsSender.send(subject, text, "KbanUkarine@gmai.com", mail);
    }
}