////////////////////////////////////////////////////
//          DICTIONARY WITH HASHTABLE             //
////////////////////////////////////////////////////

package DATA_STRUCTURES;

import java.util.Dictionary;
import java.util.Enumeration;
//import java.util.HashMap;
import java.util.Hashtable;

public class Dictionary_HashTable_181_182 {

        public static void main(String[] args) {

            // РЕАЛИЗАЦИЯ НА Dictionary ЧРЕЗ HashTable
            // Dictionary предполага наличиевто на двойка <key : value>

            Dictionary<Integer, String> MyDictionary = new Hashtable<>();
            //            KEY :  VALUE


            // Using a few dictionary Class METHODS ==============================================


            // using PUT() method - to put element in................................................
            //              key : value
            MyDictionary.put(1, "Apple");
            MyDictionary.put(2, "Banana");
            MyDictionary.put(3, "Orange");
            MyDictionary.put(4, "Avocado");



/*
            //                key : value
            MyDictionary.put("AP", "Apple");
            MyDictionary.put("BA", "Banana");
            MyDictionary.put("OR", "Orange");
            MyDictionary.put("AV", "Avocado");
*/


            // PRINT MyDictionary BEFORE removing elements

            System.out.println();
            System.out.println("BEFORE removing elements : " + MyDictionary);
            System.out.println();


            // print SIZE() of dictionary BEFORE REMOVING ELEMENTS ..................................
            System.out.println("\nSize of my_dict BEFORE removing elements : " + MyDictionary.size());
            System.out.println();


            // using GET() method, when the key is INTEGER ...........................................
            System.out.println("Value at key = 1 : " + MyDictionary.get(1));
            System.out.println("Value at key = 2 : " + MyDictionary.get(2));
            System.out.println("Value at key = 3 : " + MyDictionary.get(3));
            System.out.println("Value at key = 4 : " + MyDictionary.get(4));
            System.out.println();

            // using GET() method, when the key is STRING.............................................
            System.out.println("Value at key = AP : " + MyDictionary.get("AP"));
            System.out.println("Value at key = BA : " + MyDictionary.get("BA"));
            System.out.println("Value at key = OR : " + MyDictionary.get("OR"));
            System.out.println("Value at key = AV : " + MyDictionary.get("AV"));
            System.out.println();




            // PRINT BY FOR ITERATION WHEN KEY IS INTEGER
            System.out.println("By FOR-CYCLE :");
            for (int i = 1; i <= MyDictionary.size(); i++) {

                System.out.println("MyDict element : " + MyDictionary.get(i));

            }

            System.out.println();



            // FOR-EACH-CYCLE :::::::::::::::::
            // PRINT KEYS BY ENUMERATOR USING KEYS() METHOD...................................................
            System.out.println("By Enumeration - KEYS :");
            for (Enumeration items = MyDictionary.keys(); items.hasMoreElements();)
            {
                System.out.println("KEYS in Dictionary : " + items.nextElement());
                //System.out.println(items.asIterator());
            }
            System.out.println();



            // FOR-EACH-CYCLE :::::::::::::::::
            // PRINT VALUES (ELEMENTS) BY ENUMERATOR USING ELEMENTS() METHOD....................................................
            System.out.println("By Enumeration - VALUES :");
            for (Enumeration items = MyDictionary.elements(); items.hasMoreElements();)
            {
                System.out.println("VALUES in Dictionary : " + items.nextElement());
            }
            System.out.println();



            // using isEmpty() method..............................................................
            System.out.println("\nIs my dictionary empty? : " + MyDictionary.isEmpty());
            System.out.println();


            // using REMOVE() method...............................................................
            // remove value by Integer key 1 and key 2
            MyDictionary.remove(1);
            MyDictionary.remove(2);
            System.out.println();

            // remove value by String key-"BA" and key-"AV"
            MyDictionary.remove("BA");
            MyDictionary.remove("AV");
            System.out.println();


            // CHECK  BY INTEGER-KEY IF THE ELEMENTS ARE REMOVED
            System.out.println("Checking if the removed value exists (by integer key) : " + MyDictionary.get(1));
            System.out.println("Checking if the removed value exists (by integer key) : " + MyDictionary.get(2));
            System.out.println("Checking if the removed value exists (by integer key) : " + MyDictionary.get(3));
            System.out.println();

            // CHECK  BY STRING-KEY IF THE ELEMENTS ARE REMOVED
            System.out.println("Checking if the removed value exists (by string key) : " + MyDictionary.get("BA"));
            System.out.println("Checking if the removed value exists (by string key) : " + MyDictionary.get("AV"));
            System.out.println("Checking if the removed value exists (by string key) : " + MyDictionary.get("AP"));
            System.out.println();



            // print after removing elements
            System.out.println("AFTER removing elements : " + MyDictionary);
            System.out.println();


            // using size() method.................................................................
            System.out.println("\nSize of my_dict AFTER removing elements : " + MyDictionary.size());
        }
    }
