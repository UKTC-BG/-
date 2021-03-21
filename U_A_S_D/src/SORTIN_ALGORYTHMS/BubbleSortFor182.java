package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortFor182
{
    public static void main(String[] args)
    {
        // point 1
        Scanner input = new Scanner(System.in);
        System.out.println("Input N /numbner/ of elemnts : ");
        int N = input.nextInt();

        // point 2
        int[] ARR = new int[N];

        //point 3
        for(int i = 0; i < N; i++)
        {
            System.out.printf("Pleas input [%d]",i);
            ARR[i] = input.nextInt();
        }

        // point 4
        System.out.println("BEFORE SORTING : ");
        System.out.println(Arrays.toString(ARR));

        // point 5
        BubbleSort(ARR);

        //point 6
        System.out.println("AFTER SORTING : ");
        System.out.println(Arrays.toString(ARR));



    } // END OF MAIN

// ---------------------------------------------------------
    public static void BubbleSort(int[] arr)
        {
            int i, j, BUFF;
            int n = arr.length;

            for (i = 0; i < n-1; i++)
            {
                for(j = 0; j< n-1-i; j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                        //SWAP
                        Swap(arr,j);
                    }

                }
            }
        }// end of BubbleSort

    public static void Swap(int[] arr, int j)
    {
        int BUFF;
        BUFF = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = BUFF;
    }





}// end of class
