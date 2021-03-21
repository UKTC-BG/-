package DATA_STRUCTURES;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Dictionary_Months_HOMEW_Enumeration {

    public static void main(String[] args) {

         Scanner InputScanner = new Scanner(System.in);

        // РЕАЛИЗАЦИЯ НА Dictionary ЧРЕЗ HashTable
        // Dictionary предполага наличиевто на двойка <key : value>
        Dictionary<Integer, String> MyDictionary = new Hashtable<>();
        //           key :  value

        //              key : value
        MyDictionary.put(3, "MARCH");
        MyDictionary.put(11, "NOVEMBER");
        MyDictionary.put(8, "AUGUST");
        MyDictionary.put(1, "JANUARY");
        MyDictionary.put(4, "APRIL");
        MyDictionary.put(10, "OCTOBER");
        MyDictionary.put(7, "JULY");
        MyDictionary.put(6, "JUNE");
        MyDictionary.put(12, "DECEMBER");
        MyDictionary.put(5, "MAY");
        MyDictionary.put(9, "SEPTEMBER");
        MyDictionary.put(2, "FEBRUARY");

        System.out.println();

        // PRINT DICTIONARY SIZE : ----------------------------------------------------------------
        int NumberOfElements = MyDictionary.size();
        System.out.println("Number of elements : " + NumberOfElements);
        System.out.println();


        // PRINT DICTIONARY CONTENT : --------------------------------------------------------------
        System.out.println("Print whole dictionary : " + MyDictionary);
        System.out.println();


        // Questioning user :
        System.out.print("Изберете търсене по : 1. Ключ |  2. Стойност : ");
        int choice = InputScanner.nextInt();




        // Search by KEY ==========================================================================
        if (choice == 1){

            Enumeration<Integer> itemsKeys = MyDictionary.keys();       // Дефинираме набор (enumeration) от КЛЮЧОВЕ
            Enumeration<String> itemsValues = MyDictionary.elements();  // Дефинираме набор (enumeration) от СТОЙНОСТИ


            System.out.print("Въведете НОМЕРА на месеца  : ");
            String month_number = InputScanner.next();

            while(itemsKeys.hasMoreElements()){ // Правим итерации върху КЛЮЧОВЕТЕ

                String currentKey = itemsKeys.nextElement().toString();     // Взимаме поредния КЛЮЧ
                String currentValue = itemsValues.nextElement();            // Взимаме поредната СТОЙНОСТ

                if( currentKey.equals(month_number) ){    // Проверяваме дали КЛЮЧА е равен на търсения

                    System.out.println(currentValue);       // Разпечатваме неговата СТОЙНОСТ
                }
            }
        }




        // Search by VALUE ========================================================================
        if (choice == 2){

            Enumeration<Integer> itemsKeys = MyDictionary.keys();       // Дефинираме набор (enumeration) от КЛЮЧОВЕ
            Enumeration<String> itemsValues = MyDictionary.elements();  // Дефинираме набор (enumeration) от СТОЙНОСТИ


            System.out.print("Въведете ИМЕТО на месеца  : ");
            String month_name = InputScanner.next();

            while(itemsValues.hasMoreElements()){ // Правим итерации върху СТОЙНОСТИТЕ

                String currentKey = itemsKeys.nextElement().toString();     // Взимаме поредния КЛЮЧ
                String currentValue = itemsValues.nextElement();            // Взимаме поредната СТОЙНОСТ

                if( currentValue.equals(month_name) ){  // Проверяваме дали СТОЙНОСТТА е равна на търсената

                    System.out.println(currentKey);     // Разпечатваме найния КЛЮЧ
                }
            }
        }
    }
}


















// ////////////////////   FOR EXPERIMENTS ////////////////////////////////////////////////////////////////////////////
/*


        // ADDRESS OF KEYS.............................................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("3.1 Address of KEYS : " + MyDictionary.keys());
        }
        System.out.println();



        // ADDRESS OF ELEMENTS.............................................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("3.2 Address of KEYS : " + MyDictionary.elements());
        }
        System.out.println();



        // ADDRESS OF ELEMENTS - NOT WORK PROPER .........................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("4. Address of VALUES : " + MyDictionary.get(MyDictionary.keys()));
        }
        System.out.println();



        // PRINT KEYS BY ENUMERATOR....................................................
        for (Enumeration i = MyDictionary.keys(); i.hasMoreElements();)
        {
            System.out.println("5. KEYS in Dictionary : " + i.nextElement());
        }
        System.out.println();



        // PRINT ELEMENTS BY ENUMERATOR.......................................................
        for (Enumeration i = MyDictionary.elements(); i.hasMoreElements();)
        {
            System.out.println("6. VALUES in Dictionary : " + i.nextElement());
        }
        System.out.println();



        // REMOVE ELEMENT .................................................
        MyDictionary.remove(3);
        MyDictionary.remove(5);



        // PRINT KEYS BY ENUMERATOR....................................................
        for (Enumeration i = MyDictionary.keys(); i.hasMoreElements();)
        {
            System.out.println("7. KEYS in Dictionary (after remove) : " + i.nextElement());
        }
        System.out.println();




        // PRINT VALUES (ELEMENTS) BY ENUMERATOR....................................................
        for (Enumeration i = MyDictionary.elements(); i.hasMoreElements();)
        {
            System.out.println("8. VALUES in Dictionary (after remove) : " + i.nextElement());
        }
        System.out.println();

    }


        for (Entry<Integer, String> entry : testMap.entrySet()) {
            if (entry.getValue().equals("c")) {
                System.out.println(entry.getKey());
            }


        /*    for(Enumeration items = MyDictionary.elements(); items.hasMoreElements();) {

                System.out.println(items.asIterator());

                String currentMonth = items.nextElement().toString();

                if(currentMonth.equals(month_name)) {

                    System.out.println( "Номерът на месецът е :  " + currentMonth );
                }
            }


*/


