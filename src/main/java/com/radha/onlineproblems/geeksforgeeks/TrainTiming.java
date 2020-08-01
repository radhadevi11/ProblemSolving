package com.radha.onlineproblems.geeksforgeeks;

import java.time.LocalTime;

public class TrainTiming {
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    public TrainTiming(String arrivalTimeString, String departureTimeString) {
        this.arrivalTime = LocalTime.of(Integer.parseInt(arrivalTimeString.substring(0,2)),
                Integer.parseInt(arrivalTimeString.substring(2)));
        this.departureTime = LocalTime.of(Integer.parseInt(departureTimeString.substring(0,2)),
                Integer.parseInt(departureTimeString.substring(2)));
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
