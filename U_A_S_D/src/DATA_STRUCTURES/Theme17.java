package DATA_STRUCTURES;

import java.util.HashMap;
import java.util.Scanner;

public class Theme17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> monthsI = new HashMap<>();
        HashMap<String, Integer> monthsS = new HashMap<>();
        monthsI.put(1, "January");
        monthsI.put(2, "February");
        monthsI.put(3, "March");
        monthsI.put(4, "April");
        monthsI.put(5, "May");
        monthsI.put(6, "June");
        monthsI.put(7, "July");
        monthsI.put(8, "August");
        monthsI.put(9, "September");
        monthsI.put(10, "October");
        monthsI.put(11, "November");
        monthsI.put(12, "December");
        monthsS.put("January", 1);
        monthsS.put("February", 2);
        monthsS.put("March", 3);
        monthsS.put("April", 4);
        monthsS.put("May", 5);
        monthsS.put("June", 6);
        monthsS.put("July", 7);
        monthsS.put("August", 8);
        monthsS.put("September", 9);
        monthsS.put("October", 10);
        monthsS.put("November", 11);
        monthsS.put("December", 12);
        String Input = scan.nextLine();
        //Why try-catch? Because I want to use only one input from console -> I chose to be a String(Input)
        //Using try-catch to separate String and Integer; Integer is in try and String is in catch
        try {
            for(int i = 1; i <= monthsI.size(); i++) {
                //searching by key(Integer) to get the month(String)
                if(Integer.parseInt(Input) == i) {
                    System.out.println(monthsI.get(i));
                }
            }
        } catch(Exception e) {
            for(int i = 1; i <= monthsS.size(); i++) {
                //searching by value(String) from monthsI to get key(Integer) from monthsS
                if(monthsI.get(i).equals(Input)) {
                    System.out.println(monthsS.get(Input));
                }
            }
        }
    }
}