package pl.mchyb.algorytmy;

import java.util.List;

public class ArrayToBinar {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

       String concat = "";
        for(Integer i : binary) {
            concat += Integer.toString(i);
        }
        return Integer.parseInt(concat,2);
    }
}
