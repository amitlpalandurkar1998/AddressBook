package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String FIRSTNAME;
    private String LASTNAME;
    private String ADDRESS;
    private String CITY;
    private String STATE;
    private String ZIP;
    private String PHONE_NUM;
    private String EMAIL;

    public Contact(String firstName, String lastName,
                   String address, String city, String state,
                   String zip, String phoneNumber, String email) {
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.ADDRESS = address;
        this.CITY = city;
        this.STATE = state;
        this.ZIP = zip;
        this.PHONE_NUM = phoneNumber;
        this.EMAIL = email;


    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public String getPHONE_NUM() {
        return PHONE_NUM;
    }

    public void setPHONE_NUM(String PHONE_NUM) {
        this.PHONE_NUM = PHONE_NUM;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }


    @Override
    public String toString() {
        return  "Name : "+ FIRSTNAME +" "+ LASTNAME +"\n"+
                "Address : "+ ADDRESS + "\n"+
                "City : "+CITY+"\n"+
                "State : "+STATE+"\n"+
                "Phone Number : "+PHONE_NUM+"\n"+
                "Email : "+ EMAIL;
    }
}
class DisplayANDstore {

    private final List<Contact> contactsStore;

    public DisplayANDstore() {
        contactsStore = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contactsStore.add(contact);
    }

    public void displayContact(){
        for (Contact contact : contactsStore) {
            System.out.println(contact);
            System.out.println();
        }
    }

    public void editContact(String editorName){
        Scanner scanner = new Scanner(System.in);
        for (Contact contact : contactsStore){
            if(contact.getFIRSTNAME().equals(editorName)){

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

                System.out.println("Edit Successfully. ");
                break;
            }else {
                System.out.println("Contact Not Found............!");
                System.out.print("Try One More Time. Enter the Name : ");
                String editorNameNextChance = scanner.next();
                editContact(editorNameNextChance);
            }
        }
    }

}
public class AddressBook {

    public static void main(String[] args) {
        DisplayANDstore displayANDstore = new DisplayANDstore();
        Scanner scanner = new Scanner(System.in);
        boolean exitContactList = true;

        System.out.println("Welcome to Address Book.");

        while (exitContactList){
            System.out.println("Enter '1' to Add a New contact.");
            System.out.println("Enter '2' to Display a contact.");
            System.out.println("Enter '3' to Edit a contact.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("Enter the input : ");
            int input = scanner.nextInt();

            switch (input) {
                case 0 :
                        System.out.println("Exiting...............");
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
                        System.out.print("Enter the Name : ");
                        String editorName = scanner.next();
                        displayANDstore.editContact(editorName);
                    break;
                default:
                    System.out.println("Invalid....................!");
                    System.out.println("Please Enter The Valid Input.");
            }
        }

    }
}