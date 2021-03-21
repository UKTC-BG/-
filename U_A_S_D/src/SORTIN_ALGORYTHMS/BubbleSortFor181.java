package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;


public class BubbleSortFor181
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // point 1
        System.out.println("Input the number of elements N : ");
        int N = input.nextInt();

        // point 2
        int[] arr = new int[N];

        // point 3
        for(int i=0; i<N; i++)
        {
            System.out.printf("Please input element [%d] :",i);
            arr[i] = input.nextInt();
        }

        // point 4
        System.out.println("BEFORE SORTING : ");
        System.out.println(Arrays.toString(arr));

        // point 5
        BubbleSort(arr);

        // point 6
        System.out.println("AFTER SORTING : ");
        System.out.println(Arrays.toString(arr));

    } // end of MAIN

    public static void BubbleSort(int[] ARR)
    {
        int BUFF;
        int N = ARR.length;

        for (int i = 0; i < N-1; i++)
        {
            for (int j = 0; j < N-i-1; j++)
            {
                if (ARR[j] > ARR[j+1])
                {
                    BUFF = ARR[j];
                    ARR[j] = ARR[j+1];
                    ARR[j+1] = BUFF;
                }
            }
        }
    }
}
