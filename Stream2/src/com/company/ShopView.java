package com.company;

public class ShopView {
    private int id;
    private String name;

    public ShopView(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ShopView{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
