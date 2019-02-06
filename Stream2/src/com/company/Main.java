package com.company;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static com.company.Item.ItemType.FOOD;

public class Main {

    public static void main(String[] args) {
        ShopService service = new DefaultShopService() ;
        print(service.getAllShops());
        System.out.println((service.getShopById(2,()->new ShopView(2,"new shop"))));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        print(service.getShopsEmployees(2));
        print(service.getAllEmployees());
        print(service.getEmployeesWithSalaryBetween(5,10000));
        print(service.getItemsByType(FOOD));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println((service.getCheapestItem()));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println((service.getMostExpensiveItem()));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        print(service.getItemsByType(Item.ItemType.BOOK));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(service.getAllItemsPrice());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(service.totalPayToEmployees(2));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        print(service.findItemBy(item -> item.getPrice() >100));


    }
    private static void print (Collection values){
        for (Object o:values){
            System.out.println(o);

        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
