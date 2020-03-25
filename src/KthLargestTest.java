import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {

    @Test
    public void testSortArray() {
        int[] a = new int[]{5, 4 , 3 , 2, 1};
        KthLargest kthLargest = new KthLargest();
        int[] expected = {1, 2, 3, 4, 5};

        int[] actual = kthLargest.sortArray(a);


        assertArrayEquals(expected, actual);
    }

    @Test
    public void findKthSmallest() {
        KthLargest kthLargest = new KthLargest();
        int[] a = {1, 2, 5, 7, 8};

        int actual = kthLargest.findKthSmallest(3, a);


        assertEquals(5, actual);
    }
}