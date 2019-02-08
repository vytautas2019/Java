package com.company;

public class Recipient {

    private long id;
    private String email;
    private String phoneNumber;


    private Recipient(long id, String email, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static Recipient withEmail(long id, String email) {
        return new Recipient(id, email, null);
    }

    public static Recipient withPhoneNumber(long id, String phoneNumber) {
        return new Recipient(id, null, phoneNumber);
    }

    public static Recipient withEmailAndNumber(long id, String email, String phoneNumber) {
        return new Recipient(id, email, null);
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
