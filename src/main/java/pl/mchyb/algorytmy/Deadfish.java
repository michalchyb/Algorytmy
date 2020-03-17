package pl.mchyb.algorytmy;

import java.util.ArrayList;
import java.util.List;

public class Deadfish {

    public static int[] parse(String data) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (char ch : data.toCharArray()) {
            if (ch == 'i')
                result++;
            else if (ch == 'd')
                result--;
            else if (ch == 's')
                result *= result;
            else if (ch == 'o')
                list.add(result);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
