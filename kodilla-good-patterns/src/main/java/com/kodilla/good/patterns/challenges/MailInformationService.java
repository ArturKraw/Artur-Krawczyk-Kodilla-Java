package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class MailInformationService implements InformationService {

    public void inform(User user, LocalDateTime orderTime, Product product) {
        System.out.println("\n" + "<MailInformationService> - Start");
        System.out.println("Mail to user: " + user  + "\n" + "<<Dear User, we want to confirm your order request (done at: "
                + orderTime + ")  concerning: " + "\n" + product + ">>");
        System.out.println("<MailInformationService> - End");
    }
}
