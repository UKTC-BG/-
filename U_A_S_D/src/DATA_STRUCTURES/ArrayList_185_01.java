package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_185_01 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<String> MyList = new ArrayList<>();

        String answer = "";

        while(!answer.contains("end")){

            System.out.println("Please choose <add> <rem> <prn> <end> : ");
            answer = Input.next();


            if(answer.contains("add")){
                System.out.println("Input name : ");
                String name = Input.next();
                MyList.add(name);
            }

            if(answer.contains("rem")){

                System.out.println("Input number : ");

                //TODO Check if the number is in range
                int number = Input.nextInt();
                MyList.remove(number-1);
            }

            if(answer.contains("prn")){
                System.out.println("List is :");
                System.out.println(MyList);
            }

        }

        System.out.println("Good Bye !!!");
    }// end of MAIN

}// end of CLASS
