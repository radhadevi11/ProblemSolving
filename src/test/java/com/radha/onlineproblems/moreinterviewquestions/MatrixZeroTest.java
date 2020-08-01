package com.radha.onlineproblems.moreinterviewquestions;

import com.radha.onlineproblems.moreinterviewquestions.MatrixZero;
import com.radha.onlineproblems.moreinterviewquestions.Position;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MatrixZeroTest {

    @Test
    public void testGetAllZerosPositionList() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {{1, 2, 3}, {0, 2, 8}, {5, 3, 0}};

        assertThat(matrixZeros.getAllZerosPositionList(numbers)).
                containsExactly(new Position(1, 0), new Position(2, 2));
    }

    @Test
    public void testGetAllZerosPositionListWithNonZeroArray() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {{1, 2, 3}, {5, 2, 8}};

        assertThat(matrixZeros.getAllZerosPositionList(numbers)).
                containsExactly();
    }

    @Test
    public void testMakeCurrentColValuesZero() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {{1, 2 }, {0, 2, 8}, {5, 3, 8}};

        matrixZeros.makeCurrentColValuesZero(numbers, 0, numbers.length);
        assertThat((numbers)).containsExactly(new int[][] {{0, 2} , {0, 2, 8},{ 0, 3, 8}});
    }

    @Test
    public void testMakeCurrentRowValuesZero() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {{1, 2, 3}, {0, 2}, {5, 3, 8}};

        matrixZeros.makeCurrentRowValuesZero(numbers, 1, numbers[1].length);
        assertThat((numbers)).containsExactly(new int[][] {{1, 2, 3}, {0, 0 }, {5, 3, 8}});
    }

    @Test
    public void testConvertAllPositionValuesToZeros() {
        MatrixZero MatrixZero = new MatrixZero();
        List<Position> positions = new ArrayList<>(Arrays.asList(new Position(1, 4),
                new Position(2, 2)));
        int[][] numbers = new int[][] {{1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 0, 7},
                {5, 6, 0, 9, 8, 7},
                {4, 5, 7, 8, 9, 7}
        };

        MatrixZero.convertAllPositionValuesToZeros(positions, numbers);

        assertThat(numbers).isEqualTo(new int[][] {
                {1, 2, 0, 4, 0, 6},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {4, 5, 0, 8, 0, 7}
        });
    }
    @Test
    public void testConvertAllPositionValuesToZerosForNonZero() {
        MatrixZero MatrixZero = new MatrixZero();
        List<Position> positions = new ArrayList<>();
        int[][] numbers = new int[][] {{1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 8, 7},
                {5, 6, 8, 9, 8, 7},
                {4, 5, 7, 8, 9, 7}
        };

        MatrixZero.convertAllPositionValuesToZeros(positions, numbers);

        assertThat(numbers).isEqualTo(new int[][] {{1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 8, 7},
                {5, 6, 8, 9, 8, 7},
                {4, 5, 7, 8, 9, 7}
        });
    }

    @Test
    public void testFindZerosAndMakeZeroToTheAllPosition() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {{1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 0, 7},
                {5, 6, 0, 9, 8, 7},
                {4, 5, 7, 8, 9, 7}
        };

        assertThat(matrixZeros.findZerosAndMakeZeroToTheAllPosition(numbers))
                .isEqualTo(new int[][] {
                        {1, 2, 0, 4, 0, 6},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {4, 5, 0, 8, 0, 7}
                });

    }
    @Test
    public void testFindZerosAndMakeZeroToTheAllPositionForNonZero() {
        MatrixZero matrixZeros = new MatrixZero();
        int[][] numbers = new int[][] {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 8, 7},
                {5, 6, 8, 9, 8, 7},
                {4, 5, 7, 8, 9, 7}
        };

        assertThat(matrixZeros.findZerosAndMakeZeroToTheAllPosition(numbers))
                .isEqualTo( new int[][] {
                        {1, 2, 3, 4, 5, 6},
                        {2, 3, 4, 5, 8, 7},
                        {5, 6, 8, 9, 8, 7},
                        {4, 5, 7, 8, 9, 7}
                } );

    }

}