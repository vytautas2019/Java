package com.company;

public class Person {
    private int id;
    private String firstName;
    private String secondName;
    private  int receiveMoney;
    private  int sentMoney;

    public void setReceiveMoney(int receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public void setSentMoney(int sentMoney) {
        this.sentMoney = sentMoney;
    }

    public int getReceiveMoney() {
        return receiveMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", receiveMoney=" + receiveMoney +
                ", sentMoney=" + sentMoney +
                '}';
    }

    public Person(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

}
