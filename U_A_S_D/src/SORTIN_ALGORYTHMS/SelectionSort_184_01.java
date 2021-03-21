package SORTIN_ALGORYTHMS;

import java.util.Arrays;

public class SelectionSort_184_01 {

    public static void main(String[] args) {

        int[] myArr = {52,17,46,8,29,1,25,79,14,36,7};

        System.out.println("BEFORE SORTING : " + Arrays.toString(myArr));

        int currMinIDX = 0;
        int Buff = 0;
        int n = myArr.length;
        //int currMIN = 0;

        for (int i = 0; i < n - 1; i++) {

            currMinIDX = i;

            for (int j = i + 1; j < n; j++) {

                if( myArr[j] < myArr[currMinIDX] ){

                        currMinIDX = j;
                }

            }

            Buff = myArr[i];
            myArr[i] = myArr[currMinIDX];
            myArr[currMinIDX] = Buff;
        }

        System.out.println("AFTER SORTING : " + Arrays.toString(myArr));
    }
}
