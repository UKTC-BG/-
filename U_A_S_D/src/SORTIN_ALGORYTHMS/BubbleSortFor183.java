package SORTIN_ALGORYTHMS;


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortFor183
{

    public static void main(String[] args)
    {


        //point 1
        Scanner input = new Scanner(System.in);
        System.out.println("Please input N : ");
        int N = input.nextInt();

        // point 2
        int[] ARR = new int[N];

        // point 3
        for (int i = 0; i < N; i++)
        {
            System.out.printf("Input element [%d] : ",i);
            ARR[i] = input.nextInt();
        }
        // point 4
        System.out.println("BEFORE : ");
        System.out.println(Arrays.toString(ARR));

        // point 5
        BubbleSort(ARR);

        // point 6
        System.out.println("AFTER : ");
        System.out.println(Arrays.toString(ARR));


    }// end of main

    public static void BubbleSort(int[] arr)
    {
        int BUFF = 0;
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    BUFF = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = BUFF;
                }
            }
        }
    }



} // end of class
