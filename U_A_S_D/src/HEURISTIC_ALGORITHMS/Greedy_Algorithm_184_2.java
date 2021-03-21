package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_184_2 // Begin of Class
{

    public static void main(String[] args) // Begin of MAIN
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input amount : ");
        int Sum = Input.nextInt();

        CountNominees(Sum);

    } // end of main



    public static void CountNominees(int Sum) //Begin of Method
    {
        int counter = 0; // counts the number of nominees
        int index = 0; // index of current nominal
        int[] nominees = {30,20,5};


        while (Sum > 0) // Ако все още има сума за представяне с номинали
        {

            if (nominees[index] <= Sum) // ако текущия номинал може да се нанесе в сумата
            {
                Sum = Sum - nominees[index];
                counter++;
                System.out.println(Sum + nominees[index] + "(-" + nominees[index] + "); Counter is : " + counter);
            }
            else
            {
                if(index + 1 < nominees.length) // проверявам дали индекса няма да излезе извън рамера на масива
                {
                    index++;
                }
                else
                {
                    System.out.println("You don't have more nominees for this amount : " + Sum);
                    break;
                }
            }

        } // end of while

        System.out.println("Number of coins is :" + counter);

    } // end of Method

}// end of Class
