package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer Collin = new VipCustomer("Collin", 10000, "cmb431@rutgers.edu");
        VipCustomer Allen = new VipCustomer();
        VipCustomer John = new VipCustomer("John", 100000);


        System.out.println(Collin.getEmail());
        System.out.println(Allen.getCreditLimit());
        System.out.println(John.getEmail());








    }


}
