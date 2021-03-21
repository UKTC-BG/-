package SORTIN_ALGORYTHMS.QUICK_SORT_184_01;

import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.QUICK_SORT_184_01.QuickSortMethods.*;

public class QuickSortMain {
    public static void main(String[] args) {
        int N = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("Please, input the number of elements : ");
        N = Input.nextInt();
        // N = Integer.parseInt(Input.nextLine()); // Same as above

        int[] ARR = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Please input element [%d]",i);
            ARR[i] = Input.nextInt();
        }

        // Print BEFORE sorting
        System.out.println("BEFORE SORTING" + Arrays.toString(ARR));


        // CAll Sorting Method
        QuickSort(ARR,0,N-1);


        // Print AFTER sorting
         System.out.println("AFTER SORTING" + Arrays.toString(ARR));
    }
}
