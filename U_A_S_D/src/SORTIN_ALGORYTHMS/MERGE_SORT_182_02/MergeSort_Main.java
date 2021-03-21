package SORTIN_ALGORYTHMS.MERGE_SORT_182_02;

import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.MERGE_SORT_182_02.MergeSort_Methods.*;

public class MergeSort_Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Input number of elements : ");

        // int N = Integer.parseInt(Input.nextLine());
        int N = Input.nextInt();

        int[] ARR = new int[N];


        // FOR CYCLE - ВЪВЕЖДА ЕЛЕМЕНТИТЕ НА МАСИВА
        for (int i = 0; i < N; i++) {
            System.out.println("Input element : " + i);
            ARR[i] = Integer.parseInt(Input.next());
        }

        // print before
        System.out.println("BEFOR SORT : " + Arrays.toString(ARR));


        // MergeSort_Methods.Divide(ARR,0,N-1);
        Divide(ARR,0,N-1);

        // print after
        System.out.println("AFTER SORT : " + Arrays.toString(ARR));

    }
}
