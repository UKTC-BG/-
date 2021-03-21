package DATA_STRUCTURES;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_184_01 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        ArrayList<String> MyList = new ArrayList<>();


        String Answer="";// = Input.nextLine();

        while (!Answer.contains("end")){

            if(Answer.equals("add")){
                System.out.print("Input name : ");
                String name = Input.nextLine();
                MyList.add(name);
            }

            if (Answer.contains("rem")){
                System.out.print("Input number : ");
                int index = Input.nextInt();

                if(index > 0 && index <= MyList.size()){
                    MyList.remove(index-1);
                }
                else
                    System.out.println("Wrong number !!!");

            }

            if(Answer.contains("prn")){
                System.out.println("List is :");
                System.out.println(MyList);
            }

            System.out.print("Input : <add> <rem> <prn> <end> : ");
            Answer = Input.nextLine();

        }// end of while

    }// end of main

}// end of class
