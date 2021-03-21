package HEURISTIC_ALGORITHMS;
import java.util.Scanner;

public class Greedy_Algorithm_183_2
{
    public static void main(String[] args)
    {
            Scanner Input = new Scanner(System.in);
            System.out.println("INPUT SUM : ");
            int Sum = Input.nextInt();

            CountNominees(Sum);
    }  // end of MAIN

    public static void CountNominees(int Sum)
    {
        int counter = 0;
        int index = 0;
        int[] nominees = {50,20,10,5,2,1};

        while(Sum > 0)
        {
            if(Sum >= nominees[index])
            {
                Sum = Sum - nominees[index];
                counter++;
                System.out.println(Sum + nominees[index] + "(-" + nominees[index] + ") COUNTER IS : " + counter);
            }
            else
            {
                if(index + 1 < nominees.length)
                {
                    index++;
                }
                else
                {
                    System.out.println("NO MORE NOMINEES FOR THIS SUM :" + Sum);
                    break;
                }
            }

        }// end of while

        System.out.println();
        System.out.println("NUMBER OF COINS IS : " + counter);

    }// end of METHOD

} // end of class
