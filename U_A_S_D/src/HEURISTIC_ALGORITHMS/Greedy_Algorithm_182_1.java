package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_182_1
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please, input sum : ");
        int Sum = Input.nextInt();

        CountNominees(Sum);

    } // emd of main

    private static void CountNominees(int sum)
    {
        int counter = 0;
        int index = 0;
        int[] nominees = {50,20};

        while(sum > 0)
        {
            if(nominees[index] <= sum) // проверяваме дали номинала може да се нанаесе в сумата
            {
                sum = sum - nominees[index];
                counter++;
                System.out.println(sum + nominees[index] +"(-" + nominees[index] + "); Counter : " + counter);
            }
            else
            {
                if (index + 1 < nominees.length) // проверяваме дали има още номинали в масива
                {
                    index++;
                }
                else
                {
                    System.out.println("There is no more nominees for this sum :" + sum);
                    break;
                }
            }
        } // end of while

        System.out.println("Number of coins is : " + counter);

    } // end of method

} // end of class
