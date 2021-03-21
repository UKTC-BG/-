package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Greedy_Algorithm_Nominees
{
    public static void main(String[] args)
    {
        int Sum = 0;// СУМА, КОЯТО ЩЕ ПРОВЕРЯВАМЕ

        Scanner Input = new Scanner(System.in);
        System.out.println("ВЪВЕДЕТЕ СУМАТА : ");
        Sum = Input.nextInt();

        CountNominees(Sum); // ИЗВИКВАНЕ НА МЕТОД CountNominees()

    } // end of main


    // method CountNominees
    public static void CountNominees(int Sum)
    {
        int[] Nominees = {50,20,10,5,2,1};// МАСИВ ЗА НОМИНАЛИ НА МОНЕТИТЕ
        int Counter = 0;// БРОЯЧ ЗА МОНЕТИТЕ
        int index = 0;

        while (Sum > 0)
        {
            if(Sum / Nominees[index] > 0)
            {
                Sum = Sum - Nominees[index];
                Counter++;
                System.out.println(Sum+Nominees[index]+"(-"+Nominees[index]+") [БРОЯЧ:"+Counter+"]");
            }
            else
                if(index+1 < Nominees.length)
                {
                    index++;// ПРЕМИНАВАМЕ НА СЛЕДВАЩИЯ НОМИНАЛ ОТ МАСИВА
                }
                else
                {
                    System.out.println("НЯМАТЕ ПОВЕЧЕ НОМИНАЛИ ЗА ПРЕДСТАВЯМЕ НА СУМАТА : " + Sum);
                    break;
                }

        }

        System.out.println();
        System.out.println("БРОЙ НА МОНЕТИТЕ  : " + Counter);

    } // end of method CountNominees

} // end of class
