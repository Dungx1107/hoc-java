package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class GmailSender {
    // Sender and receiver email addresses
    private static final String EMAIL_FROM = "nguyenxuandung457@gmail.com"; // Your email address
    private static final String EMAIL_TO = "23020028@vnu.edu.vn"; // Recipient email address
    private static final String APP_PASSWORD = "kogo heqa jzwj tqnr"; // App password (16-character)

    public static void main(String[] args) {
        try {

            LoadingEffect.start();

            // Create the email message
            Message message = new MimeMessage(getEmailSession());

            // Set the from and to email addresses
            message.setFrom(new InternetAddress(EMAIL_FROM));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EMAIL_TO));

            // Set the email subject and body text
            message.setSubject("Email subject");
            message.setText("This is my email sent from Gmail using Java");

            // Send the email
            Transport.send(message);

            LoadingEffect.stop();

            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            LoadingEffect.stop();
            e.printStackTrace(); // Print any exceptions for debugging
        }
    }

    // Method to get the email session with Gmail's SMTP settings
    private static Session getEmailSession() {
        return Session.getInstance(getGmailProperties(), new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, APP_PASSWORD);
            }
        });
    }

    // Method to get Gmail's SMTP properties
    private static Properties getGmailProperties() {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); // Enable TLS
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587"); // SMTP port for TLS
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // Trust the Gmail server
        return prop;
    }
}
