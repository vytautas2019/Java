package lt.v;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

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
                    while (choice2 > 0 && choice2 < income.categories.size() + 1) {
                        System.out.println("Input " + income.getCategoriesValue(choice2 - 1) + " amount: ");
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
                    while (choice2 > 0 && choice2 < costs.categories.size() + 1) {
                        System.out.println("Input " + costs.getCategoriesValue(choice2 - 1) + " amount: ");
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
                    while (choice32 > 0 && choice32 < record.categories.size() + 1) {

                        switch (choice32) {
                            case 1:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Balance"));
                                System.out.println(String.format("-%-200s-", "-".repeat(200)));
                                System.out.println(String.format("|%-200s|", ("    Income total: " + income.getAmount() + Currency.EUR)));
                                System.out.println(String.format("|%-200s|", ("    Costs total: " + costs.getAmount() + Currency.EUR)));
                                System.out.println(String.format("-%-200s-", "-".repeat(200)));
                                System.out.println(String.format("|%-200s|", ("    Balance total:" + (income.getAmount() - costs.getAmount()) + Currency.EUR)));
                                System.out.println(String.format("-%-200s-", "-".repeat(200)));
                                break;
                            case 2:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Edit record"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                for (Object o : balance.records) {
                                    System.out.println(String.format("|%-200s|", ("   " + o)));

                                }
                                System.out.println(String.format("|%-200s|", "    Input number of edited record..."));
                                int choice21 = scanner.nextInt();
                                System.out.println(String.format("|%-200s|", "    Input amount of edited record..."));
                                int choice22 = scanner.nextInt();
                                balance.records.get(choice21-1).setAmount(choice22);
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                for (Object o : balance.records) {
                                    System.out.println(String.format("|%-200s|", ("   " + o)));
                                }

                                balance.saveToFileJson();



                                break;
                            case 3:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Erase record"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                for (Object o : balance.records) {
                                    System.out.println(String.format("|%-200s|", ("   " + o)));

                                }
                                System.out.println(String.format("|%-200s|", "    Input number of edited record..."));
                                int choice331 = scanner.nextInt();
                                balance.records.get(choice331-1).setAmount(0);
                                for (Object o : balance.records) {
                                    System.out.println(String.format("|%-200s|", ("   " + o)));

                                }
                                balance.saveToFileJson();




                                break;
                            case 4:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Record by dates"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Input start date"));
                                String dateStart = scanner.next();
                                LocalDate localDate=LocalDate.parse(dateStart);
                                LocalDateTime d1 =LocalDateTime.of(localDate, LocalTime.MIN);

                                System.out.println(String.format("|%-200s|", "    Input end date"));
                                String date2 = scanner.next();
                                LocalDate localDate2=LocalDate.parse(date2);
                                LocalDateTime d2 =LocalDateTime.of(localDate2, LocalTime.MIN);


                                Map<String, Double> categoryAmmountsByDates = balance.records.stream()
                                        .filter(r-> r.getFundsType().equals("Income"))
                                        .filter(date->date.getTime().isAfter(d1)&& date.getTime().isBefore(d2))
                                        .collect(Collectors.groupingBy(Record::getCategory, Collectors.summingDouble(Record::getAmount)));
                                List<Map.Entry<String, Double>> sortedCategories1 = categoryAmmountsByDates.entrySet().stream()
                                        .sorted((v1, v2) -> v2.getValue() > v1.getValue() ? 1 : v2.getValue().equals(v1.getValue()) ? 0 : -1)
                                        .collect(Collectors.toList());
                                System.out.println(String.format("|%-200s|", ("    Income summary: "+sortedCategories1)));

                                Map<String, Double> categoryAmmountsByDates1 = balance.records.stream()
                                        .filter(r-> r.getFundsType().equals("Costs"))
                                        .filter(date->date.getTime().isAfter(d1)&& date.getTime().isBefore(d2))
                                        .collect(Collectors.groupingBy(Record::getCategory, Collectors.summingDouble(Record::getAmount)));
                                List<Map.Entry<String, Double>> sortedCategories2 = categoryAmmountsByDates1.entrySet().stream()
                                        .sorted((v1, v2) -> v2.getValue() > v1.getValue() ? 1 : v2.getValue().equals(v1.getValue()) ? 0 : -1)
                                        .collect(Collectors.toList());
                                System.out.println(String.format("|%-200s|", ("    Costs summary: "+sortedCategories2)));


                                break;
                            case 5:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Record by income"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                Map<String, Double> categoryAmmountsIncome = balance.records.stream()
                                        .filter(r-> r.getFundsType().equals("Income"))
                                        .collect(Collectors.groupingBy(Record::getCategory, Collectors.summingDouble(Record::getAmount)));
                                List<Map.Entry<String, Double>> sortedCategories = categoryAmmountsIncome.entrySet().stream()
                                        .sorted((v1, v2) -> v2.getValue() > v1.getValue() ? 1 : v2.getValue().equals(v1.getValue()) ? 0 : -1)
                                        .collect(Collectors.toList());
                                System.out.println(String.format("|%-200s|", ("    "+sortedCategories)));


                                break;
                            case 6:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    Record by costs"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                Map<String, Double> categoryAmmountsCosts = balance.records.stream()
                                        .filter(r-> r.getFundsType().equals("Costs"))
                                        .collect(Collectors.groupingBy(Record::getCategory, Collectors.summingDouble(Record::getAmount)));
                                List<Map.Entry<String, Double>> sortedCategoriesCosts = categoryAmmountsCosts.entrySet().stream()
                                        .sorted((v1, v2) -> v2.getValue() > v1.getValue() ? 1 : v2.getValue().equals(v1.getValue()) ? 0 : -1)
                                        .collect(Collectors.toList());
                                System.out.println(String.format("|%-200s|", ("    "+sortedCategoriesCosts)));


                                break;
                            case 7:
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                System.out.println(String.format("|%-200s|", "    All records"));
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));
                                for (Object o : balance.records) {
                                    System.out.println(String.format("|%-200s|", ("   " + o)));

                                }
                                System.out.println(String.format("x%-200sx", "x".repeat(200)));


                                break;
                        }
                        record.printCategories();
                        choice32 = scanner.nextInt();
                    }
                    break;

                case 4:
                    balance.saveToFileJson();
//                    ObjectMapper mapper = new ObjectMapper();
//                    File file = new File("Records.json");
//                    mapper.writeValue(file, balance.getRecords());

                    System.exit(0);
            }
        }
    }

    public static void spausdintiMeniu() {
        System.out.println(String.format("x%-200sx", "x".repeat(200)));
        System.out.println(String.format("|%-200s|", "    1. Input income info"));
        System.out.println(String.format("|%-200s|", "    2. Input costs info"));
        System.out.println(String.format("|%-200s|", "    3. Records info"));
        System.out.println(String.format("|%-200s|", "    4. Exit"));
        System.out.println(String.format("x%-200sx", "x".repeat(200)));
        System.out.println(String.format("|%-200s|", "    Input number from menu..."));
        System.out.println(String.format("x%-200sx", "x".repeat(200)));


    }


}