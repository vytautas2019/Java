package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sender asmuo1 = new Sender("Vardis", "Pavardis");
        Receiver asmuo2 = new Receiver("Jonas", "Jonaitis");
        Payment payment = new Payment("125", 777, asmuo1, asmuo2);

        FileOutputStream fileOutputStream = new FileOutputStream("pavedimo_failas.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(payment);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("pavedimo_failas.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Payment paymentFile = (Payment) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(paymentFile.getPaymentID());
        System.out.println(paymentFile.getAmount());

        System.out.println(paymentFile.getSender());
        System.out.println(paymentFile.getReceiver());


    }
}
