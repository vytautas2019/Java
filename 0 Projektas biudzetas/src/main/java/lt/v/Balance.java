package lt.v;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Balance {

    protected double amount;
    protected ArrayList<String> categories = new ArrayList<>();
    protected ArrayList<Double> amounts = new ArrayList<>();
    protected List<Record> records = new ArrayList<>();


    public ArrayList<String> getCategories() {
        return categories;
    }


    public ArrayList getAmounts() {
        return amounts;
    }

    protected   List<Record> getRecords() {
        return records;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public void setAmounts(ArrayList<Double> amounts) {
        this.amounts = amounts;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }


    public double getAmount() {
        return amount;
    }

    public Balance() {
    }

    public void printCategories() {
        System.out.println(String.format("x%-200sx", "x".repeat(200)));
        for (int i = 0; i < this.categories.size(); i++) {
            System.out.println(String.format("|%-200s|",("    "+(i + 1) + ". " + categories.get(i))));
        }
        System.out.println(String.format("|%-200s|",("    "+(this.categories.size() + 1) + ". Exit")));
        System.out.println(String.format("x%-200sx", "x".repeat(200)));
        System.out.println(String.format("|%-200s|","    Input number from menu..."));
        System.out.println(String.format("x%-200sx", "x".repeat(200)));
    }

    public void setCategoriesAmount(int index, double value) {
        this.amounts.set(index, value);
        amount += value;
    }

    public void printInfo() {
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(String.format("|%-200s|",("    "+ categories.get(i) + " : " + amounts.get(i) + Currency.EUR)));
        }
    }

    public String getCategoriesValue(int index) {
        return this.categories.get(index);
    }

    public  void saveToFileJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("Records.json");
        mapper.writeValue(file,getRecords());
    }
    public  void printAllRecords(){
//        System.out.println(String.format("x%-200sx", "x".repeat(200)));
        for (Object o : getRecords()) {
            System.out.println(String.format("|%-200s|", ("   " + o)));

        }
    }



}




