package SORTIN_ALGORYTHMS.MERGE_SORT_184_01;

import java.util.Arrays;
import java.util.Scanner;


//import static SORTIN_ALGORYTHMS.MERGE_SORT_184_01.MergeSort_Methods.Divide;
import static SORTIN_ALGORYTHMS.MERGE_SORT_184_01.MergeSort_Methods.*;


public class MergeSort_Main {


    // MAIN METHOD ///////////////////////////////////////////////////////
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Input number of elements : ");
        //int N = Input.nextInt(); // Същото като долу
        int N = Integer.parseInt(Input.nextLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.println("Input element "+ i +": ");
            arr[i] = Integer.parseInt(Input.nextLine());
        }


        System.out.println("BEFORE MERGE SORT : " + Arrays.toString(arr));

        // MergeSort_Methods.Divide(arr,0,arr.length-1);
        // MergeSort_Methods myOb = new MergeSort_Methods();
        // myOb.Divide(arr,0,arr.length-1);

        Divide(arr,0,arr.length-1);

        System.out.println("AFTER MERGE SORT : " + Arrays.toString(arr));


    }// emd of main

}// end of class
