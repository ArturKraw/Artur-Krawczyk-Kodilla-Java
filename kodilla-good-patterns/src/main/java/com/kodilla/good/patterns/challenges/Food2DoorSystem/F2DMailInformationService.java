package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class F2DMailInformationService implements F2DInformationService{

    public void inform(String orderId, User user, LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet) {
        System.out.println("\n" + "<MailInformationService> - Start");
        System.out.println("Mail to user: " + user  + "\n" +
                "<<Dear User, we want to confirm your order request (done at: "
                + orderTime + ")  concerning: " + "\n" + orderSet +
                " was sent to product provider " + productProvider + ">>");
        System.out.println("<MailInformationService> - End");
    }
}
