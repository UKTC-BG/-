package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortFor184
{
        public static void main (String[] args)
    {
        // POINT 1
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of elements N : ");
        int N = input.nextInt();

        // POINT 2
        int[] ARR = new int[N];

        // POINT 3
        for (int i=0; i < N; i++)
        {
            System.out.printf("Pleas input elemnt [%d]",i);
            ARR[i] = input.nextInt();
        }

        // POINT 4
        System.out.println();
        System.out.println("BEFORE SORTING : ");
        System.out.println(Arrays.toString(ARR));

        //POINT 5
        BubbleSort(ARR);

        //POINT 6
        System.out.println("AFTER SORTING : ");
        System.out.println(Arrays.toString(ARR));

    } // end of main

    public static void BubbleSort(int[] arr)
    {
        int i, j, BUFF;
        int N = arr.length;

        for (i=0;i<N-1;i++)
        {
            for(j=0;j<N-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //SWAP
                    BUFF = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = BUFF;
                }
            }
        }
    }
}
