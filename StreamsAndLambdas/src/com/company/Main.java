package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Transaction> transactions=Transaction.transactions(10);
        print(transactions);
        Predicate <Transaction>predicate=(Transaction a)->a.getId()%2==0;
        boolean test =predicate.test(transactions.get(0));
        List<Transaction> filteredTransaction= transactions.stream()
                .filter(predicate)
                .map(transaction -> new Transaction(transaction.getId(),
                        transaction.getDateTime(),
                        transaction.getAmount()*2))
                .collect(Collectors.toList());
        print(filteredTransaction);
        List<Transaction> filteredTransaction1= transactions.stream()
                .filter(predicate)
                .filter(transaction -> transaction.getAmount()>1008)
                .collect(Collectors.toList());
        print(filteredTransaction1);
        List<Transaction> filteredTransaction2= transactions.stream()
                .filter(predicate)
                .filter(transaction -> transaction.getAmount()>1008)
                .map(transaction -> new Transaction(transaction.getId(),
                        transaction.getDateTime(),
                        transaction.getAmount()*2))
                .collect(Collectors.toList());
        print(filteredTransaction2);
        Map<Integer,Integer> transactionMap=transactions.stream()
                .collect(Collectors.toMap(
                        transaction ->transaction.getId(),
                        transaction -> transaction.getAmount()

                )
                );
        print(transactionMap.entrySet());
        HashMap<Integer,String> skaiciai=new HashMap<>();
        skaiciai.put(1,"a");
        print(skaiciai.entrySet());




    }
    private  static void print (Collection values){
        for (Object object :values){
            System.out.println(object);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

}
