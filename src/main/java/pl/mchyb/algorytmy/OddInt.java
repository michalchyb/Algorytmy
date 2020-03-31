package pl.mchyb.algorytmy;

import java.util.HashMap;

class OddInt {
    static int findIt(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int val = map.get(a[i]);
                map.put(a[i], val + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
