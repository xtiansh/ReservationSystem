package com.YuyangPackage;

public class Client {

    public Client(Integer clientID, String firstName, String lastName) {
        ClientID = clientID;
        FirstName = firstName;
        LastName = lastName;
    }


    public Integer getClientID() {
        return ClientID;
    }

    public void setClientID(Integer clientID) {
        ClientID = clientID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    private Integer ClientID;
    private String FirstName;
    private String LastName;

}
