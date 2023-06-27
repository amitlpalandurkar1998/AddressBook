package com.bridgelab.addressbook;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Address Book.");

            System.out.println("Enter '1' to Add a contact.");

            System.out.print("Enter the input : ");
            int input = scanner.nextInt();

            if (input==1){
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

            }else {
                System.out.println("Invalid....................!");
            }

    }
}
