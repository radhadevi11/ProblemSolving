package com.radha.onlineproblems.wordproblems;

import java.util.*;

class Island {
    private int no;

    Island(int no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Island)) return false;
        Island island = (Island) o;
        return no == island.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }

    @Override
    public String toString() {
        return "Island{" +
                "no=" + no +
                '}';
    }
}
class Bridge {
    private int no;
    private Island island1;
    private Island island2;

    public Bridge(int no, Island island1, Island island2) {
        this.no = no;
        this.island1 = island1;
        this.island2 = island2;
    }

    public int getNo() {
        return no;
    }

    public Island getIsland1() {
        return island1;
    }

    public Island getIsland2() {
        return island2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bridge)) return false;
        Bridge bridge = (Bridge) o;
        return getNo() == bridge.getNo() &&
                Objects.equals(getIsland1(), bridge.getIsland1()) &&
                Objects.equals(getIsland2(), bridge.getIsland2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNo(), getIsland1(), getIsland2());
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "no=" + no +
                ", island1=" + island1 +
                ", island2=" + island2 +
                '}';
    }
}
public class IndonesiaIslands {

    public static void main(String[] args) {
        //get inputs
            /*
            no of islands
            no of bridges
            source and destination islands
            Map<Island, List<Bridge>> getInput(noOfBridges);
             */
        //process inputs
        /*
        list of pair of islands =>
        get island and bridges for the island
        For each island
                List<Bridge> findRouteFromIsland(Map<Island, List<Bridge>> islandsWithBridges);
                - if we find valid route
                        return the path
                - otherwise
                        start from another island
         */
        Scanner s = new Scanner(System.in);
        int noOfIsland = s.nextInt();
        int noOfBridge = s.nextInt();
        IndonesiaIslands islandObj = new IndonesiaIslands();
        Map<Island, List<Bridge>> IslandAndBridges = islandObj.getInput(noOfBridge);
        Optional<List<Bridge>> route = islandObj.getRoute(IslandAndBridges, noOfBridge);
        if (route.isPresent()) {
            islandObj.printRoute(route.get());
        } else {
            System.out.println("can not find route");
        }
    }

      Optional<List<Bridge>> getRoute(Map<Island, List<Bridge>> IslandAndBridges, int noOfIslands ) {
        for(Island island : IslandAndBridges.keySet()) {
            List<Bridge> route = findRouteFromIsland(island, IslandAndBridges, noOfIslands);
            if(route != null) {
                return Optional.of(route);
            }
        }
        return Optional.empty();
    }

    private void printRoute(List<Bridge> route) {
        System.out.print(route.size());
        for(Bridge bridge : route) {
            System.out.print(bridge);
        }
    }

    private  List<Bridge> findRouteFromIsland(Island startIsland, Map<Island, List<Bridge>> islandAndBridges, int noOfIsland) {
        return findRouteFromIsland(startIsland, islandAndBridges, new HashSet<>(), new ArrayList<>(), noOfIsland);
    }
    /*List<Bridge> findRouteFromIsland(Island isalndIamIn,
     List<Island> islandsVisited, List<Bridge>bridgesCrossed)
    Route choosing bridge:(isalndIamIn, islandsVisited, bridgesCrossed)
    add this isalnd to islandsVisited
	for each bridge going out from island
		if bridge has already been crossed skip
    add this bridge to bridgesCrossed
    choose bridge (bridge dest, islandsVisited, bridgesCrossed)
			if no valid route found, remove this bridge from bridgesCrossed
			if valid route found, we are done
			*/
    List<Bridge> findRouteFromIsland(Island islandIamIn ,
                                     Map<Island, List<Bridge>> islandAndBridges,
                                     Set<Island> islandsVisited,
                                     List<Bridge>bridgesCrossed,
                                     int noOfIslandsToVisit){

        System.out.println("island iam in "+ islandIamIn);
        islandsVisited.add(islandIamIn);
        if(islandsVisited.size() == noOfIslandsToVisit){
            return bridgesCrossed;
        }
        System.out.println("islandsVisited so far "+islandsVisited);
        System.out.println("bridges crossed so far "+bridgesCrossed);
        List<Bridge> bridgesFromIslandIamIn = islandAndBridges.get(islandIamIn);
        for(Bridge bridge : bridgesFromIslandIamIn) {
            System.out.println("inside for");
            System.out.println("bridge="+bridge);
            if(! bridgesCrossed.contains(bridge)) {
                System.out.println("new bridge");
                bridgesCrossed.add(bridge);
                System.out.println("==================");
                List<Bridge> routeFromIsland = findRouteFromIsland(bridge.getIsland2(), islandAndBridges, islandsVisited, bridgesCrossed, noOfIslandsToVisit);
                if(routeFromIsland == null) {
                    bridgesCrossed.remove(bridge);
                } else {
                    return routeFromIsland;
                }
            }
        }
        return null;
    }

     Map<Island, List<Bridge>> getInput(int noOfBridge) {
         Map<Island, List<Bridge>> islandAndBridges = new HashMap<>();
                Scanner s = new Scanner(System.in);
                for (int i = 1; i <= noOfBridge; i++) {
                    Island island1 = new Island(s.nextInt());
                    Island island2 = new Island(s.nextInt());
                    if(islandAndBridges.containsKey(island1)) {
                       // islandAndBridges.replace(island1, islandAndBridges.get(island1).add(new Bridge(i, island1, island2)));
                    }
                }
                return null;
    }

}
