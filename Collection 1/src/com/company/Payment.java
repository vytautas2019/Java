package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Payment {

    private long paymentId;
    private String text;
    private String recipientId;
    private String senderId;

    public Payment(long paymentId, String text, String recipientId, String senderId) {
        this.paymentId = paymentId;
        this.text = text;
        this.recipientId = recipientId;
        this.senderId = senderId;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public String getText() {
        return text;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public String getSenderId() {
        return senderId;
    }

    public static List<Payment> getRandomPayments(int numbers) {
        String[] texts =
                {"Mokejimas", "Payment", "Skola", "Mokesciai",
                        "Pasalpa", "Mokjejimai", "aaaaa"};
        List<Payment> payments = new ArrayList<>(numbers);
        for (int i = 0; i < numbers; i++) {
            long paymentId = System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(11, 100);
            int index = ThreadLocalRandom.current().nextInt(0, texts.length);
            String text = texts[index];
            String recipientId = UUID.randomUUID().toString();
            String senderId = UUID.randomUUID().toString();
            payments.add(new Payment(paymentId, text, recipientId, senderId));
        }
        return payments;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", text='" + text + '\'' +
                ", recipientId='" + recipientId + '\'' +
                ", senderId='" + senderId + '\'' +
                '}';
    }
}
