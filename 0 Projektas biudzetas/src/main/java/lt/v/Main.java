package lt.v;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Income income = new Income();
        Costs costs = new Costs();
        Balance balance = new Balance();
        Record record = new Record();


        ObjectMapper mapper1 = new ObjectMapper();
        File file1 = new File("Records.json");
        balance.records = mapper1.readValue(file1, new TypeReference<List<Record>>() {
        });

        Record maxId = balance.records.stream().max(Comparator.comparing(Record::getId)).get();
        Record.setIdSet(maxId.getId());
        for (Object o:balance.records) {
            System.out.println(o);

        }




        for (Record o : balance.records) {
            if (o.getFundsType().equals("Income")) {

                int index = 0;
                switch (o.getCategory()) {
                    case "Salary":
                        index = 0;
                        break;
                    case "Rent":
                        index = 1;
                        break;
                    case "Grant":
                        index = 2;
                        break;
                    case "Allowance":
                        index = 3;
                        break;
                    case "Investments":
                        index = 4;
                        break;
                    case "Gift":
                        index = 5;
                        break;
                    case "Legacy":
                        index = 6;
                        break;
                    case "Other":
                        index = 7;
                        break;
                }
                income.setCategoriesAmount(index, o.getAmount());

            } else {
                int index = 0;
                switch (o.getCategory()) {
                    case "Shops":
                        index = 0;
                        break;
                    case "Leasing":
                        index = 1;
                        break;
                    case "House":
                        index = 2;
                        break;
                    case "Studies":
                        index = 3;
                        break;
                    case "Fun":
                        index = 4;
                        break;
                    case "Car":
                        index = 5;
                        break;
                    case "Travel":
                        index = 6;
                        break;
                    case "Health":
                        index = 7;
                        break;
                    case "Other":
                        index = 8;
                        break;
                }
                costs.setCategoriesAmount(index, o.getAmount());
            }

        }

        while (true) {
            spausdintiMeniu();
            Scanner scanner = new Scanner(System.in);
            int choice;
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    income.printCategories();
                    int choice2 = scanner.nextInt();
                    while (choice2 > 0 && choice2 < income.categories.size()+1) {
                        System.out.println("Input "+income.getCategoriesValue(choice2-1)+ " amount: ");
                        double choice3 = scanner.nextDouble();
                        income.setCategoriesAmount(choice2 - 1, choice3);
                        balance.records.add(new Record(choice3, "Income", income.getCategoriesValue(choice2 - 1)));
                        income.printCategories();
                        choice2 = scanner.nextInt();
                    }

                    break;
                case 2:
                    costs.printCategories();
                    choice2 = scanner.nextInt();
                    while (choice2 > 0 && choice2 < costs.categories.size()+1) {
                        System.out.println("Input "+costs.getCategoriesValue(choice2-1)+ " amount: ");
                        double choice3 = scanner.nextDouble();
                        costs.setCategoriesAmount(choice2 - 1, choice3);
                        balance.records.add(new Record(choice3, "Costs", costs.getCategoriesValue(choice2 - 1)));
                        costs.printCategories();
                        choice2 = scanner.nextInt();
                    }
                    break;
                case 3:
                    record.printCategories();
                    int choice32 = scanner.nextInt();
                    while (choice32 > 0 && choice32 < record.categories.size()) {

                        switch (choice32) {
                            case 1:
                                System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
                                System.out.println(String.format("|%-40s|","    Balance"));
                                System.out.println(String.format("-%-40s-","----------------------------------------"));
//                                income.printInfo();
//                                System.out.println(String.format("-%-40s-","----------------------------------------"));
//                                costs.printInfo();
//                                System.out.println(String.format("-%-40s-","----------------------------------------"));
                                System.out.println(String.format("|%-40s|",("    Income total: " + income.getAmount() + Currency.EUR)));
                                System.out.println(String.format("|%-40s|",("    Costs total: " + costs.getAmount() + Currency.EUR)));
                                System.out.println(String.format("-%-40s-","----------------------------------------"));
                                System.out.println(String.format("|%-40s|",("    Balance total:" + (income.getAmount() - costs.getAmount()) + Currency.EUR )));
                                System.out.println(String.format("-%-40s-","----------------------------------------"));
                                break;
                        }
                        record.printCategories();
                        choice32 = scanner.nextInt();
                    }
                    break;
//
                case 4:
                    ObjectMapper mapper = new ObjectMapper();
                    File file = new File("Records.json");
                    mapper.writeValue(file, balance.getRecords());

                    System.exit(0);
            }
        }
    }

    public static void spausdintiMeniu() {
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
        System.out.println(String.format("|%-40s|","    1. Input income info"));
        System.out.println(String.format("|%-40s|","    2. Input costs info"));
        System.out.println(String.format("|%-40s|","    3. Records info"));
        System.out.println(String.format("|%-40s|","    4. Exit"));
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
        System.out.println(String.format("|%-40s|","    Input number from menu..."));
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));



    }

}