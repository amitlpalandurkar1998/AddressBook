package com.bridgelab.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DisplayANDstore displayANDstore = new DisplayANDstore();
        Scanner scanner = new Scanner(System.in);
        boolean exitContactList = true;

        System.out.println("Welcome to Address Book."+"\n");

        while (exitContactList){
            System.out.println("Enter '1' to Add a New contact.");
            System.out.println("Enter '2' to Display a contact.");
            System.out.println("Enter '3' to Edit a contact.");
            System.out.println("Enter '4' to Delete a contact.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("Enter the input : ");
            int input = scanner.nextInt();

            switch (input) {
                case 0 :
                    System.out.println("Exiting..............."+"\n");
                    exitContactList=false;
                    break;
                case 1 :
                    System.out.print("Enter First Name : ");
                    String firstName = scanner.next();

                    System.out.print("Enter Last Name : ");
                    String lastName = scanner.next();

                    System.out.print("Enter address: ");
                    String address = scanner.next();

                    System.out.print("Enter city: ");
                    String city = scanner.next();

                    System.out.print("Enter state: ");
                    String state = scanner.next();

                    System.out.print("Enter ZIP: ");
                    String zip = scanner.next();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();

                    System.out.print("Enter email: ");
                    String email = scanner.next();

                    Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
                    displayANDstore.addContact(contact);
                    break;
                case 2 :
                    displayANDstore.displayContact();
                    break;
                case 3 :
                    System.out.print("Enter the Name of that contact that you want to Edit : ");
                    String editorName = scanner.next();
                    displayANDstore.editContact(editorName);
                    break;
                case 4 :
                    System.out.print("Enter the Name of that contact that you want to Delete : ");
                    String deleteName = scanner.next();
                    displayANDstore.deleteContact(deleteName);
                    break;
                default:
                    System.out.println("Invalid....................!");
                    System.out.println("Please Enter The Valid Input."+"\n");
            }
        }
    }
}
