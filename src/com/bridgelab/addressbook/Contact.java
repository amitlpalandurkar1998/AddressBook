package com.bridgelab.addressbook;

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
        return  "\nFirst Name : "+ FIRSTNAME +"\n"+
                "Last Name : "+ LASTNAME +"\n"+
                "Address : "+ ADDRESS + "\n"+
                "City : "+CITY+"\n"+
                "State : "+STATE+"\n"+
                "Phone Number : "+PHONE_NUM+"\n"+
                "Email : "+ EMAIL;
    }
}