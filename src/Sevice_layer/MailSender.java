package Sevice_layer;

import Integration_layer.SenderTls;


public class MailSender {
	
    public static void send(String subject, String text, String mail){
    	SenderTls tlsSender = new SenderTls("kbankukarine@gmail.com", "kbank123");
        tlsSender.send(subject, text, "Kbankukarine@gmail.com", mail);
    }
}