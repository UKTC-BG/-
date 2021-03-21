package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortFor185
{
    public static void main(String[] args)
    {
        // Point 1
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas input the number of values /N/ :");
        int N = input.nextInt();

        // Point 2
        int[] ARR = new int[N];

        // Point 3
        for (int i = 0; i < N; i++)
        {
            System.out.printf("Input the [%d] element :",i);
            ARR[i] = input.nextInt();
        }

        // Point 4
        System.out.println("ARR BEFOR SORTING : ");
        System.out.println(Arrays.toString(ARR));

        // Point 5
        BubbleSort(ARR);

        // Point 5
        System.out.println("ARR AFTER SORTING : ");
        System.out.println(Arrays.toString(ARR));

    }// end of main



    public static void BubbleSort(int[] arr)
    {
        int i, j, BUFF;
        for (i=0; i < arr.length-1; i++)
        {
            for (j=0; j< arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // SWAP
                    BUFF = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = BUFF;
                }
            }
        }
    }

}
