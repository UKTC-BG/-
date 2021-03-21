package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_184_1
{
    // MAIN ==========================================
 public static void main(String[] args)
 {
     Scanner Input = new Scanner(System.in);
     System.out.println("МОЛЯ ВЪВЕДЕТЕ СУМАТА : ");
     int Sum = Input.nextInt();

     CountNominees(Sum);

 } // end of MAIN


    // METHOD - COUNT NOMINEES =======================
    public static void CountNominees(int Sum)
    {
        int counter = 0;// Брояч за монетите
        int index = 0; // Индекс на ползвания номинал
        int[] nominees = {50,20,10,5,2,1}; // Масив с номиналите

        while (Sum > 0)
        {
            if( Sum/nominees[index] > 0 )
            {
                Sum = Sum - nominees[index];
                counter++;
                System.out.println(Sum + nominees[index] + "(-" + nominees[index] + ") [БРОЯЧ:" + counter + "]");

            }
            else index++;

        } // end of while

        System.out.println("БРОЯ НА МОНЕТИТЕ Е : " + counter);

    } // End of Method-CountNominees

} // end of Class
