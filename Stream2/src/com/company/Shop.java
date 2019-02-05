package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int id;
    private String name;
    private List<Item> merchandise = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Item> getMerchandise() {
        return merchandise;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addItem(Item item) {
        merchandise.add(item);
    }
}
