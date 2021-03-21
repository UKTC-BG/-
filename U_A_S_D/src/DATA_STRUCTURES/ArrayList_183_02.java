package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList_183_02 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        ArrayList<String> MyList = new ArrayList<>();
        String command ="";


        while(!command.contains("end")){

            // ADD --------------------------------------------------------------------------------
            if(command.contains("add")){
                System.out.print("Pleas input name : ");
                String name = Input.next();
                MyList.add(name);
            }

            // REMOVE -----------------------------------------------------------------------------
            if(command.contains("rem")) {
                System.out.println("Choose to remove : 1. By number or 2. By name");
                int choice = Input.nextInt();

                // Проверяваме дали избора е правилен
                if (choice == 1 || choice == 2) {

                    // АКО ПРЕМАХВАМЕ ПО НОМЕР .............................
                    if (choice == 1) {
                        System.out.print("Please input number : ");
                        int number = Input.nextInt();
                        if (number > 0 && number <= MyList.size()) {
                            MyList.remove(number - 1);
                        }
                        else {
                            System.out.println("No such number !!!");
                        }
                    }


                    // АКО ПРЕМАХВАМЕ ПО ИМЕ .................................
                    if (choice == 2) {
                        System.out.print("Please input наме : ");
                        String rname = Input.next();
                        MyList.remove(String.valueOf(rname));
                    }
                }
                else{
                    System.out.println("Wrong choice");
                }

            }


            // PRINT ---------------------------------------------------------------------------------
            if(command.contains("prn")){
                System.out.println(MyList);
            }

            System.out.println("Please choose from : <add> <rem> <prn> <end>");
            command = Input.nextLine().toLowerCase();
        }

        System.out.println("Good Bye !!!");
    }
}
