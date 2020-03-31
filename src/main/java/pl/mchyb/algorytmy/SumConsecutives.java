package pl.mchyb.algorytmy;

import java.util.ArrayList;
import java.util.List;

class SumConsecutives {

    static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            if (i == 0 || s.get(i) != s.get(i - 1))
                sums.add(s.get(i));
            else
                sums.set(sums.size() - 1, sums.get(sums.size() - 1) + s.get(i));
        }
        return sums;
    }
}
