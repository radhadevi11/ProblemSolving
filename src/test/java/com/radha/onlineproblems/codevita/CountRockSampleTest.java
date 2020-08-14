package com.radha.onlineproblems.codevita;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountRockSampleTest {

    @Test
    public void countRockSamplesInRange() {
        CountRockSample countRockSample = new CountRockSample();
        Range range1 = new Range(1, 100);
        Range range2 = new Range(50, 70);
        List<Range> ranges = Arrays.asList(range1, range2);
        List<Integer> rockSampleSizes = Arrays.asList(100, 25, 30, 45);
        Assertions.assertThat(countRockSample.countRockSamplesInRange(ranges, rockSampleSizes)).containsExactly(4, 0);
    }

    @Test
    public void countRockSamplesInRange2() {
        CountRockSample countRockSample = new CountRockSample();
        Range range1 = new Range(1, 100);
        Range range2 = new Range(50, 70);
        Range range3 = new Range(150, 170);
        List<Range> ranges = Arrays.asList(range1, range2, range3);
        List<Integer> rockSampleSizes = Arrays.asList(100, 25, 30, 45, 120, 56, 190);
        Assertions.assertThat(countRockSample.countRockSamplesInRange(ranges, rockSampleSizes)).containsExactly(5, 1, 0);
    }

    @Test
    public void populateSampleCountListSize1() {
        CountRockSample countRockSample = new CountRockSample();
        List<Integer> sampleCountInRange = new ArrayList<>();
        sampleCountInRange.add(0);
        Range range1 = new Range(1, 100);
        List<Range> ranges = new ArrayList<>();
        ranges.add(range1);
        countRockSample.populateSampleCountList(ranges, sampleCountInRange, 50);
        Assertions.assertThat(sampleCountInRange).containsExactly(1);
    }
    @Test
    public void populateSampleCountListUpdate() {
        CountRockSample countRockSample = new CountRockSample();
        List<Integer> sampleCountInRange = new ArrayList<>();
        sampleCountInRange.add(1);
        Range range1 = new Range(1, 100);
        List<Range> ranges = new ArrayList<>();
        ranges.add(range1);
        countRockSample.populateSampleCountList(ranges, sampleCountInRange, 50);
        Assertions.assertThat(sampleCountInRange).containsExactly(2);
    }

    @Test
    public void populateSampleCountListSizeN() {
        CountRockSample countRockSample = new CountRockSample();
        List<Integer> sampleCountInRange = new ArrayList<>(2);
        sampleCountInRange.add(1);
        sampleCountInRange.add(0);
        Range range1 = new Range(1, 100);
        Range range2 = new Range(50, 100);
        List<Range> ranges = new ArrayList<>();
        ranges.add(range1);
        ranges.add(range2);
        countRockSample.populateSampleCountList(ranges, sampleCountInRange, 50);
        Assertions.assertThat(sampleCountInRange).containsExactly(2, 1);
    }
    @Test
    public void isInRange() {
        CountRockSample countRockSample = new CountRockSample();
        Assertions.assertThat(countRockSample.isInRange(120, 100, 150)).isTrue();
    }

    @Test
    public void isNotInRange() {
        CountRockSample countRockSample = new CountRockSample();
        Assertions.assertThat(countRockSample.isInRange(50, 100, 150)).isFalse();
    }
}