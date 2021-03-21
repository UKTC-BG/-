package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList_181_02 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        ArrayList<String> MyList = new ArrayList<>();

        //System.out.print("Choose : <add> <rem> <prn> <end> : ");
        String Answer="";// = Input.nextLine().toLowerCase();



        while (!Answer.equals("end")){

            // ADD -------------------------------------------------------------------------
            if(Answer.equals("add")){
                System.out.print("Please inpute the name : ");
                String name = Input.nextLine();
                MyList.add(name);
                //System.out.println(MyList);
            }


            // REMOVE BY INDEX -------------------------------------------------------------
            if(Answer.equals("rem")){

                System.out.print("Please input the number from list : ");
                int number = Input.nextInt();

                if(number > 0 && number <= MyList.size()) {
                    MyList.remove(number-1);
                    //System.out.println(MyList);
                }
                else {

                    System.out.println("There is no such number !!!");
                }

            }


            // PRN -------------------------------------------------------------------------
            if(Answer.equals("prn")){
                System.out.println("The list is : ");
                System.out.println(MyList);

            }


            System.out.print("Choose : <add> <rem> <prn> <end> : ");
            Answer = Input.nextLine().toLowerCase();


        }// end of while


        System.out.println("Good Bye !");


    }// ens of main


}// end of class
