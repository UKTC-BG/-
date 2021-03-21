package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_185_02 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        ArrayList<String> MyList = new ArrayList<>();

       // System.out.println("Please choose :: <add> <rem> <prn> <end> :");
        String choice = "";//Input.nextLine();

        while (!choice.contains("end")) {

            // ADD =========================================================
            if (choice.equals("add")) {

                String name = Input.next();
                MyList.add(name);

            }

            // REMOVE ======================================================
            if ((choice.equals("rem"))){
                System.out.println("Input number : ");
                int number = Input.nextInt();

                if(number>0 && number<= MyList.size()) {
                    MyList.remove(number - 1);
                }
                else
                {
                    System.out.println("No such number !!!");
                }

            }

            // PRINT =======================================================
            if(choice.equals("prn")){

                System.out.println(MyList);

            }

            System.out.println("Please choose :: <add> <rem> <prn> <end> :");
            choice = Input.next();

        }

    }

}
