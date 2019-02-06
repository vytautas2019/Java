package com.company;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface ShopService {

    List<ShopView> getAllShops();

    ShopView getShopById(int shopId, Supplier<ShopView> defaultValue);

    List<Employee> getShopsEmployees(int shopId);

    List<Employee> getAllEmployees();

    List<Employee> getEmployeesWithSalaryBetween(int salaryLow, int salaryMax);

    List<Item> getItemsByType(Item.ItemType type);

    Item getCheapestItem();

    Item getMostExpensiveItem();

    Map<Item.ItemType, List<Item>> getItemsGroupedByType();

    List<Item> findItemBy(Predicate<Item> condition);

    /**
     * sum for quantity * price of each item
     *
     * @return total price
     */
    int getAllItemsPrice();

    /**
     * Calculate amount of money needed to pay salary for every employee for specified shop
     *
     * @param shopId shop id
     * @return amount to pay every employees salary
     */
    int totalPayToEmployees(int shopId);


}
