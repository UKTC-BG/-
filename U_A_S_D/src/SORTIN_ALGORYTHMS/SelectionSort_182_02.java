package SORTIN_ALGORYTHMS;

import java.util.Arrays;

public class SelectionSort_182_02 {

    public static void main(String[] args) {

        int[] myArray = {15,33,7,58,42,16,34,1};// 8
        System.out.println("BEFOR SORTING : " + Arrays.toString(myArray));
        int n = myArray.length;
        int currMinIDX = 0;
        int Buff = 0;
        int curr = 5;

        System.out.println(curr/2);

        for (int i = 0; i < n - 1; i++) {

            for (int j = i; j < n; j++) {

                if(myArray[currMinIDX] > myArray[j])
                {
                    currMinIDX = j;
                }
            }

            Buff = myArray[i];
            myArray[i] = myArray[currMinIDX];
            myArray[currMinIDX] = Buff;
        }

        System.out.println("AFTER SORTING : " + Arrays.toString(myArray));

    }

}
