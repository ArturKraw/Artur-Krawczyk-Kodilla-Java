package com.kodilla.good.patterns.challenges.Food2DoorSystem;


class MainExecutionSystemShop3 implements MainExecutionSystem{

    public boolean mainSystemOrderProcess(String orderId, User user, ProductProvider productProvider, OrderSet orderSet){
        boolean orderValidation;

        System.out.println("\n" + "<F2D-MainExecutionSystemShop3> - Start>");

        System.out.println("\n" + "Summary of product order action: ");
        System.out.println(orderId);
        System.out.println(productProvider);
        System.out.println(user);
        System.out.println(orderSet);

        System.out.println("<F2D-MainExecutionSystemShop3-SubSystem1> - order validation");
        //checking possibility to execute order - than validating order
        orderValidation = true;

        System.out.println("<F2D-MainExecutionSystemShop3-SubSystem2> - order preparation");
        System.out.println("<F2D-MainExecutionSystemShop3-SubSystem3> - order sending to user");
        System.out.println("<F2D-MainExecutionSystemShop3-SubSystem4> - order repository and inforaming ");
        System.out.println("<F2D-MainExecutionSystemShop3-SubSystem4> - logistic");

        System.out.println("\n" + "<F2D-MainExecutionSystemShop3> - End>");
        return orderValidation;
    }

}
