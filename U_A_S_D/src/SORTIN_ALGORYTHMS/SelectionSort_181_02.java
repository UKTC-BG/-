package SORTIN_ALGORYTHMS;

//import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;

public class SelectionSort_181_02 {

    public static void main(String[] args) {

        int[] ArrToSort = {25,8,77,43,12,36,91,5};
        int currMinIDX = 0;
        int buff = 0;
        int n = ArrToSort.length;

        System.out.println("BEFOR SORTING" + Arrays.toString(ArrToSort));

        for (int i = 0; i < n; i++) {


            for (int j = i; j < n; j++) {

                if(ArrToSort[j] < ArrToSort[currMinIDX]){

                    buff = ArrToSort[j];
                    ArrToSort[j] = ArrToSort[currMinIDX];
                    ArrToSort[currMinIDX] = buff;
                }

            }
            currMinIDX = i;

        }

        //@TestOnly

        System.out.println("AFTER SORTING" + Arrays.toString(ArrToSort));

    }// end of main

}// end of class
