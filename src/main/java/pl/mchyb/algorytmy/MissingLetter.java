package pl.mchyb.algorytmy;


import java.util.stream.IntStream;

public class MissingLetter {

    static char findMissingLetter(char[] array) {

        int[] nums = new String(array).chars().sorted().toArray();
        int missingletter = IntStream.range(1, nums.length).filter(
                index -> nums[index] - nums[index - 1] != 1).findFirst().getAsInt();
        return (char) (nums[missingletter] - 1);
    }
}
