package pl.mchyb.algorytmy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonMaxTest {

    CommonMax commonMax = new CommonMax();


    @Test
    public void findMinimum() {
        int[] A = {6, 3, 5, 7};
        int[] B = {3, 0, 1, 4, 9};
        int result = commonMax.findMinimum(A, B);
        assertEquals(3, result);
    }
}
