package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_185_2
{
    public static void main (String[] args)
    {
        Scanner Input = new Scanner(System.in);
        // point 1
        System.out.println("МОЛЯ ВЪВЕДЕТЕ СУМАТА : ");
        int Sum = Input.nextInt();

        CountNominees(Sum);

    }// end of main

        public static void CountNominees(int Sum)
        {
            int counter = 0; // БРОЯЧ ЗА МОНЕНТИТЕ
            int index = 0; // Индекс за масива с номинали
            int[] nominees = {50, 20, 10, 5, 2, 1}; //Масив с номинали


            while (Sum > 0)
            {
                if (Sum/nominees[index]>0)
                {
                    Sum = Sum-nominees[index];
                    counter++; //
                    System.out.println(Sum+nominees[index] + "(-" + nominees[index]+") [БРОЯЧ:"+counter+"]");

                }
                else
                index++; // Преминавам на следващия номинал от масива с номонали



            } // End of while

            System.out.println();
            System.out.println("БРОЙ НА МОНЕТИТЕ E : " + counter);

        } // End of Method - CountNominees



}// end of class
