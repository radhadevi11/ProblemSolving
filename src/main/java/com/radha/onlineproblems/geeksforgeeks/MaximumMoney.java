package com.radha.onlineproblems.geeksforgeeks;

public class MaximumMoney {
    int getMaximumMoney(int noOfHouses, int amountInEachHouse) {
        return noOfHouses % 2 == 0 ? amountInEachHouse * (noOfHouses/2)
                : amountInEachHouse * (noOfHouses/2 + 1);
    }
}
