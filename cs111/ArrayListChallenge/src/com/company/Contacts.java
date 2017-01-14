package com.company;


import java.util.ArrayList;

public class Contacts {

    private ArrayList names;
    private ArrayList phoneNumbers;

    public Contacts() {
        this.names = new ArrayList<String>();
        this.phoneNumbers = new ArrayList<String>();
    }

    public ArrayList getNames() {
        return names;
    }

    public ArrayList getPhoneNumbers() {
        return phoneNumbers;
    }

    public void AddContact(String name, String phoneNumber){

        names.add(name);
        phoneNumbers.add(phoneNumber);

    }
}
