package mailService;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import mailInterface.MailInterface;
import org.example.MailConfig;

import java.util.Properties;

public class MailService implements MailInterface {

    private static final Session SESSION = MailConfig.getSession();
    private static final String SENDER_EMAIL = MailConfig.get("mail.username");
    private static final String SUCCESS_MESSAGE = "E-Mail sent successfully!";

    @Override
    public String sendBasicMail(String recipientMail, String subject, String body) {
        return sendEmail(recipientMail, subject, body);
    }

    private String sendEmail(String recipientMail, String subject, String body) {
        try {
            Message message = new MimeMessage(SESSION);
            message.setFrom(new InternetAddress(SENDER_EMAIL));
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(recipientMail));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
            return SUCCESS_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}