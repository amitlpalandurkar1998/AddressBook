package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DisplayANDstore {

    private final List<Contact> contactsStore;

    public DisplayANDstore() {
        contactsStore = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contactsStore.add(contact);
    }

    public void displayContact(){
        System.out.println("-----------------------------------------------");
        if (!contactsStore.isEmpty()){
            for (Contact contact : contactsStore) {
                System.out.println(contact);
                System.out.println();
            }
        }else {
            System.out.println("no data found . data base is Empty."+"\n");
        }
        System.out.println("-----------------------------------------------");
    }

    public void editContact(String editorName){
        Scanner scanner = new Scanner(System.in);
        boolean isNotFount = true;
        if (editorName!=null) {
            for (Contact contact : contactsStore) {
                if (contact.getFIRSTNAME().equals(editorName)) {

                    System.out.println("Contact Found ......" + "\n");
                    isNotFount=false;
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

                    System.out.println("Edit Successfully. "+"\n");
                    edit_email = null;
                    break;
                }
            }
            if (isNotFount){
                System.out.println("Contact Not Found............!"+"\n");
                editorName=null;
            }
        } else {
            System.out.println("You Not Enter the Valid Input."+"\n");
            editorName = null;
        }
    }

    public void deleteContact(String deleteName) {
        boolean isNotFount = true;
        for (Contact contact : contactsStore){
            if (contact.getFIRSTNAME().equals(deleteName)){
                contactsStore.remove(contact);
                System.out.println("Contact Deleted Successfully."+"\n");
                isNotFount=false;
                break;
            }
        }
        if (isNotFount){
            System.out.println("Contact Not Found............!"+"\n");
        }
    }
}
