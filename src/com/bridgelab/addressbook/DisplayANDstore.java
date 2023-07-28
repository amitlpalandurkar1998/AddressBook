package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class DisplayANDstore {
    List<AddressBookStore> addressBookStoresList = new ArrayList<>();
    private final List<Contact> contactsStore;
    Scanner scanner = new Scanner(System.in);

    public DisplayANDstore() {
        contactsStore = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactsStore.add(contact);
    }

    public void displayContact() {
        System.out.println("-----------------------------------------------");
        if (!contactsStore.isEmpty()) {
            for (Contact contact : contactsStore) {
                System.out.println(contact);
                System.out.println();
            }
        } else {
            System.out.println("no data found . data base is Empty." + "\n");
        }
        System.out.println("-----------------------------------------------");
    }

    public void editContact(String editorName) {//This Method is used to Edit Contact.
        boolean isNotFount = true;
        if (editorName != null) {
            for (Contact contact : contactsStore) {
                if (contact.getFIRSTNAME().equals(editorName)) {

                    System.out.println("Contact Found ......" + "\n");
                    isNotFount = false;
                    System.out.println("Enter the Information That you Want to edit.");

                    System.out.print("Enter First Name : ");
                    String edit_firstName = scanner.next();
                    contact.setFIRSTNAME(edit_firstName);

                    System.out.print("Enter Last Name : ");
                    String edit_lastName = scanner.next();
                    contact.setLASTNAME(edit_lastName);

                    System.out.print("Enter address: ");
                    String edit_address = scanner.next();
                    contact.setADDRESS(edit_address);

                    System.out.print("Enter city: ");
                    String edit_city = scanner.next();
                    contact.setCITY(edit_city);

                    System.out.print("Enter state: ");
                    String edit_state = scanner.next();
                    contact.setSTATE(edit_state);

                    System.out.print("Enter ZIP: ");
                    String edit_zip = scanner.next();
                    contact.setZIP(edit_zip);

                    System.out.print("Enter phone number: ");
                    String edit_phoneNumber = scanner.next();
                    contact.setPHONE_NUM(edit_phoneNumber);

                    System.out.print("Enter email: ");
                    String edit_email = scanner.next();
                    contact.setEMAIL(edit_email);

                    System.out.println("Edit Successfully. " + "\n");
                    edit_email = null;
                    break;
                }
            }
            if (isNotFount) {
                System.out.println("Contact Not Found............!" + "\n");
                editorName = null;
            }
        } else {
            System.out.println("You Not Enter the Valid Input." + "\n");
            editorName = null;
        }
    }

    public void deleteContact(String deleteName) {//This Method is used to delete contact.
        boolean isNotFount = true;
        for (Contact contact : contactsStore) {
            if (contact.getFIRSTNAME().equals(deleteName)) {
                contactsStore.remove(contact);
                System.out.println("Contact Deleted Successfully." + "\n");
                isNotFount = false;
                break;
            }
        }
        if (isNotFount) {
            System.out.println("Contact Not Found............!" + "\n");
        }
    }

    boolean isAddressBookNameUnique(String nameAddressBook) {
        return addressBookStoresList.stream().noneMatch(e -> e.getNAME_ADDRESS_BOOK().toLowerCase().equals(nameAddressBook.toLowerCase()));
    }

    void uniqueNameAddressBook() {//This Method is used to create address book With the Unique Name.
        DisplayANDstore displayANDstore = new DisplayANDstore();
        boolean exitContactList = true;

        String nameAddressBook;
        do {
            System.out.print("Enter the Name Of Address Book : ");
            nameAddressBook = scanner.next();
            if (!isAddressBookNameUnique(nameAddressBook)) {
                System.out.println("Address Book with the same name already exists. Please enter a new unique name.");
                System.out.println();
            }
        } while (!isAddressBookNameUnique(nameAddressBook));

        System.out.println("\nWelcome to '" + nameAddressBook + "' Address Book." + "\n");

        while (exitContactList) {
            System.out.println("Enter '1' to Add a New contact.");
            System.out.println("Enter '2' to Display a contact.");
            System.out.println("Enter '3' to Edit a contact.");
            System.out.println("Enter '4' to Delete a contact.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("\nEnter the input : ");
            int input = scanner.nextInt();

            switch (input) {
                case 0:
                    System.out.println("Exiting..............." + "\n");
                    exitContactList = false;
                    break;
                case 1:
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

                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    displayANDstore.addContact(contact);
                    break;
                case 2:
                    displayANDstore.displayContact();
                    break;
                case 3:
                    System.out.print("Enter the Name of that contact that you want to Edit : ");
                    String editorName = scanner.next();
                    displayANDstore.editContact(editorName);
                    break;
                case 4:
                    System.out.print("Enter the Name of that contact that you want to Delete : ");
                    String deleteName = scanner.next();
                    displayANDstore.deleteContact(deleteName);
                    break;
                default:
                    System.out.println("Invalid....................!");
                    System.out.println("Please Enter The Valid Input." + "\n");
            }
        }
        AddressBookStore addressBookStore = new AddressBookStore(nameAddressBook, (ArrayList) contactsStore);
        addressBookStoresList.add(addressBookStore);
    }

    void firstPage() {//This Method is used to display First page.
        while (true) {
            System.out.println("Enter '1' to Create New Address Book.");
            System.out.println("Enter '2' to Display a Address Book.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("Enter the input : ");
            int input = scanner.nextInt();

            switch (input) {
                case 0:
                    exit();
                    break;
                case 1:
                    uniqueNameAddressBook();
                    break;
                case 2:
                    displayAddressBook();
                    break;
                default:
                    break;
            }
        }
    }

    void displayAddressBook() {
        System.out.println("-----------------------------------------------");
        if (!addressBookStoresList.isEmpty()) {
            for (AddressBookStore addressBookStore : addressBookStoresList) {
                System.out.println(addressBookStore);
                System.out.println();
            }
        } else {
            System.out.println("no data found . data base is Empty." + "\n");
        }
        System.out.println("-----------------------------------------------");
    }

    void exit() {//This Method is used to exit from project.
        System.out.println("Thank You.........................");
    }
}