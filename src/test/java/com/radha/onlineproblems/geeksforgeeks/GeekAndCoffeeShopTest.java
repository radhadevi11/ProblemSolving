package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeekAndCoffeeShopTest {

    @Test
    public void getUnitOfCoffeeAtMthUnit() {
        GeekAndCoffeeShop coffeeShop = new GeekAndCoffeeShop();
        assertThat(coffeeShop.getUnitOfCoffeeAtMthUnit(100, 4)).isEqualTo(12);
    }
    @Test
    public void getUnitOfCoffeeAtMthUnitReaches0() {
        GeekAndCoffeeShop coffeeShop = new GeekAndCoffeeShop();
        assertThat(coffeeShop.getUnitOfCoffeeAtMthUnit(100, 10)).isEqualTo(0);
    }
}