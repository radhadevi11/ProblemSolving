package com.radha.onlineproblems;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class PreviouslyExecutedRouteTest {

    @Test
    public void testFindRoutesToDestination() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute();
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 1, 40), new TwoTowns(0, 1, 40));
        twoTownsMap.put(new TwoTowns(1, 2, 40), new TwoTowns(1, 2, 40));
        twoTownsMap.put(new TwoTowns(2, 3, 40), new TwoTowns(2, 3, 40));

        List<TwoTowns> expected = new ArrayList<>();
        expected.add(new TwoTowns(0, 1, 40));
        expected.add(new TwoTowns(1, 2, 40));
        expected.add(new TwoTowns(2, 3, 40));
        assertThat(route.findRoutesToDestination
                (twoTownsMap, 3, new TwoTowns(0, 1))).containsExactly(expected);
    }

    @Test
    public void testFindRoutesToDestinationHasDirectRoute() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute();
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 3, 40), new TwoTowns(0, 1, 40));


        List<TwoTowns> expected = new ArrayList<>();
        expected.add(new TwoTowns(0, 3, 40));
        assertThat(route.findRoutesToDestination
                (twoTownsMap, 3, new TwoTowns(0, 3))).containsExactly(expected);
    }

    @Test
    public void testFindRoutesToDestinationHasNoRoute() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute();
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 1, 40), new TwoTowns(0, 1, 40));
        twoTownsMap.put(new TwoTowns(1, 2, 40), new TwoTowns(1, 2, 40));
        twoTownsMap.put(new TwoTowns(2, 3, 40), new TwoTowns(2, 3, 40));
        twoTownsMap.put(new TwoTowns(3, 4, -1), new TwoTowns(2, 3, 40));

        List<TwoTowns> empty = new ArrayList<>();

        assertThat(route.findRoutesToDestination
                (twoTownsMap, 3, new TwoTowns(0, 4))).isEqualTo(empty);
    }

    @Test
    public void findPossibleRoutesHasNoRoute() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute();
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 1, 40), new TwoTowns(0, 1, 40));
        twoTownsMap.put(new TwoTowns(1, 2, 40), new TwoTowns(1, 2, 40));
        twoTownsMap.put(new TwoTowns(2, 3, 40), new TwoTowns(2, 3, 40));
        twoTownsMap.put(new TwoTowns(0, 2, 40), new TwoTowns(2, 3, 40));

        List<List<TwoTowns>> expected = new ArrayList<>();
        List<TwoTowns> route1 = new ArrayList<>();
        route1.add(new TwoTowns(0, 1, 40));
        route1.add(new TwoTowns(1, 2, 40));
        route1.add(new TwoTowns(2, 3, 40));

        List<TwoTowns> route2 = new ArrayList<>();
        route2.add(new TwoTowns(0, 2, 40));
        route2.add(new TwoTowns(2, 3, 40));

        expected.add(route1);
        expected.add(route2);

        assertThat(route.findPossibleRoutes
                (twoTownsMap, 0, 3)).isEqualTo(expected);
    }

    @Test
    public void addDistance() {
        List<TwoTowns> routes = new ArrayList<>();
        routes.add(new TwoTowns(0, 1, 40));
        routes.add(new TwoTowns(1, 2, 50));
        routes.add(new TwoTowns(2, 3, 40));
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute();

        assertThat(route.addDistance(routes)).isEqualTo(130);
    }

    @Test
    public void tesGetMinDistRoute() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute(
                new TwoTowns(0, 3), 120);
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 1, 40), new TwoTowns(0, 1, 40));
        twoTownsMap.put(new TwoTowns(1, 2, 50), new TwoTowns(1, 2, 50));
        twoTownsMap.put(new TwoTowns(2, 3, 60), new TwoTowns(2, 3, 60));
        twoTownsMap.put(new TwoTowns(0, 2, 40), new TwoTowns(2, 3, 40));


        assertThat(route.getMinDistRoute(twoTownsMap)).containsExactly(
                new TwoTowns(0, 2, 40), new TwoTowns(2, 3, 60));



    }

    @Test
    public void testPopulateIntermediateTowns() {
        PreviouslyExecutedRoute route = new PreviouslyExecutedRoute(
                new TwoTowns(0, 3), 120);
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        twoTownsMap.put(new TwoTowns(0, 1, 40), new TwoTowns(0, 1, 40));
        twoTownsMap.put(new TwoTowns(1, 2, 50), new TwoTowns(1, 2, 50));
        twoTownsMap.put(new TwoTowns(2, 3, 60), new TwoTowns(2, 3, 60));
        twoTownsMap.put(new TwoTowns(0, 2, 40), new TwoTowns(2, 3, 40));

        route.populateIntermediateTowns(twoTownsMap);

        assertThat(route.getIntermediateTowns()).contains( new TwoTowns(0, 2, 40),
                new TwoTowns(2, 3, 60));

    }
}