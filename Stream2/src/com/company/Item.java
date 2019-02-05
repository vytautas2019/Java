package com.company;

public class Item {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private ItemType type;

    public static Item foodItem(int id, String name, int price, int quantity) {
        return new Item(id, name, price, quantity, ItemType.FOOD);
    }

    public static Item electronicsItem(int id, String name, int price, int quantity) {
        return new Item(id, name, price, quantity, ItemType.ELECTRONICS);
    }

    public static Item bookItem(int id, String name, int price, int quantity) {
        return new Item(id, name, price, quantity, ItemType.BOOK);
    }

    public static Item clothingItem(int id, String name, int price, int quantity) {
        return new Item(id, name, price, quantity, ItemType.CLOTHING);
    }

    private Item(int id, String name, int price, int quantity, ItemType type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ItemType getType() {
        return type;
    }

    public enum ItemType {
        FOOD,
        ELECTRONICS,
        BOOK,
        CLOTHING
    }
}
