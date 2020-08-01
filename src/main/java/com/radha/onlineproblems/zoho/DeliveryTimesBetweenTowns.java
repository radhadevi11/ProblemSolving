package com.radha.onlineproblems.zoho;

import java.util.*;

public class DeliveryTimesBetweenTowns {
    /*
    For each asked
     find minDeliveryMinute of asked and set to minTime
             if we can use given
                        find minDeliveryMinute of  another route in the given and
                                subtract from total given minute  set to maxTime
                        return  minTime, maxTime
            Otherwise
                        find maxDeliveryTime of asked set to maxTime
                        return  minTime, maxTime

     */
    double getMaxTimeTravelTime (TwoTowns twoTowns, PreviouslyExecutedRoute routes,
                                 Map<TwoTowns, TwoTowns> twoTownsMap) {
        /*
        Step 1: getAnotherRoute
        Step 2: subtract anotherRoute's minTime from timeTakenToReach
        Step 3: return it
         */
        Optional<TwoTowns> otherTownPairInRoute = routes.getOtherTownPairInRoute(twoTowns);
        if(otherTownPairInRoute.isPresent()) {
            TwoTowns anotherTown = otherTownPairInRoute.get();
            return routes.getTimeTakenToReach() - twoTownsMap.get(anotherTown)
                    .getMinTimeToReachDestination();
        }
        return twoTownsMap.get(twoTowns).getMaxTimeToReachDestination();
    }
    double getMaxTimeFromPreviouslyExecutedList(TwoTowns twoTowns,
                                                List<PreviouslyExecutedRoute> previouslyExecutedRouteList,
                                                Map<TwoTowns, TwoTowns> twoTownsMap) {
        /*
        Step 1:For each previouslyExecutedRoutesList
                        if previouslyExecutedRoutesList contains twoTowns
                                return getMaxTimeTravelTime
          Step 2:     return   getMaxTimeToReachDestination of  twoTowns
         */
       return previouslyExecutedRouteList.stream()
                .filter((previouslyExecutedRoute -> previouslyExecutedRoute.contains(twoTowns)))
                .map((previouslyExecutedRoute -> getMaxTimeTravelTime(twoTowns,
                        previouslyExecutedRoute, twoTownsMap)))
                .findFirst()
                .orElse(twoTownsMap.get(twoTowns).getMaxTimeToReachDestination());
    }

    Map<TwoTowns, TwoTowns> processTownsDistance(int n) {
        Scanner s = new Scanner(System.in);
        Map<TwoTowns, TwoTowns> twoTownsMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double distance = s.nextDouble();
                if(i != j) {
                    twoTownsMap.put(new TwoTowns(i, j, distance),
                            new TwoTowns(i, j, distance));
                }
            }
        }
        return twoTownsMap;
    }

    List<PreviouslyExecutedRoute> processPreviouslyExecutedRoutes(int n) {
        List<PreviouslyExecutedRoute> previouslyExecutedRouteList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int sourceTown = s.nextInt();
            int destinationTown = s.nextInt();
            double timeTakenToTravel = s.nextDouble();
            previouslyExecutedRouteList.add(new PreviouslyExecutedRoute(
                    new TwoTowns(sourceTown, destinationTown), timeTakenToTravel));
        }
        return previouslyExecutedRouteList;
    }

     List<TwoTowns> processQueries(int noOfQueries) {
        List<TwoTowns> twoTownList = new ArrayList<>();
        Scanner s  = new Scanner(System.in);
        for (int i = 0; i < noOfQueries; i++) {
            twoTownList.add(new TwoTowns(s.nextInt(), s.nextInt()));
        }
        return twoTownList;
    }



    public static void main(String[] args) {
        DeliveryTimesBetweenTowns deliveryTimesBetweenTowns = new DeliveryTimesBetweenTowns();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter no of cities");
        int noOfCities = s.nextInt();
        System.out.println("Enter distance between cites");
        Map<TwoTowns, TwoTowns> twoTownsMap =
                deliveryTimesBetweenTowns.processTownsDistance(noOfCities);

        System.out.println("Enter no of previously executed route");
        int noOfPrevExecutedRouts = s.nextInt();
        System.out.println("Enter details of previously executed route");
        List<PreviouslyExecutedRoute> previouslyExecutedRouteList =
                deliveryTimesBetweenTowns.processPreviouslyExecutedRoutes(noOfPrevExecutedRouts);

        System.out.println("Enter no of Queries");
        int noOfQueries = s.nextInt();
        List<TwoTowns> twoTownsQueries = deliveryTimesBetweenTowns.processQueries(noOfQueries);

        for(TwoTowns twoTowns : twoTownsQueries) {
            double minTimeToTravel = twoTownsMap.get(twoTowns)
                    .getMinTimeToReachDestination();
            double maxTimeToTravel = deliveryTimesBetweenTowns
                    .getMaxTimeFromPreviouslyExecutedList(twoTowns, previouslyExecutedRouteList, twoTownsMap);
            System.out.println(twoTowns.getSourceTown()+ " "+ twoTowns.getDestinationTown()
                    + " "+ minTimeToTravel+ " "+maxTimeToTravel);

        }
    }

}
