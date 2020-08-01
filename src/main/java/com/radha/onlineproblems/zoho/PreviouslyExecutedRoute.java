package com.radha.onlineproblems.zoho;

import java.util.*;

public class PreviouslyExecutedRoute {
    private TwoTowns twoTowns;
    private Set<TwoTowns> intermediateTowns = new HashSet<>();
    private double timeTakenToReach;

    public PreviouslyExecutedRoute() {
    }

    public PreviouslyExecutedRoute(TwoTowns twoTowns, double timeTakenToReach) {
        this.twoTowns = twoTowns;
        this.timeTakenToReach = timeTakenToReach;
        populateIntermediateTowns();
    }
    public PreviouslyExecutedRoute(TwoTowns twoTowns, double timeTakenToReach,
                                   Map<TwoTowns, TwoTowns> twoTownsMap) {
        this.twoTowns = twoTowns;
        this.timeTakenToReach = timeTakenToReach;
        populateIntermediateTowns(twoTownsMap);
    }

    public Set<TwoTowns> getIntermediateTowns() {
        return intermediateTowns;
    }

    void populateIntermediateTowns(Map<TwoTowns, TwoTowns> twoTownsMap) {
        for (TwoTowns twoTown : getMinDistRoute(twoTownsMap)) {
            intermediateTowns.add(twoTown);
        }
    }

     List<TwoTowns> getMinDistRoute(Map<TwoTowns, TwoTowns> twoTownsMap) {
        List<List<TwoTowns>> possibleRoutes = findPossibleRoutes(twoTownsMap, this.twoTowns.getSourceTown(),
                this.twoTowns.getDestinationTown());
        double minDist = Double.MAX_VALUE;
        List<TwoTowns> minRoute = new ArrayList<>();
        for (List  route :  possibleRoutes) {
            double curDist = addDistance(route);
            if(curDist < minDist) {
                minDist = curDist;
                minRoute = route;
            }
        }
        return minRoute;
    }

     double addDistance(List<TwoTowns> twoTowns) {
        double totalDistance = 0;
        for (TwoTowns towns : twoTowns) {
            totalDistance += towns.getDistance();
        }
        return totalDistance;
    }

    /*
   List<Route> findPossibleRoutes(Map, source, destination)
Step 0: let minDist = maxValue, let curDist = 0, create list of routes (routeList), create list of roads (roadsSoFar)
Step 1: For each road starting from given source
       Step 1.5: Add road to roadsSoFar
       Step 2: get the distance add it with curDist
       Step 3: let roadDest = the road's destination
       Step 4: if dest = destination and curDist < minDist
               4.1: set minDist to curDist set curDist to 0
               4.2: Create a route containing all the roads so far
               4.3: Add the route to the routeList
       step 5: resultRoutes = findPossibleRoutes(Map, roadDest ,destination)
       Step 6: For each of the resultRoutes add road to 0th possition
       Step 7: return resultRoutes
    */
    List<List<TwoTowns>> findPossibleRoutes(Map<TwoTowns,
            TwoTowns> twoTownsMap, int source, int destination) {
        List<List<TwoTowns>> possibleRoutes = new ArrayList<>();
            twoTownsMap.keySet().stream()
                    .filter((twoTowns -> twoTowns.getSourceTown() == source))
                    .forEach((twoTowns -> {

                        List<List<TwoTowns>> possibleRoutesSoFar =
                                findRoutesToDestination(twoTownsMap, destination,
                                twoTowns);
                        possibleRoutes.addAll(possibleRoutesSoFar);

                    }));
            return possibleRoutes;
    }

    List<List<TwoTowns>> findRoutesToDestination(Map<TwoTowns, TwoTowns> twoTownsMap,
                                 int destination, TwoTowns twoTowns) {
        List<List<TwoTowns>> possibleRoutes = new ArrayList<>();
        int roadDest = twoTowns.getDestinationTown();
        if(roadDest == destination && twoTowns.hasDirectRoute()) {
            List<TwoTowns> roadsSoFar = new ArrayList<>();
            roadsSoFar.add(twoTowns);
            possibleRoutes.add(roadsSoFar);
        }
        else {
            List<List<TwoTowns>> resultRouts = findPossibleRoutes(twoTownsMap,
                    roadDest, destination);
            resultRouts.stream()
                    .forEach((resultRout -> resultRout.add(0, twoTowns)));
            possibleRoutes.addAll(resultRouts);
        }
        return possibleRoutes;
    }


    private void populateIntermediateTowns () {
        for (int i = this.twoTowns.getSourceTown(); i < this.twoTowns.getDestinationTown(); i++) {
            intermediateTowns.add(new TwoTowns(i, i+1));
        }
    }

    public double getTimeTakenToReach() {
        return timeTakenToReach;
    }

    Optional<TwoTowns> getOtherTownPairInRoute (TwoTowns givenTowns) {
        for(TwoTowns twoTowns : intermediateTowns) {
            if (! givenTowns.equals(twoTowns)) {
                return Optional.of(twoTowns);
            }
        }
        return Optional.empty();
    }

    public boolean contains(TwoTowns twoTowns) {
        return this.intermediateTowns.contains(twoTowns);
    }
}
