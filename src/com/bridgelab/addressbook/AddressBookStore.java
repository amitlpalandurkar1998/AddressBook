package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookStore {
    private String NAME_ADDRESS_BOOK;
    private List CONTACTS_STORE;

    AddressBookStore(String nameAddressBook,ArrayList contactsStore){
        this.NAME_ADDRESS_BOOK = nameAddressBook;
        this.CONTACTS_STORE = contactsStore;
    }

    public String getNAME_ADDRESS_BOOK() {
        return NAME_ADDRESS_BOOK;
    }

    public void setNAME_ADDRESS_BOOK(String NAME_ADDRESS_BOOK) {
        this.NAME_ADDRESS_BOOK = NAME_ADDRESS_BOOK;
    }

    public List getCONTACTS_STORE() {
        return CONTACTS_STORE;
    }

    public void setCONTACTS_STORE(List CONTACTS_STORE) {
        this.CONTACTS_STORE = CONTACTS_STORE;
    }

    @Override
    public String toString() {
        return "\nName of Address Book : "+NAME_ADDRESS_BOOK+"\n"+
                "Contact List : "+CONTACTS_STORE+"\n";
    }
}
