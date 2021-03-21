package SORTIN_ALGORYTHMS;

import java.util.Arrays;

public class SelectionSort_181_01 {

    public static void main(String[] args) {

        int[] Arr = {45,12,8,36,99,57};
        int currMinIDX = 0;
        int buff = 0;

        System.out.println("BEFORE SORTING : " + Arrays.toString(Arr));

        for (int i = 0; i < Arr.length; i++) {
            currMinIDX = i;

            for (int j = i; j < Arr.length; j++) {

                if (Arr[j] < Arr[currMinIDX]) {
                    currMinIDX = j;
                }

            }// inner FOR
                buff = Arr[i];
                Arr[i] = Arr[currMinIDX];
                Arr[currMinIDX] = buff;
        }// outer FOR

        System.out.println("AFTER SORTING : " + Arrays.toString(Arr));

    }
}
