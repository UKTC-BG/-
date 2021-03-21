package SORTIN_ALGORYTHMS.MERGE_SORT_185_02;

import java.util.Arrays;
import java.util.Scanner;
import static SORTIN_ALGORYTHMS.MERGE_SORT_185_02.MergeSort_Methods.*;


public class MergeSort_Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Input number of elements : ");
        int N = Input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Please input the [" + i + "] element : ");
            arr[i] = Integer.parseInt(Input.next());
            //arr[i] = Input.nextInt(); // същото като горе
        }

        System.out.println();
        System.out.println("BEFORE MERGE-SORT " + Arrays.toString(arr));

        Divide(arr,0,arr.length-1);

        System.out.println();
        System.out.println("AFTER MERGE-SORT " + Arrays.toString(arr));


    }




}
