package Integration_layer;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SenderTls {
 
    private String username;
    private String password;
    private Properties props;
 
    public SenderTls(String username, String password) {
        this.username = username;
        this.password = password;
 
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    }
 
    public void send(String subject, String text, String fromEmail, String toEmail){
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
 
        try {
            Message message = new MimeMessage(session);
            //fromEmail
            message.setFrom(new InternetAddress(username));
            //toEmail
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            //subject
            message.setSubject(subject);
            //text
            message.setText(text);
 
            //send message
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}