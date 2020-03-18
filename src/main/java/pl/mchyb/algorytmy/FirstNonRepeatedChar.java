package pl.mchyb.algorytmy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static char firstNotRepeatingCharacter(String s) {
        char result = 0;
        Map<Character, Integer> counts = new LinkedHashMap<>(s.length());
        for (char c : s.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return result;
    }
}
