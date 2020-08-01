package com.radha.onlineproblems.zoho;

import java.util.Objects;

public class TwoTowns {
    public static final int MAX_SPEED_LIMIT = 60;
    public static final int MIN_SPEED_LIMIT = 30;
    private int sourceTown;
    private int destinationTown;
    private double distance;

    public TwoTowns(int sourceTown, int destinationTown) {
        this.sourceTown = sourceTown;
        this.destinationTown = destinationTown;
    }

    public TwoTowns(int sourceTown, int destinationTown, double distance) {
        this.sourceTown = sourceTown;
        this.destinationTown = destinationTown;
        this.distance = distance;
    }

    public int getSourceTown() {
        return sourceTown;
    }

    public int getDestinationTown() {
        return destinationTown;
    }

    public double getDistance() {
        return this.distance;
    }

     boolean hasDirectRoute () {
        return distance != -1;
    }

    double getMinTimeToReachDestination () {
        return hasDirectRoute() ?  distance * 60 / MAX_SPEED_LIMIT :  -1;
    }

    double getMaxTimeToReachDestination() {
        return hasDirectRoute() ?  distance * 60 / MIN_SPEED_LIMIT :  -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TwoTowns)) return false;
        TwoTowns twoTowns = (TwoTowns) o;
        return sourceTown == twoTowns.sourceTown &&
                destinationTown == twoTowns.destinationTown;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceTown, destinationTown);
    }


    @Override
    public String toString() {
        return "TwoTowns{" +
                "sourceTown=" + sourceTown +
                ", destinationTown=" + destinationTown +
                ", distance=" + distance +
                '}';
    }
}
