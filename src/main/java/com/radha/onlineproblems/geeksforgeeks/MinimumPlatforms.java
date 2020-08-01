package com.radha.onlineproblems.geeksforgeeks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumPlatforms {
    /*
    for each train
        if existing platform is available
            then allocate that platform to the train
        Otherwise
            allocate new platform
            and update platform count

      check platform availability:
       for each platform
            if  the train's arrival time is greater than allocated train's departure time
            or the trains's departure time is less than allocated train's arrival time
                        then the platform is available
     */
    int getMinimumNoOfPlatforms (List<TrainTiming> trainTimings) {
        /*
        create platFormWithTrainTime map
        set minimumNoOfPlatforms = 0
        for each trainTimings
                    if map is empty(for 1st platform)
                            increment minimumNoOfPlatforms by 1
                            put this trainTiming and  minimumNoOfPlatforms into map
        otherwise
                    if  platformAvailable() for this trainTiming
                                allocate existing platform for this trainTiming
                    Otherwise
                                increment minimumNoOfPlatforms by 1
                                put this trainTiming and  minimumNoOfPlatforms into map
        return minimumNoOfPlatforms
         */
        Map<Integer, TrainTiming>  platFormWithTrainTime = new HashMap<>();
        int minimumNoOfPlatforms = 0;
        for (TrainTiming trainTiming : trainTimings) {
            if(platFormWithTrainTime.isEmpty()) {
                minimumNoOfPlatforms ++;
                platFormWithTrainTime.put(minimumNoOfPlatforms, trainTiming);
            } else {
                if(!isPlatformAvailable(platFormWithTrainTime, trainTiming)) {
                    minimumNoOfPlatforms ++;
                    platFormWithTrainTime.put(minimumNoOfPlatforms, trainTiming);
                }
            }
        }
        return minimumNoOfPlatforms;
    }

    boolean isPlatformAvailable(Map<Integer, TrainTiming> platFormWithTrainTime,
                                TrainTiming newTrainTiming) {
        /*
        for each platFormWithTrainTime
                if  newTrainTiming's arrival time is greater than  this trainTiming's departure time
                or newTrainTiming's time is less than this trainTiming's arrival time
                        then allocate newTrainTiming's to this platform
                        return true
        return false

         */
       for(int platform : platFormWithTrainTime.keySet()) {
           TrainTiming existingTrainTiming = platFormWithTrainTime.get(platform);
           if(newTrainTiming.getArrivalTime().compareTo(existingTrainTiming.getDepartureTime()) > 0
           || newTrainTiming.getDepartureTime().compareTo(existingTrainTiming.getArrivalTime()) < 0) {
               platFormWithTrainTime.replace(platform, newTrainTiming);
               return true;
           }
       }
       return false;
    }
}
