package pl.mchyb.algorytmy;

public class PangramChecker {
    public boolean check(String sentence) {
        boolean[] mark = new boolean[26];

        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
                index = sentence.charAt(i) - 'A';
            else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')

                index = sentence.charAt(i) - 'a';
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return false;
        return true;
    }

    boolean checkSecondVersion(final String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}