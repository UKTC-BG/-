package SORTIN_ALGORYTHMS;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort
{
    // МЕИН МЕТОД ----------------------------------
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of elements /N/ : ");
        int n = scan.nextInt();


        int[] ARR = new int[n];

        for (int numbers = 0; numbers < n; numbers++)
        {
            System.out.printf("Input [%d] element : ", numbers);
            ARR[numbers] = scan.nextInt();
        }

        System.out.println("BEFORE SORT :");
        System.out.println(Arrays.toString(ARR));

        InsertionSort(ARR);

        System.out.println("AFTER SORT :");
        System.out.println(Arrays.toString(ARR));

    } // End of MAIN ----------------------------------



    // СОРТИРАЩ МЕТОД ----------------------------------
    public static void InsertionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 1; i < n; ++i)
        {
            int eXtracted = arr[i];// ВЗИМАМЕ i-ТИЯ ЕЛЕМЕНТ КАТО EXTRACTED (X)
                            // С НЕГО ЩЕ СРАВНЯВАМЕ ОСТАНАЛИТЕ ПРЕД НЕГО
            int j = i - 1;// J НАМАЛЯВАМЕ С 1, ЗА ДА ПРОВЕРИМ ВСИЧКИ ЕЛЕМЕНТ ПРЕДИ (Х)

            /* Премвстваме елементите от arr[0..i-1], които са
               по-големи от eXtracted, с един елемент напред за да освободим
               една позиция от тяхната текуща позиция */

            while ( j >= 0 && eXtracted > arr[j] )// j НАМАЛЯВА ДОКАТО Е ПО ГОЛЯМО ОТ KEY-ЕЛЕМЕНТА
            {
                arr[j + 1] = arr[j];// ПРЕМЕСТВАМЕ С ЕДНО НАДЯСНО
                j = j - 1;// НАМАЛЯВАМЕ ИНДЕКСА НА ЕЛЕМЕНТА
            }
            arr[j + 1] = eXtracted;// ЗАПИСВАМЕ EXTRACTED (X) ЕЛЕМЕНТ НА ОСВОБОДЕНАТА ПОЗИЦИЯ
        }
    } // End of Sorting Method


}// End of CLASS
