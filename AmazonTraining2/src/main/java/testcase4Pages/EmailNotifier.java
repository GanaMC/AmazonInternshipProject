package testcase4Pages;
import java.net.PasswordAuthentication;
import java.util.Properties;


import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.virtualauthenticator.VirtualAuthenticatorOptions.Transport;
public class EmailNotifier {
	/* public static void sendEmail(String subject, String messageText) {
	        final String fromEmail = "your-email@gmail.com";
	        final String password = "your-app-password";
	        final String toEmail = "recipient-email@gmail.com";

	        Properties props = new Properties();
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");

	       // Session session = Session.getInstance(props, new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	           //     return new PasswordAuthentication(fromEmail, password);
	            }
	        });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(fromEmail, "Amazon Price Alert"));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
	            message.setSubject(subject);
	            message.setText(messageText);
	            Transport.send(message);

	            System.out.println("✅ Email notification sent.");
	        } catch (Exception e) {
	            System.out.println("❌ Failed to send email.");
	            e.printStackTrace();
	        }
	    }*/
}
