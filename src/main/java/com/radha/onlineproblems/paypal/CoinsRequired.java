package com.radha.onlineproblems.paypal;

/*
-getMinNoOfCoins(coins, value, valueSoFar, curMax)
	- check curMax fits for value
	- lesser
		- add maxValue with valueSoFar
		- return getMinNoOfCoins(coins, value, valueSoFar, curMax) + 1
	- bigger
		- nextMax = findNextMaximum(coins, curMax)
		- return getMinNoOfCoins(coins, value, valueSoFar, nextMax)
	- equal
		- return 1

 */
public class CoinsRequired {
    int getMinNoOfCoins(int[] coins, int value, int valueSoFar, int curMax) {
        if(curMax + valueSoFar == value) {
            return 1;
        }
        if(curMax + valueSoFar <= value) {
            valueSoFar += curMax;
            return getMinNoOfCoins(coins, value, valueSoFar, curMax) + 1;
        }
        int nextMax = findNextMaximum(coins, curMax);
        return getMinNoOfCoins(coins, value, valueSoFar, nextMax);

    }

     int findNextMaximum(int[] coins, int curMax) {
        int nextMax = Integer.MIN_VALUE;
        for(int coin : coins) {
            if(coin > nextMax && coin < curMax) {
                nextMax = coin;
            }
        }
        return nextMax;
    }
}
