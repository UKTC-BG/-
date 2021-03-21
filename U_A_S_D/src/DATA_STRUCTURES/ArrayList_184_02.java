package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_184_02 {
    public static void main(String[] args) {

        Scanner InputScan = new Scanner(System.in);
        ArrayList<String> Students = new ArrayList<>();

        String choice = "";


        while ((!choice.equals("end"))){

            System.out.println("Моля изберете команда <add> <rem> <prn> <end> : ");
            choice = InputScan.next();

            // ДОБАВЯНЕ ================================================================================================
            if(choice.equals("add")){

                System.out.println("Моля въведете име : ");
                String name =InputScan.next();

                Students.add(name);

            }// end of add -----------------------------------------------------------------


            // ПРЕМАХВАНЕ ==============================================================================================
            if(choice.equals("rem")){
                System.out.println("Изберете : 1. Премахване по име;   2. Премахване по номер");
                int removeby = InputScan.nextInt();


                // 1. Премахване по име ...................................
                if(removeby==1){
                    System.out.println("Моля въведете името : ");
                    String name = InputScan.next();

                    try{
                        Students.remove(Students.indexOf(name));
                    }
                    catch (Exception e){
                        System.out.println("Няма такова име !");
                    }
                }// end <rem> by name


                // 2. Премахване по номер ...................................
                if (removeby==2){
                    System.out.println("Моля въведете номер :");
                    int number = InputScan.nextInt();

                    try {
                        Students.remove(number-1);
                    }
                    catch (Exception e){
                        System.out.println("Няма такъв номер !");
                    }

                }// end <rem> by number

            }// end of rem -----------------------------------------------------------------



            // PRINT ===================================================================================================
            if(choice.equals("prn")){

                for (int i = 0; i < Students.size(); i++) {
                    System.out.println(i+1 + ". " + Students.get(i));
                }


            }// end of prn -----------------------------------------------------------------

        }// end of while

        System.out.println("Goodbye !");

    }// end of main

}// end of class
