package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_181_1
{

    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input sum : ");
        int Sum = Input.nextInt();

        CountNominees(Sum);

    } // end of main



    private static void CountNominees(int sum) // method за пребояване на монетите
    {
        int counter = 0; // брояч на монети
        int index = 0; // индекса на номинала с който работим
        int[] nominees = {50,20,10,5,2};

        while(sum > 0)
        {
            if(nominees[index] <= sum) // докато има още сума
            {
                sum = sum - nominees[index];
                counter++;
                System.out.println(sum + nominees[index] + "(-" + nominees[index] + "); Counter : " + counter);
            }
            else
            {
                if(index + 1 < nominees.length)
                {
                    index++;
                }
                else
                {
                    System.out.println("There is no other nominees for this Sum : " + sum);
                    break;
                }

            }

        } //end of while

        System.out.println("Number of coins is :" + counter);

    }

}
