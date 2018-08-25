package pl.mchyb.algorytmy;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMaxTest {

    private Max max;

    @Before
    public void testSetup() throws Exception {
        max = new MyMax();
    }

    @Test
    public void findMaxFromTaskDescription() throws Exception {
        //given
        final int[] array = {1, 2, 3, 0, -1};

        //when
        int result = max.findMax(array);

        //then
        assertEquals(2, result);
    }

}