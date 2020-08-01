package com.radha.onlineproblems.moreinterviewquestions;

import com.radha.onlineproblems.moreinterviewquestions.ComputePondSizes;
import com.radha.onlineproblems.moreinterviewquestions.Position;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class ComputePondSizesTest {

    @Test
    public void isValidPositionForValidInput() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        assertThat(pondSizes.isValidPosition(1, 2, 3, 4)).isEqualTo(true);
    }

    @Test
    public void isValidPositionForInvalidRow() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        assertThat(pondSizes.isValidPosition(3, 3, 3, 4)).isEqualTo(false);
    }

    @Test
    public void isValidPositionForInvalidCol() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        assertThat(pondSizes.isValidPosition(3, 4, 3, 4)).isEqualTo(false);
    }

    @Test
    public void testSearchForValidZeroForAllConditionTrue() {
        ComputePondSizes pondSizes = new ComputePondSizes();

        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(new Position(0, 0), 0);
        int[][] plotOfLand = new int[][] {{0, 1}, {2, 0}};

        assertThat(pondSizes.isValidZero(new Position(1,1), 2, 2, positionMap, plotOfLand)).isEqualTo(true);
        System.out.println(positionMap);
//        assertThat(positionMap.containsKey(new Position(1,1))).isEqualTo(true);

    }
    @Test
    public void testSearchForValidZeroForPositionNotContainsZero() {
        ComputePondSizes pondSizes = new ComputePondSizes();

        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(new Position(0, 0), 0);
        int[][] plotOfLand = new int[][] {{0, 1}, {2, 1}};

        assertThat(pondSizes.isValidZero(new Position(1,1), 2, 2, positionMap, plotOfLand)).isEqualTo(false);
        assertThat(positionMap.containsKey(new Position(1,1))).isEqualTo(false);

    }

    @Test
    public void testSearchForValidZeroForMapContainsPosition() {
        ComputePondSizes pondSizes = new ComputePondSizes();

        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(new Position(0, 0), 0);
        int[][] plotOfLand = new int[][] {{0, 1}, {2, 1}};

        assertThat(pondSizes.isValidZero(new Position(0,0), 2, 2, positionMap, plotOfLand)).isEqualTo(false);
        assertThat(positionMap.containsKey(new Position(0,0))).isEqualTo(true);

    }

    @Test
    public void testComputePondSizeForHorizontal() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        Position curPosition = new Position(0, 0);
        int[][] plotOfLand = new int[][] {{0, 5}, {0, 1}};
        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(curPosition, 0);

        int actual = pondSizes.computePondSize(curPosition, plotOfLand, 2, 2, positionMap);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void testComputePondSizeForDiagonal() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        Position curPosition = new Position(0, 1);
        int[][] plotOfLand = new int[][] {{1, 0}, {0, 1}, {0, 1}, {0, 1}};
        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(curPosition, 0);

        int actual = pondSizes.computePondSize(curPosition, plotOfLand, 4, 2, positionMap);

        assertThat(actual).isEqualTo(4);
    }

    @Test
    public void testComputePondSizeForDiagonalExistingInTheMap() {
        ComputePondSizes pondSizes = new ComputePondSizes();
        Position curPosition = new Position(0, 1);
        int[][] plotOfLand = new int[][] {{1, 0}, {0, 1}, {0, 1}, {0, 1}};
        Map<Position, Integer> positionMap = new HashMap<>();
        positionMap.put(curPosition, 0);

        int actual = pondSizes.computePondSize(curPosition, plotOfLand, 4, 2, positionMap);

        assertThat(actual).isEqualTo(4);
    }

    @Test
    public void testGetPondSizeList(){
        ComputePondSizes pondSizes = new ComputePondSizes();
        int[][] plotOfLand = new int[][] {{0, 2, 1, 0}, {0, 1, 0, 1}, {1, 1, 0, 1}, {0, 1, 0, 1}};

        List<Integer> actual = pondSizes.getPondSizeList(plotOfLand, 4, 4);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(2, 4, 1)));
    }

    @Test
    public void testGetPondSizeListConnectedWithSinglePoint(){
        ComputePondSizes pondSizes = new ComputePondSizes();
        int[][] plotOfLand = new int[][] {{0, 0, 0, 0}, {0, 1, 1, 1}};

        List<Integer> actual = pondSizes.getPondSizeList(plotOfLand, 2, 4);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(5)));
    }

    @Test
    public void testGetPondSizeListConnectedWithBothDirection(){
        ComputePondSizes pondSizes = new ComputePondSizes();
        int[][] plotOfLand = new int[][] {{1, 0, 1, 1}, {1, 0, 0, 0}, {0, 0, 0, 0}};

        List<Integer> actual = pondSizes.getPondSizeList(plotOfLand, 3, 4);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(8)));
    }
}

