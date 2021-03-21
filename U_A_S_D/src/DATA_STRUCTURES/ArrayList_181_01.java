package DATA_STRUCTURES;

import java.util.ArrayList;
//import java.util.Locale;
import java.util.Scanner;

public class ArrayList_181_01 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        ArrayList<String> MyList = new ArrayList<>();

        String answer = "";

        while(!answer.contains("end")){

            System.out.println("МОЛЯ ИЗБЕРЕТЕ КОМАНДА : <add> <rem> <prn> <end> ");
            answer = Input.nextLine().toLowerCase();


            if(answer.equals("add")){
                System.out.println("МОЛЯ ВЪВЕДЕТЕ ИМЕТО : ");
                String name = Input.nextLine();
                MyList.add(name);
            }

            if(answer.equals("rem")){
                System.out.println("ИЗБЕРЕТЕ : 1. ПРЕМАХВАНЕ ПО НОМЕР; 2. ПРЕМАХВАНЕ ПО ИМЕ :");
                int choice = Input.nextInt();


                if(choice==1) {
                    System.out.println("МОЛЯ ВЪВЕДЕТЕ НОМЕРА : ");
                    int number = Input.nextInt();

                    if(number > 0 && number <= MyList.size()) {
                        MyList.remove(number - 1);
                    }
                }

                if(choice==2){
                    System.out.println("МОЛЯ ВЪВЕДЕТЕ ИМЕТО : ");
                    String name = Input.next();
                    MyList.remove(name);
                }

            }

            if(answer.equals("prn")){
                System.out.println("СПИСЪК : ");
                PrintArrayList(MyList);
                //System.out.println(MyList);
            }

        }
        System.out.println("Bye Bye !!!");

    }



    // Utility to print ArrayList
    public static void PrintArrayList(ArrayList<String> MyList){
        for (int i = 0; i < MyList.size(); i++) {

            System.out.println(i+1 + ". " + MyList.get(i));

        }



    }

}
