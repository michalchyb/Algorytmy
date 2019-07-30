package pl.mchyb.algorytmy;

import java.util.Arrays;

public class HighAndLow {
    public static String HighAndLowNumber(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i ->Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i ->Integer.parseInt(i))
                .max()
                .getAsInt();

        System.out.println(max);
        System.out.println(min);
        return String.format("%d %d", max, min) ;
    }
}
