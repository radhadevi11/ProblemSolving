package com.radha.onlineproblems.moreinterviewquestions;

import com.radha.onlineproblems.moreinterviewquestions.FloorInSortedArrayBinarySearch;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FloorInSortedArrayBinarySearchTest {

    @Test
    public void getIndexOfFloorWhenStartPosEqualToEndPosNumEqualToFloor() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        assertThat(floor.getIndexOfFloorWhenStartPosEqualToEndPos(5, 5, 3)).isEqualTo(3);
    }

    @Test
    public void getIndexOfFloorWhenStartPosEqualToEndPosNumNotEqualToFloor() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        assertThat(floor.getIndexOfFloorWhenStartPosEqualToEndPos(5, 6, 3)).isEqualTo(2);
    }

    @Test
    public void getIndexOfFloorInSortedArrayActualFloorPresentedInArray() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        int[] numbers = new int[] {1, 2, 5, 10, 11, 12, 19};

        assertThat(floor.getIndexOfFloorInSortedArray(numbers, 5, 0, numbers.length))
                .isEqualTo(2);
    }

    @Test
    public void getIndexOfFloorInSortedArrayFloorNotPresentedInArray() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        int[] numbers = new int[] {1, 2, 5, 10, 11, 12, 19};

        assertThat(floor.getIndexOfFloorInSortedArray(numbers, 0, 0, numbers.length))
                .isEqualTo(-1);
    }

    @Test
    public void getIndexOfFloorInSortedArrayFloorPresentedInArray() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        int[] numbers = new int[] {1, 2, 5, 10, 11, 12, 19};

        assertThat(floor.getIndexOfFloorInSortedArray(numbers, 13, 0, numbers.length))
                .isEqualTo(5);
    }

    @Test
    public void getIndexOfFloorInSortedArrayFloorPresentedInMid() {
        FloorInSortedArrayBinarySearch floor = new FloorInSortedArrayBinarySearch();
        int[] numbers = new int[] {1, 2, 5, 10, 11, 12, 19};

        assertThat(floor.getIndexOfFloorInSortedArray(numbers, 10, 0, numbers.length))
                .isEqualTo(3);
    }


    @Test
    public void getIndexOfFloor() {
    }
}