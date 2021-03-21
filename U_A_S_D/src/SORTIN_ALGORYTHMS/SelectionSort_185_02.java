package SORTIN_ALGORYTHMS;

import java.util.Arrays;

public class SelectionSort_185_02 {

    public static void main(String[] args) {

        int[] Arr = {96,27,4,15,33,65};
        int n = Arr.length;
        //int currMIN = Arr[0];
        int BUFF = 0;
        int indexOfMin = 0;

        System.out.println("UNSORTED ARR : " + Arrays.toString(Arr));

        for (int i = 0; i < n - 1; i++) {

            int currMIN = Arr[i];
            indexOfMin = i;

            for (int j = i+1; j < n; j++) {

                if ( Arr[j] < currMIN ) {
                    currMIN = Arr[j];
                    indexOfMin = j;
                }

            } // END OF INTERNAL FOR

            BUFF = Arr[i];
            Arr[i] = Arr[indexOfMin];
            Arr[indexOfMin] = BUFF;

        } // END OF EXTERNAL FOR


        System.out.println("SORTED ARR : " + Arrays.toString(Arr));


    }

}
