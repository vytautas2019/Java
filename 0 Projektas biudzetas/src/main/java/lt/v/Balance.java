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

    public  List<Record> getRecords() {
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
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
        for (int i = 0; i < this.categories.size(); i++) {
            System.out.println(String.format("|%-40s|",("    "+(i + 1) + ". " + categories.get(i))));
        }
        System.out.println(String.format("|%-40s|",("    "+(this.categories.size() + 1) + ". Exit")));
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
        System.out.println(String.format("|%-40s|","    Input number from menu..."));
        System.out.println(String.format("x%-40sx","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
    }

    public void setCategoriesAmount(int index, double value) {
        this.amounts.set(index, value);
        amount += value;
    }

    public void printInfo() {
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(String.format("|%-40s|",("    "+ categories.get(i) + " : " + amounts.get(i) + Currency.EUR)));
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

}




