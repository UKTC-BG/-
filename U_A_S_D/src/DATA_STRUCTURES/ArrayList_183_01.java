package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_183_01 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        ArrayList<String> MyList = new ArrayList<>();

        String command = "";

        while(!command.equals("end")){

            System.out.println("Моля въведете команда <add> <rem> <prn> <end>:");
            command=Input.next().toLowerCase();

            // ADD ================================================================
            if(command.equals("add")){

                System.out.println("Моля въведете име :");
                String name = Input.next();

                MyList.add(name);

            }// end of add ---------------------------------------------------------


            // REM ================================================================
            if(command.equals("rem")){

                System.out.println("Избете 1. по име; 2. по номер");
                int choice = Input.nextInt();


                // remove by name..................................................
                if(choice == 1) {
                    System.out.println("Моля въведете име ");
                    String name = Input.next();

                    try {
                        MyList.remove(MyList.indexOf(name));
                    }
                    catch (Exception e){
                        System.out.println("Няма такова име !");

                    }

                }

                // remove by number..................................................
                if(choice == 2){
                    System.out.println("Моля въведете номер : ");
                    int nomer = Input.nextInt();

                    try {
                        MyList.remove(nomer);
                    }
                    catch (Exception e){
                        System.out.println("Няма такъв номер !");
                    }

                }

                // wrong choice .....................................................
                if(choice != 1 && choice !=2){

                    System.out.println("Неправилен избор !");
                }

            }// end of rem ---------------------------------------------------------


            // PRN =================================================================
            if(command.equals("prn")){
                for (int i = 0; i < MyList.size(); i++) {

                    System.out.println(i+1 + ". " + MyList.get(i));

                }
            }// end of prn ---------------------------------------------------------


        }// end of while

        System.out.println("Goodbye !!!");


    }// end of main

}// end of class
