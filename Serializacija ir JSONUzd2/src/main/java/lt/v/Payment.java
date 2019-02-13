package lt.v;

import java.io.Serializable;

public class Payment implements Serializable {
    private String paymentID;
    private int amount;
    private Sender sender;
    private Receiver receiver;

    public Payment() {
    }

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

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
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
