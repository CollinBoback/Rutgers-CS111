package com.company;

/**
 * Created by collinboback on 12/13/16.
 */
public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;


    public VipCustomer() {
        this("Default name", 0, "Default email");

    }

    public VipCustomer(String name, String email) {
        this(name, 0, email);
        this.name = name;
        this.email = email;
    }

    public VipCustomer(int creditLimit, String email) {
        this("Default name", creditLimit, email);
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "Default email");
        this.name = name;
        this.creditLimit = creditLimit;

    }

    public VipCustomer(String name, int creditLimit, String email) {
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
