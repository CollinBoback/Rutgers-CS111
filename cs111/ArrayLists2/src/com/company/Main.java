package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {

            System.out.println("\n Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutdown");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }


        }


    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added");
        } else {
            System.out.println("Cant add. Already on file.");
        }
        //addNewContact() boolean returns true if it gets added
    }

    private static void startPhone() {
        System.out.println("Phone started");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 -- to print contacts \n" +
                "2 -- to add a new contact \n" +
                "3 -- to update existing contact \n" +
                "4 -- to remove an existing contact \n" +
                "5 -- query if an existing contact \n" +
                "6 -- to print a list of actions");

        System.out.println("Choose your action: ");
    }

    private static void updateContact() {
        System.out.println("What contact would you like to update?");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter replacement: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated!");
        } else {
            System.out.println("Did not succeed");
        }


    }

    private static void removeContact() {
        System.out.println("What contact would you like to remove?");
        String name = scanner.nextLine();
        Contact contactToDelete = mobilePhone.queryContact(name);
        if (contactToDelete == null) {
            System.out.println("Not found");
            return;
        }

        mobilePhone.removeContact(contactToDelete);


    }

    private static void queryContact() {
        System.out.println("What contact would you like to remove?");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName()
                + " phone number is " + existingContactRecord.getPhoneNumber());


    }
}



