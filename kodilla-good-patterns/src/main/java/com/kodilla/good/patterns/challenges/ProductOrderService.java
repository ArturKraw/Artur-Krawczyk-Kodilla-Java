package com.kodilla.good.patterns.challenges;
/*
Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów
        (gier, kapcie, szczoteczek do zębów… innymi słowy, Allegro :)
 Wykorzystaj przykład poniżej jako wzór do swojej implementacji:
 Pamiętaj o stworzeniu niezbędnych interfejsów i klas które będą implementować stworzone interfejsy.
  Program należy uruchomić za pomocą metody main().
*/
public class ProductOrderService {

    public void productOrderService(){


    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    OrderProcessor orderProcessor = new OrderProcessor
          (new MailInformationService(), new PrOrderService(), new PrOrderRepository());

        orderProcessor.orderProcess(orderRequest);

        System.out.println("Summary of product order action: ");
        System.out.println(orderRequest.getUser());
        System.out.println("Bye");

    }
}

