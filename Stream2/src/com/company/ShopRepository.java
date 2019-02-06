package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository {

    private static final List<Shop> shops = new ArrayList<>();

    static {
        Employee employee1 = new Employee(1, "Tomas", 1100);
        Employee employee2 = new Employee(2, "Jonas", 1300);
        Employee employee3 = new Employee(3, "Petras", 1100);
        Employee employee4 = new Employee(4, "Justas", 1500);
        Employee employee5 = new Employee(2, "Tadas", 900);
        Employee employee6 = new Employee(6, "Ona", 1400);
        Employee employee7 = new Employee(7, "Justina", 1300);
        Employee employee8 = new Employee(7, "Toma", 1000);

        Item book1 = Item.bookItem(1, "Effective java", 30, 5);
        Item book2 = Item.bookItem(2, "Java in action", 24, 9);
        Item book3 = Item.bookItem(2, "Shining", 20, 12);
        Item book4 = Item.bookItem(4, "War and peace", 22, 7);
        Item book5 = Item.bookItem(3, "Cooking for dummies", 18, 1);
        Item book6 = Item.bookItem(1, "It", 16, 4);

        Item clothing1 = Item.clothingItem(1, "Jeans", 100, 4);
        Item clothing2 = Item.clothingItem(2, "Shirt", 60, 3);
        Item clothing3 = Item.clothingItem(4, "Sweater", 60, 4);
        Item clothing4 = Item.clothingItem(6, "Cap", 30, 5);
        Item clothing5 = Item.clothingItem(7, "Pants", 120, 4);
        Item clothing6 = Item.clothingItem(8, "Shorts", 90, 4);

        Item electronics1 = Item.electronicsItem(8, "Xbox", 300, 2);
        Item electronics2 = Item.electronicsItem(9, "Playstation", 320, 2);
        Item electronics3 = Item.electronicsItem(10, "Dell laptop", 1000, 6);
        Item electronics4 = Item.electronicsItem(11, "iPhone", 600, 8);

        Item food1 = Item.foodItem(10, "Cheese", 5, 20);
        Item food2 = Item.foodItem(11, "Bread", 4, 30);
        Item food3 = Item.foodItem(12, "Vine", 7, 35);
        Item food4 = Item.foodItem(13, "Ham", 2, 10);
        Item food5 = Item.foodItem(14, "Milk", 2, 15);

        Shop electronicsShop = new Shop(1, "Euronics");
        electronicsShop.addItem(electronics1);
        electronicsShop.addItem(electronics2);
        electronicsShop.addItem(electronics3);
        electronicsShop.addItem(electronics4);
        electronicsShop.addEmployee(employee1);
        electronicsShop.addEmployee(employee2);

        Shop clothesShop = new Shop(2, "Apranga");
        clothesShop.addItem(clothing1);
        clothesShop.addItem(clothing2);
        clothesShop.addItem(clothing3);
        clothesShop.addItem(clothing4);
        clothesShop.addItem(clothing5);
        clothesShop.addItem(clothing6);
        clothesShop.addEmployee(employee3);
        clothesShop.addEmployee(employee4);


        Shop bookShop = new Shop(3, "Vaga");
        bookShop.addItem(book1);
        bookShop.addItem(book2);
        bookShop.addItem(book3);
        bookShop.addItem(book4);
        bookShop.addItem(book5);
        bookShop.addItem(book6);
        bookShop.addEmployee(employee5);
        bookShop.addEmployee(employee6);

        Shop foodShop = new Shop(4, "Rimi");
        foodShop.addItem(food1);
        foodShop.addItem(food2);
        foodShop.addItem(food3);
        foodShop.addItem(food4);
        foodShop.addItem(food5);
        foodShop.addEmployee(employee7);
        foodShop.addEmployee(employee8);

        shops.add(electronicsShop);
        shops.add(foodShop);
        shops.add(clothesShop);
        shops.add(bookShop);
    }

    public static List<Shop> getShops() {
        return new ArrayList<>(shops);
    }
}