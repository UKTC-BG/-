package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortFOR
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of elements /N/ : ");
        int n = scan.nextInt();


        int[] ARR = new int[n];
        for (int numbers = 0; numbers < n; numbers++)
        {
            System.out.printf("Input [%d] element : ", numbers);
            ARR[numbers] = scan.nextInt();
        }
        System.out.println("BEFORE SORT :");
        System.out.println(Arrays.toString(ARR));

        Bubblesort(ARR);

        System.out.println("AFTER SORT :");
        System.out.println(Arrays.toString(ARR));
    }

    public static void Bubblesort(int[] n)
    {
        boolean sorted = false;

        for (int j = 0; j < n.length-1; j++)
        {
            for(int i = 0;i <n.length-1-j;i++)
            {
                if(n[i] > n[i+1] )
                {
                    int temp1 = n[i + 1];
                    n[i+1] = n[i];
                    n[i] = temp1;
                    sorted=true;
                }
            }
        }
    }
}