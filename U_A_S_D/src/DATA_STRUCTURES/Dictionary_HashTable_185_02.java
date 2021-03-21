////////////////////////////////////////////////////
//          DICTIONARY WITH HASHTABLE            //
////////////////////////////////////////////////////


package DATA_STRUCTURES;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary_HashTable_185_02 {

    public static void main(String[] args) {

        // РЕАЛИЗАЦИЯ НА Dictionary ЧРЕЗ HashTable
        // Dictionary предполага наличиевто на двойка <key : value>
        Dictionary<Integer, String> MyDictionary = new Hashtable<>();
        //           key :  value

/*

        //              key : value
        MyDictionary.put(1,  "Monday");
        MyDictionary.put(2,  "Tuesday");
        MyDictionary.put(3,  "Wednesday");
        MyDictionary.put(4,  "Thursday");
        MyDictionary.put(5,  "Friday");
        MyDictionary.put(6,  "Saturday");
        MyDictionary.put(7,  "Sunday");

*/

        //              key : value
        MyDictionary.put(3,  "Wednesday");
        MyDictionary.put(1,  "Monday");
        MyDictionary.put(4,  "Thursday");
        MyDictionary.put(7,  "Sunday");
        MyDictionary.put(6,  "Saturday");
        MyDictionary.put(5,  "Friday");
        MyDictionary.put(2,  "Tuesday");



/*
        //               key : value
        MyDictionary.put("MO",  "Monday");
        MyDictionary.put("TU",  "Tuesday");
        MyDictionary.put("WE",  "Wednesday");
        MyDictionary.put("TH",  "Thursday");
        MyDictionary.put("FR",  "Friday");
        MyDictionary.put("SA",  "Saturday");
        MyDictionary.put("SU",  "Sunday");
*/


/*
        //               key : value
        MyDictionary.put("MO",   1);
        MyDictionary.put("TU",   2);
        MyDictionary.put("WE",   3);
        MyDictionary.put("TH",   4);
        MyDictionary.put("FR",   5);
        MyDictionary.put("SA",   6);
        MyDictionary.put("SU",   7);

*/

        System.out.println();
        System.out.println();



        // DICTIONARY SIZE :
        int NumberOfElements = MyDictionary.size();
        System.out.println("1. Number of elements : " + NumberOfElements);
        System.out.println();


        // PRINT DICTIONARY :
        System.out.println("2. Print whole dictionary : " + MyDictionary);
        System.out.println();




// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //TODO - How to check CAPACITY !!!
        //System.out.println("CAPACITY : " + MyDictionary.);



        // DICTIONARY KEYS.............................................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("3.1 Dictionary KEYS : " + MyDictionary.keys());
            System.out.println("3.2 Dictionary KEYS asIterator : " + MyDictionary.keys().asIterator());
        }
        System.out.println();




        // DICTIONARY ELEMENTS.............................................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("4.1 Dictionary ELEMENTS : " + MyDictionary.elements());
            System.out.println("4.2 Dictionary ELEMENTS asIterator : " + MyDictionary.elements().asIterator());
        }
        System.out.println();




        // DICTIONARY GET BY KEY AND GET BY VALUE - NOT WORK PROPERLY .........................
        for (int i = 0; i < NumberOfElements; i++)
        {
            System.out.println("5.1 Dictionary GET by KEYS : " + MyDictionary.get(MyDictionary.keys()));
            System.out.println("5.2 Dictionary GET by VALUES : " + MyDictionary.get(MyDictionary.elements()));
        }
        System.out.println();


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        // DICTIONARY GET ELEMENT (VALUE) BY KEY - IF THE KEYS ARE INTEGER ............................................
        for (int i = 1; i <= NumberOfElements; i++)
        {
            System.out.println("6. VALUES in Dictionary by GET with FOR-CYCLE : " + MyDictionary.get(i));
        }
        System.out.println();


// ///////////////////////  ITERATIONS BY ENUMERATION WITH FOR-EACH-CYCLE /////////////////////////////////////////////
        // PRINT KEYS BY ENUMERATOR IN FOR-EACH CYCLE ....................................................
        for (Enumeration items = MyDictionary.keys(); items.hasMoreElements();)
        {
            System.out.println("7. KEYS in Dictionary by Enumerator : " + items.nextElement());
        }
        System.out.println();





        // PRINT VALUES (ELEMENTS) BY ENUMERATOR IN FOR-EACH CYCLE .....................................................
        for (Enumeration items = MyDictionary.elements(); items.hasMoreElements();)
        {
            System.out.println("8. VALUES in Dictionary by Enumerator : " + items.nextElement());
        }
        System.out.println();
// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        // REMOVE ELEMENT .................................................
        MyDictionary.remove(3);
        MyDictionary.remove(5);

        System.out.println("Rmoved Key : 3 !");
        System.out.println("Rmoved Key : 5 ! ");

        System.out.println();



        // PRINT KEYS BY ENUMERATOR AFTER REMOVING ....................................................
        for (Enumeration i = MyDictionary.keys(); i.hasMoreElements();)
        {
            System.out.println("9. KEYS in Dictionary by Enumeratior (after remove) : " + i.nextElement());
        }
        System.out.println();





        // PRINT VALUES (ELEMENTS) BY ENUMERATOR AFTER REMOVING....................................................
        for (Enumeration i = MyDictionary.elements(); i.hasMoreElements();)
        {
            System.out.println("10. VALUES in Dictionary by Enumeratior (after remove) : " + i.nextElement());
        }
        System.out.println();

    }

}
