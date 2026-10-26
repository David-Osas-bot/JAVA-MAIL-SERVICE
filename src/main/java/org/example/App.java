package org.example;

import CommonMail.EmailExample;
import mailService.MailService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
//            System.out.println("Enter recipient email: ");
//
//            String recipientEmail = sc.nextLine();
//            System.out.println("Enter subject: ");
//            String subject = sc.nextLine();
//
//            System.out.println("Enter message body: ");
//            String body = sc.nextLine();
//
//            MailService mailService = new MailService();
//            String response = mailService.sendBasicMail(recipientEmail, subject, body);
//            System.out.println(response);

            EmailExample.sendEmail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
