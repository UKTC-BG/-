package HEURISTIC_ALGORITHMS;
import java.util.Scanner;

public class Greedy_Algorithm_182_2
{
    // BEGIN OF MAIN =============================================================================
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("INPUT SUM : ");
        int Sum = Input.nextInt();

        CountNominees(Sum); // ИЗВИКВАНЕ НА МЕТОДА ЗА ПРЕБРОЯВАНЕ НА МОНЕТИТЕ
    }
    // END OF MAIN ==============================================================================



    // METHOD - COUNT NOMINEES ------------------------------------------------------------------------------
    public static void CountNominees(int Sum)
    {
        // ИНДЕКСА НА ПОЛЗВАНИЯ НОМИНАЛ ОТ МАСИВА
        int index = 0;
        int[] nominees = {50,20,10,5}; // МАСИВ С НОМИНАЛИТЕ


        // БРОЯЧ ЗА МОНЕТИ
        int counter = 0;
        while (Sum > 0) // АКО ВСЕ ОЩЕ ИМА СУМА ЗА ДЕНОМИНИРАНЕ
     {
         if(Sum/nominees[index] > 0) // АКО СЪОТВЕТНИЯ НОМИНАЛ МОЖЕ ДА БЪДЕ ПРИСПАДНАТ
         {
             Sum = Sum - nominees[index]; // ПРИСПАДАМЕ НОМИНАЛА
             counter++; // УВЕЛИЧАВАМЕ БРОЯЧА ЗА МОНЕТИ
             System.out.println(Sum + nominees[index] + "(-" + nominees[index] + ")" + " --> COUNTER : " + counter);
         }
         else
             if(index+1 < nominees.length)// АКО НЕ СМЕ ДОСТИГНАЛИ КРАЯ НА МАСИВА С НОМИНАЛИТЕ
             {
                 index++;// УВЕЛИЧАВАМЕ ИНДЕКСА, ЗА ДА РАБОТИМ СЪС СЛЕДВАЩИЯ НОМИНАЛ
             }
             else
                 {
                     System.out.println();
                     System.out.println("NO MORE NOMINEES FOR THIS SUM :" + Sum);
                     break;
                 }

     }// end Of While

        System.out.println();
        System.out.println("COUNTER IS : " + counter);

    }// end of method CountNominees -------------------------------------------------------------------------

}// END OF CLASS