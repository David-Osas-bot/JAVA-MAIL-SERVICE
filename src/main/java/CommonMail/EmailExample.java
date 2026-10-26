package CommonMail;

import org.apache.commons.mail2.core.EmailException;
import org.apache.commons.mail2.jakarta.SimpleEmail;

public class EmailExample {
    public static void sendEmail(){
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setSSLOnConnect(true);
        email.setAuthentication("davidosas011@gmail.com", "uhyajnbvkunsycyv");

        try{
            email.setFrom("aituayuwaosas@gmail.com");
            email.addTo("davidosas011@gmail.com");
            email.setSubject("Testing Java Mail");
            email.setMsg("This is a test email");
            email.send();
        }
        catch(EmailException e){
            e.printStackTrace();
        }
    }
}
