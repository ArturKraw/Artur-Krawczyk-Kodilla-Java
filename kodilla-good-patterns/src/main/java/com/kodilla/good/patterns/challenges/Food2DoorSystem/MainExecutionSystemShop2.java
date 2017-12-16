package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.util.HashMap;

class MainExecutionSystemShop2 implements MainExecutionSystem{


    public boolean mainSystemOrderProcess (String orderId, User user, ProductProvider productProvider, OrderSet orderSet){
        boolean orderValidation;

        System.out.println("\n" + "<F2D-MainExecutionSystemShop2> - Start>");
        System.out.println("orderReques summary: ");

        System.out.println("\n" + "Summary of product order action: ");
        System.out.println(orderId);
        System.out.println(productProvider);
        System.out.println(user);
        System.out.println(orderSet);

        System.out.println("<F2D-MainExecutionSystemShop2-SubSystem1> - order validation and repository");
        //checking possibility to execute order - than validating order
        orderValidation = true;
        System.out.println("<F2D-MainExecutionSystemShop2-SubSystem2> - order preparation");
        System.out.println("<F2D-MainExecutionSystemShop2-SubSystem3> - order sending to user");
        System.out.println("<F2D-MainExecutionSystemShop2-SubSystem4> - warehouses checking and suplementing");

        System.out.println("\n" + "<F2D-MainExecutionSystemShop2> - End>");
        return orderValidation;
    }
}
