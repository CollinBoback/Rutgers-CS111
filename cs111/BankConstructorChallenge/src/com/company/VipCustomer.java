package com.company;

/**
 * Created by collinboback on 12/31/16.
 */
public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;


    VipCustomer() {
        this("Default Name", 0, "Default email");
    }


    VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "Default email");

    }

    VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
