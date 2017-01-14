package com.company;

public class Main {

    public static void main(String[] args) {


        VipCustomer Collin = new VipCustomer("Collin", 1000, "cmb431@rutgers.edu");
        System.out.println(Collin.getCreditLimit());

        VipCustomer Roger = new VipCustomer();
        System.out.println(Roger.getCreditLimit());

        VipCustomer Amanda = new VipCustomer("Amanda", 10000);
        System.out.println(Amanda.getEmail());
        System.out.println(Amanda.getName());

        VipCustomer Dan = new VipCustomer(0, "dan@theman.com");
        System.out.println(Dan.getName());

    }


}

