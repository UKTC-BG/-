package SORTIN_ALGORYTHMS.QUICK_SORT_185_02;

import static SORTIN_ALGORYTHMS.QUICK_SORT_185_02.QuickSortMethods.*;
import java.util.Arrays;
import java.util.Scanner;



public class QuickSortMain {

    public static void main(String[] args) {

        // Define the length of array and fill it up
        int N = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("Input The Number Of Elements : ");
        N = Input.nextInt();
        // N = Integer.parseInt(Input.nextLine()); // Same as above

        int[] ARR = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.printf("Input element [%d] of array : ",i);
            ARR[i] = Input.nextInt();
        }

        // Print BEFORE sorting
        System.out.println("BEFORE SORTING : ");
        System.out.println(Arrays.toString(ARR));

        // Call partitioning method
        QuickSort(ARR,0,ARR.length); // low = 0 and high = ARR.Lenth


        // Print AFTER sorting
        System.out.println("AFTER SORTING : ");
        System.out.println(Arrays.toString(ARR));

    }





}
