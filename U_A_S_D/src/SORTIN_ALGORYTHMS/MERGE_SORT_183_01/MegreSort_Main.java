package SORTIN_ALGORYTHMS.MERGE_SORT_183_01;

import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.MERGE_SORT_183_01.MergeSort_Methods.*;
import static SORTIN_ALGORYTHMS.MERGE_SORT_183_01.MergeSort_Utility.*;


public class MegreSort_Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Input number of elements :");
        // int N = Integer.parseInt(Input.nextLine());
        int N = Input.nextInt();
        int[] ARR = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Input element [" + i + "] : ");
            ARR[i] = Input.nextInt();
        }

        System.out.println("BEFORE SORTING : " + Arrays.toString(ARR));

        Divide(ARR, 0, N - 1);// МЕТОДА Е В КЛАСА MergeSort_Methods

        System.out.println("AFTER SORTING : " + Arrays.toString(ARR));

    }// end of main

}// end of class
