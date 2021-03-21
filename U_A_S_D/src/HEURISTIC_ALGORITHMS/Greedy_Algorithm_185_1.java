package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_185_1 // BEGIN OF CLASS
{

    public static void main(String[] args) // BEGIN OF MAIN
    {
        Scanner Input = new Scanner((System.in));
        System.out.println("Input Amount : ");
        int Sum = Input.nextInt();

        FindNominees(Sum);
    } // end of main



    public static void FindNominees(int Sum) // BEGIN OF METHOD
    {
        int counter = 0;
        int index = 0;
        int[] nominees = {50,20,10};

        while(Sum > 0)
        {

            if(nominees[index] <= Sum)
            {
                Sum = Sum - nominees[index];
                counter++;
                System.out.println( Sum + nominees[index] + "(-" + nominees[index] + "); Counter : " + counter );

            }
            else
                if (index + 1 < nominees.length)
                {
                    index++;
                }
                else
                {
                    System.out.println("No more nominees for this sum " + Sum + " !!!");
                    break;
                }

        } // end of while

        System.out.println("Number of coins is : " + counter);


    } // end of method


} // end of class
