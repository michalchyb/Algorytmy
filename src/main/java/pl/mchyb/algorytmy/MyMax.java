/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package pl.mchyb.algorytmy;

public class MyMax implements Max {

    @Override
    public int findMax(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int max = array[0];
        int position = 0;

        for(int i=1; i<array.length; i++) {
            if (max < array[i]) {
                position = i;
                max = array[i];
            }
        }
        return position;
    }



}

