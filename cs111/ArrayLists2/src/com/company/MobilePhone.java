package com.company;

import java.util.ArrayList;

/**
 * Created by collinboback on 1/11/17.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0) {
            return false;
            //not found
        } else {

            this.myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " replaced with " + newContact.getName());
            return true;

            //returns true; found contact and replaced it.

        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
        // 0 or greater if it exists
    }

    private int findContact(String contactName) {
        // loop through all records and compare to name passed. return index if present
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
                //return index of found name
            }
        }
        //return -1 if it wasn't found
        return -1;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
            //not found
        } else {

            this.myContacts.remove(foundPosition);
            return true;

            //returns true; found contact and removed it


        }

    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            //found so it returns element
            return contact.getName();
        } else {
            //not found, returns null
            return null;
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts(){

        System.out.println("Contact list");

        for(int i =0; i<this.myContacts.size(); i++){
            System.out.println((i+1)+ "."+
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

        //going through entire contact list printed name + pn
    }
}
