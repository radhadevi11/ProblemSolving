package com.radha.onlineproblems.geeksforgeeks;

public class GeekAndCoffeeShop {
    int getUnitOfCoffeeAtMthUnit(int totalAmountOfCoffee, int m) {
        for(int i = 1; i < m; i++) {
            totalAmountOfCoffee /= 2;
            if(totalAmountOfCoffee == 0) {
                return 0;
            }
        }
        return totalAmountOfCoffee;
    }
}
