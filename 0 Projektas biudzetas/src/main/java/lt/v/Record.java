package lt.v;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Record extends Balance {
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime time;
    private int id;
    private double amount;
    private String fundsType;
    private String category;
    static int idSet = 0;

    public Record(){
        categories.add("Balance info");
        categories.add("Edit record");
        categories.add("Erase record");
        categories.add("Records by dates");
        categories.add("Records by income");
        categories.add("Records by costs");
        categories.add("All records");


        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);


        amount = 0;
    }

    public Record(double amount, String fundsType, String category) {
        this.time = LocalDateTime.now();
        this.id = ++idSet;
        this.amount = amount;
        this.fundsType = fundsType;
        this.category = category;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getFundsType() {
        return fundsType;
    }

    public String getCategory() {
        return category;
    }

    public static int getIdSet() {
        return idSet;
    }

    @Override
    public String toString() {
        return "Record "+id+"{" +
                "time=" + time +
                ", id=" + id +
                ", amount=" + amount +
                ", fundsType='" + fundsType + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
    @Override
    public void printInfo() {
        System.out.println(String.format("|%-40s|","    Records"));
        super.printInfo();
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFundsType(String fundsType) {
        this.fundsType = fundsType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void setIdSet(int idSet) {
        Record.idSet = idSet;
    }

}