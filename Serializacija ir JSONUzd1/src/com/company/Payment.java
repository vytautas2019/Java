package com.company;

import java.io.Serializable;

public class Payment implements Serializable {
    private String paymentID;
    private int amount;
    private Sender sender;
    private Receiver receiver;

    public Payment(String paymentID, int amount, Sender sender, Receiver receiver) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.sender =  sender;
        this.receiver =  receiver;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public int getAmount() {
        return amount;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", amount=" + amount +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
