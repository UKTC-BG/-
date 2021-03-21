package SORTIN_ALGORYTHMS.MERGE_SORT_185_01;

import java.util.Scanner;

import static SORTIN_ALGORYTHMS.MERGE_SORT_185_01.MergeSort_Methods.*;

public class MergeSort_Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Input number of elements : ");
        int N = Input.nextInt();
        int[] arr = new int[N];

        Divide(arr,0,arr.length-1);
        //MergeSort_Methods.Sort(arr,0,arr.length-1);

    }



}
