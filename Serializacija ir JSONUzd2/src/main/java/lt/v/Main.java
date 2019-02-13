package lt.v;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sender asmuo1 = new Sender("Vardis", "Pavardis");
        Receiver asmuo2 = new Receiver("Jonas", "Jonaitis");
        Payment payment = new Payment("125", 777, asmuo1, asmuo2);
        Payment payment1 = new Payment("222",4587,asmuo1,asmuo2);
        List<Payment> pavedimuList = new ArrayList<Payment>();
        pavedimuList.add(payment);
        pavedimuList.add(payment1);
        ObjectMapper mapper3 = new ObjectMapper();

        String jsonpavedimai = mapper3.writeValueAsString(pavedimuList);
        System.out.println(jsonpavedimai);


//        ObjectMapper mapper = new ObjectMapper();
//        File file = new File("Pavedimas.json");
//        mapper.writeValue(file, payment);
//
//        ObjectMapper mapper2 = new ObjectMapper();
//        File file2 = new File("Pavedimas.json");
//        Payment paymentIsJsonFailo = mapper2.readValue(file2, Payment.class);
//
//        System.out.println(paymentIsJsonFailo.getPaymentID());
//        System.out.println(paymentIsJsonFailo.getAmount());
//        System.out.println(paymentIsJsonFailo.getSender());
//        System.out.println(paymentIsJsonFailo.getReceiver());


//        FileOutputStream fileOutputStream = new FileOutputStream("pavedimo_failas.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(payment);
//        objectOutputStream.flush();
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("pavedimo_failas.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Payment paymentFile = (Payment) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println(paymentFile.getPaymentID());
//        System.out.println(paymentFile.getAmount());
//        System.out.println(paymentFile.getSender());
//        System.out.println(paymentFile.getReceiver());


    }
}

