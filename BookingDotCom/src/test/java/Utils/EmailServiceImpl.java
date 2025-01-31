package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class EmailServiceImpl {

	public static void main(String[] args) throws IOException, MessagingException {

		String password = EmailData.getPassword();

		String reportFile = "src//test//resources//reporttemplate.txt";

		File file = new File(reportFile);

		FileReader fr = new FileReader(file);

		String result;

		StringBuilder html = new StringBuilder();


		try(BufferedReader br = new BufferedReader(fr)){

			String val;

			while ((val = br.readLine()) != null) {
				html.append(val);
			}

			result = html.toString();


		}

		System.out.println(result);


		Properties prop = new Properties();

		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		prop.put("mail.smtp.starttls.enable", true);

		final Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("palekarvivek6@gmail.com", password);
			}
		});

		final Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("palekarvivek6@gmail.com"));
		message.setRecipients(
				Message.RecipientType.TO, InternetAddress.parse("mohan.palekar93@gmail.com"));
		message.setSubject("Regression - Report");

		//		final MimeBodyPart mimeBodyPart = new MimeBodyPart();
		//		mimeBodyPart.setContent(reportContent, "text/html; charset=utf-8");

		//		final StringBuffer attachPath = new StringBuffer(40);
		//		attachPath.append(reportPath);
		//		final MimeBodyPart attachBodyPart = new MimeBodyPart();
		//		attachBodyPart.attachFile(new File(attachPath.toString()));
		//
		//		final MimeMultipart multipart = new MimeMultipart();
		//		multipart.addBodyPart(mimeBodyPart);
		//		multipart.addBodyPart(attachBodyPart);

		//		message.setContent(result, "text/html");
		//
		//		Transport.send(message);

		// Email body text
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setText("Please find the attached test report.");

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);

		// Attach the report
		messageBodyPart = new MimeBodyPart();
		String filename = "C:\\Users\\palek\\Downloads\\Report.html";
		FileDataSource source = new FileDataSource(filename);
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(filename);
		multipart.addBodyPart(messageBodyPart);

		// Combine message parts
		message.setContent(multipart);

		Transport.send(message);

		System.out.println("Email Sent");

	}

}
