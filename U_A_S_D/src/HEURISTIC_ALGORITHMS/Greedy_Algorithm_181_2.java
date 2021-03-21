package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_181_2
{
    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);
        System.out.print("INPUT SUM : ");
        System.out.println();
        int Sum = Input.nextInt();

        CountNominees(Sum);

    }// End of MAIN


    // METHOD CountNominees ---------------------------------------------------------------

    private static void CountNominees(int Sum)
    {
        int counter = 0;
        int index = 0;
        int[] nominees = {50,20,10,5,2};


        while(Sum > 0)
        {
            //if(Sum / nominees[index] > 0)
            if(nominees[index] <= Sum)// ПРОВЕРЯВАМЕ ДАЛИ НОМИНАЛА СЕ СЪДЪРЖА В СУМАТА
            {
                Sum = Sum - nominees[index];
                counter++;
                System.out.println(Sum+nominees[index] + "(-" + nominees[index] + "); COUNTER IS : " + counter);
            }
            else
            {
                if(index + 1 < nominees.length)
                {
                    index++;
                }
                else
                    {

                        System.out.println();
                        System.out.println("NO MORE NOMINEES FOR THIS SUM :" + Sum);
                        break;
                    }

            }

        }// end of while

    }// End of METHOD

} // End of Class
