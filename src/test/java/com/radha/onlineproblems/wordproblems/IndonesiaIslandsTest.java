package com.radha.onlineproblems.wordproblems;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

public class IndonesiaIslandsTest {

    @Test
    public void getRoute() {
    }

    @Test
    public void findRouteFromIsland() {
        IndonesiaIslands islandObj = new IndonesiaIslands();
        Island islandIamIn = new Island(1);
        Map<Island, List<Bridge>> islandAndBridges = new HashMap<>();
        Bridge bridge1 = new Bridge(1,
                new Island(1),
                new Island(2));
        Bridge bridge3 = new Bridge(3,
                new Island(2),
                new Island(3));
        Bridge bridge2 = new Bridge(2,
                new Island(3),
                new Island(1));

        islandAndBridges.put(new Island(1),
                Arrays.asList(bridge1));
        islandAndBridges.put(new Island(2), Arrays.asList(bridge3));
        islandAndBridges.put(new Island(3), Arrays.asList(bridge2));

        List<Bridge> actual = islandObj.findRouteFromIsland(islandIamIn, islandAndBridges,
                new HashSet<>(), new ArrayList(), 3);
        Assertions.assertThat(actual).containsExactly(bridge1, bridge3);
    }
}