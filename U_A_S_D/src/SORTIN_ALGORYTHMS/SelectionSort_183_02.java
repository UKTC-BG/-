package SORTIN_ALGORYTHMS;

// import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;

public class SelectionSort_183_02 {

    public static void main(String[] args) {
        int[] ArrToSort = {25,8,13,55,49,36,98,2};
        int currMinIDX = 0;
        int buff = 0;
        int n = ArrToSort.length;

        System.out.println("BEFORE SORTING : " + Arrays.toString(ArrToSort));

        for (int i = 0; i < n; i++) {

            currMinIDX = i;

            for (int j = i; j < n; j++) {

                if(ArrToSort[j] < ArrToSort[currMinIDX]){
                    currMinIDX=j;
                }
            }// end of int for

            //SWAP
            buff = ArrToSort[i];
            ArrToSort[i] = ArrToSort[currMinIDX];
            ArrToSort[currMinIDX] = buff;

        }// end of ext for

        System.out.println("AFTER SORTING : " + Arrays.toString(ArrToSort));
    }
}


