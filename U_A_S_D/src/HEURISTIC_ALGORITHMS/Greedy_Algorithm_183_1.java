package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_183_1
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Pleas input sum : ");
        int Sum = Input.nextInt();

        CountNominees(Sum);

    } // end of main ==================================================

    private static void CountNominees(int sum)
    {
        int counter = 0;
        int index = 0;
        int[] nominees = {30,20,5};


        while (sum > 0)
        {
            if(nominees[index] <= sum)
            {
                sum = sum - nominees[index];
                counter++;
                System.out.println(sum + nominees[index] + "(-" + nominees[index] + "); Counter is : " + counter);
            }
            else
            {
                if(index + 1 < nominees.length)
                {
                    index++;
                }
                else
                {
                    System.out.println("There is no more nominees for this sum : " + sum);
                    break;
                }

            }

        }
        System.out.println("Number of coins is : " + counter);

    }

}