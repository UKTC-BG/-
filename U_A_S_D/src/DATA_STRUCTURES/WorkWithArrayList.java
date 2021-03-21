package DATA_STRUCTURES;

import java.util.ArrayList;

public class WorkWithArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> MyArrList = new ArrayList<>();

        // ДОБАВЯНЕ НА ЕЛЕМЕНТИ
        MyArrList.add(15);
        MyArrList.add(28);
        MyArrList.add(7);
        MyArrList.add(36);
        MyArrList.add(69);


        // РАЗПЕЧАТВАНЕ НА СЪДЪРЖАНИЕТО
        System.out.println("Content : " + MyArrList);
        System.out.println("Size : " + MyArrList.size());
        System.out.println("To string : " + MyArrList.toString());
        System.out.println();


        // Remove at INDEX
        System.out.println("Remove element at index [3] : " + MyArrList.remove(3));
        System.out.println("Content : " + MyArrList);
        System.out.println();


        // Remove by ELEMENT (VALUE) - V.1 // DOESN'T WORK - OF COURSE !!!
        // equals is a boolean operation
        System.out.println("Remove element (28) by value : " + MyArrList.remove(MyArrList.equals(28)));
        System.out.println("Content : " + MyArrList);


        // Remove by ELEMENT (VALUE) - V.2
        System.out.println("Remove element (28) by value : " + MyArrList.remove(Integer.valueOf(28)));
        System.out.println("Content : " + MyArrList);
        System.out.println();


        // Add element at end
        System.out.println("Add element (99) at end : " + MyArrList.add(99));
        System.out.println("Content : " + MyArrList);
        System.out.println();


        // Add element /insert/  at INDEX (position)
        System.out.println("Add element (66) at index [2] : " );
                MyArrList.add(2,66);
        System.out.println("Content : " + MyArrList);

    }

}
