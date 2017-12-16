package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.util.HashMap;

class MainExecutionSystemShop1 implements MainExecutionSystem{

    public   boolean mainSystemOrderProcess(String orderId, User user, ProductProvider productProvider, OrderSet orderSet){
        boolean orderValidation;

        System.out.println("\n" + "<F2D-MainExecutionSystemShop1> - Start>");

        System.out.println("\n" + "Summary of product order action: ");
        System.out.println(orderId);
        System.out.println(productProvider);
        System.out.println(user);
        System.out.println(orderSet);

        System.out.println("<F2D-MainExecutionSystemShop1-SubSystem1 - order repository> ");
        System.out.println("<F2D-MainExecutionSystemShop1-SubSystem2> - order validation");
        //checking possibility to execute order - than validating order
        orderValidation = true;

        System.out.println("<F2D-MainExecutionSystemShop1-SubSystem3> - order preparation");
        System.out.println("<F2D-MainExecutionSystemShop1-SubSystem4> - order sending to user");
        System.out.println("<F2D-MainExecutionSystemShop1-SubSystem5> - order cyckle evaluation");

        System.out.println("<F2D-MainExecutionSystemShop1> - End>");
        return orderValidation;
    }





}
