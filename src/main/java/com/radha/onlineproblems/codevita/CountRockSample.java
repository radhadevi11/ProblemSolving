package com.radha.onlineproblems.codevita;
/*
getInput()
    - noOfSample
    - noOfRanges
    - getSampleList(noOfSample)
    - getRangeList(noOfRanges)
countRockSampleInRages()
    - create sampleCountInRange with size of rangeList
    - for each rockSample
        - for each rangeList
                - if isInRange(rockSample)
                        increment sampleCountInRange(i)th value by 1
    - return sampleCountInRange
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountRockSample {
    List<Integer> getRockSampleSizeList(int noOfSample) {
        Scanner s = new Scanner(System.in);
        List<Integer> rockSampleSizes = new ArrayList<>();
        for(int i = 0; i < noOfSample; i++) {
            rockSampleSizes.add(s.nextInt());
        }
        return rockSampleSizes;
    }
    List<Range> getRangeList(int noOfRanges) {
        Scanner s = new Scanner(System.in);
        List<Range> ranges = new ArrayList<>();
        for(int i = 0; i < noOfRanges; i++) {
            ranges.add(new Range(s.nextInt(), s.nextInt()));
        }
        return ranges;
    }
    List<Integer> countRockSamplesInRange(List<Range> ranges, List<Integer> rockSampleSizes) {

        List<Integer> sampleCountInRange = IntStream.of(new int[ranges.size()])
                                                .boxed()
                                                .collect(Collectors.toList());
        Collections.fill(sampleCountInRange, 0);
        for(int sampleSize : rockSampleSizes) {
            populateSampleCountList(ranges, sampleCountInRange, sampleSize);
        }
        return sampleCountInRange;
    }

     void populateSampleCountList(List<Range> ranges, List<Integer> sampleCountInRange, int sampleSize) {
        for(int i = 0; i < ranges.size(); i++) {
            if (isInRange(sampleSize, ranges.get(i).getStart(), ranges.get(i).getEnd())) {
                sampleCountInRange.set(i, sampleCountInRange.get(i) + 1);
            }
        }
    }

     boolean isInRange(Integer sampleSize, int start, int end) {
        return sampleSize >= start && sampleSize <= end;
    }

    public static void main(String[] args) {
        CountRockSample countRockSample = new CountRockSample();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rock sample");
        int noOfSample = s.nextInt();
        System.out.println("Enter no of ranges");
        int noOfRanges = s.nextInt();
        System.out.println("Enter rock sample sizes");
        List<Integer> rockSampleSizeList = countRockSample.getRockSampleSizeList(noOfSample);
        System.out.println("Enter ranges");
        List<Range> rangeList = countRockSample.getRangeList(noOfRanges);
        List<Integer> rockSamplesInRange = countRockSample.countRockSamplesInRange(rangeList, rockSampleSizeList);

        System.out.print(rockSamplesInRange.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
