package com.radha.onlineproblems.zoho;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class DeliveryTimesBetweenTownsTest {

    @Test
    public void testGetMaxTimeTravelTime() {
        DeliveryTimesBetweenTowns towns = new DeliveryTimesBetweenTowns();

        Map<TwoTowns, TwoTowns> townsMap =  new HashMap<>();
        townsMap.put(new TwoTowns(0, 1, 50), new TwoTowns(0, 1, 50));
        townsMap.put(new TwoTowns(1, 2, 40), new TwoTowns(0, 1, 40));

        assertThat(towns.getMaxTimeTravelTime(new TwoTowns(0, 1),
                new PreviouslyExecutedRoute(new TwoTowns(0,2), 120 ), townsMap)).isEqualTo(80);


    }

    @Test
    public void testGetMaxTimeFromPreviouslyExecutedList() {
        DeliveryTimesBetweenTowns towns = new DeliveryTimesBetweenTowns();
        Map<TwoTowns, TwoTowns> townsMap =  new HashMap<>();
        townsMap.put(new TwoTowns(0, 1, 50), new TwoTowns(0, 1, 50));
        townsMap.put(new TwoTowns(1, 2, 40), new TwoTowns(0, 1, 40));
        List<PreviouslyExecutedRoute> previouslyExecutedRouteList =
                new ArrayList<>(Arrays.asList( new PreviouslyExecutedRoute(new TwoTowns(2, 5), 130 ),
                        new PreviouslyExecutedRoute(new TwoTowns(0,2), 120 )));

        assertThat(towns.getMaxTimeFromPreviouslyExecutedList(new TwoTowns(0, 1),
                previouslyExecutedRouteList,
               townsMap)).isEqualTo(80);

    }
}