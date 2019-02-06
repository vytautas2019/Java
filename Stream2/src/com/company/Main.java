package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ShopService service = new DefaultShopService() ;
        print(service.getAllShops());
        System.out.println((service.getShopById(2,()->new ShopView(2,"new shop"))));
        System.out.println((service.getShopById(22,()->new ShopView(22,"new shop"))));






    }
    private static void print (Collection values){
        for (Object o:values){
            System.out.println(o);

        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
