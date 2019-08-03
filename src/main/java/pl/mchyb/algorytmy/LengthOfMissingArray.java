import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Kata
{
  public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (isNotValid(arrayOfArrays)) {
            return 0;
        }
        List<Integer> lengthsOfhArrays = getSortedLengthsOfArrays(arrayOfArrays);
        return getMissedLength(lengthsOfhArrays);
    }

    private static boolean isNotValid(Object[][] arrayOfArrays) {
        if ( arrayOfArrays == null || arrayOfArrays.length == 0 ) {
            return true;
        }
        for (Object[] arr : arrayOfArrays) {
            if (arr == null || arr.length == 0) {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> getSortedLengthsOfArrays(Object[][] arrayOfArrays) {
        List<Integer> lengthsOfArrays = new ArrayList<>();
        for (Object[] arr : arrayOfArrays) {
            lengthsOfArrays.add(arr.length);
        }
        Collections.sort(lengthsOfArrays);
        return lengthsOfArrays;
    }

    private static int getMissedLength(List<Integer> lengthArr) {
        for (int i = 0; i < lengthArr.size() - 1; i++) {
            int currentLength =  lengthArr.get(i);
            int nextLength = lengthArr.get(i + 1);
            if ( currentLength + 1 !=  nextLength ) {
                return currentLength + 1;
            }
        }
        return 0;
    }
}
