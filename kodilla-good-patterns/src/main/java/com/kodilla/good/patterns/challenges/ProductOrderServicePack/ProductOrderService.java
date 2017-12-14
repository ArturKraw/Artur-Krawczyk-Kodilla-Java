package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

import com.kodilla.good.patterns.challenges.ProductOrderServicePack.*;

/*
Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów
        (gier, kapcie, szczoteczek do zębów… innymi słowy, Allegro :)
 Wykorzystaj przykład poniżej jako wzór do swojej implementacji:
 Pamiętaj o stworzeniu niezbędnych interfejsów i klas które będą implementować stworzone interfejsy.
  Program należy uruchomić za pomocą metody main().
*/
public class ProductOrderService {

    public void productOrderService(){

        System.out.println("\n" + "<ProductOrderService> - Start");
    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    OrderProcessor orderProcessor = new OrderProcessor
          (new MailInformationService(), new ProdOrderService(), new ProdOrderRepository());

        orderProcessor.orderProcess(orderRequest);

        System.out.println("\n" + "Summary of product order action: ");
        System.out.println(orderRequest.getUser());
        System.out.println(orderRequest.getOrderTime());
        System.out.println(orderRequest.getProduct());
        System.out.println("<ProductOrderService> - End");


    }
}

