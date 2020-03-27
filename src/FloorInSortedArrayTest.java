import org.junit.Test;

import static org.junit.Assert.*;

public class FloorInSortedArrayTest {

    @Test
    public void testIsLessThanOrEqualToX() {
        FloorInSortedArray floor = new FloorInSortedArray();

        boolean actual = floor.isLessThanOrEqualToX(4, 5);

        assertEquals(true, actual);
    }


    @Test
    public void testNotLessThanOrEqualToX() {
        FloorInSortedArray floor = new FloorInSortedArray();

        boolean actual = floor.isLessThanOrEqualToX(5, 4);

        assertEquals(false, actual);
    }

    @Test
    public void testFindFloorInSortedArrayForXPresentInArray() {
        FloorInSortedArray floor = new FloorInSortedArray();
        int[] a = new int[]{1, 2, 3, 4, 5};

        int actual = floor.findFloorInSortedArray(2, a);

        assertEquals(1, actual);
    }

    @Test
    public void testFindFloorInSortedArrayForXNotPresentInArray() {
        FloorInSortedArray floor = new FloorInSortedArray();
        int[] a = new int[]{1, 2, 3, 4, 5};

        int actual = floor.findFloorInSortedArray(0, a);

        assertEquals(-1, actual);
    }

    @Test
    public void testFindFloorInSortedArrayForXNearestIndex() {
        FloorInSortedArray floor = new FloorInSortedArray();
        int[] a = new int[]{1, 3, 4, 5};

        int actual = floor.findFloorInSortedArray(2, a);

        assertEquals(0, actual);
    }
}