package SORTIN_ALGORYTHMS.QUICK_SORT_182_02;


import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.QUICK_SORT_182_02.QuickSortMethods.QuickSort;

public class QuickSortMain {

    public static void main(String[] args) {

    int N = 0;

    Scanner Input = new Scanner(System.in);

        System.out.println("Input the number of elements : ");
        N = Input.nextInt();

    int[] ARR = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.printf("Input the [%d] element : ", i);
            ARR[i] = Input.nextInt();
        }

    // Print before
        System.out.println("BEFORE : " + Arrays.toString(ARR));

    // Quick Sort

    QuickSort(ARR,0,N-1);

    // Print After
        System.out.println("AFTER : " + Arrays.toString(ARR));


    }

}
