package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class BinarySearch_184_01 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int LowLimNum = 0; // Lower limit
        int UpLimNum = 0; // Upper Limit
        int CPUNumber = 0;// 1 to 1000

        boolean loop = true; // While true CPU should guess;
        String Answer = "y";

        System.out.println("Choose Your Number And Write It On A Paper ! ;o) ");

        System.out.print("Input Lower Limit Number : ");
        LowLimNum = Input.nextInt();
        System.out.print("Input Upper Limit Number : ");
        UpLimNum = Input.nextInt();

        CPUNumber = (UpLimNum - LowLimNum) / 2;


        while(loop) {
            System.out.printf("Is your number : %d \n", CPUNumber);

            System.out.print("Please answer (u-up; or d-down) : ");
            Answer = Input.nextLine();

            if (Answer.toLowerCase().equals("u")) {
                LowLimNum = CPUNumber;
                CPUNumber = CPUNumber + ((UpLimNum - CPUNumber) / 2);
                System.out.print("Low : " + LowLimNum);

            }

            if (Answer.toLowerCase().equals("d")) {
                UpLimNum = CPUNumber;
                CPUNumber = CPUNumber - ((CPUNumber - LowLimNum) / 2);
                System.out.print("Up : " + UpLimNum);

            }

            if ( UpLimNum - LowLimNum == 2) {
                System.out.printf("Your Number Is : %d \n",CPUNumber);
                loop = false;
                //break;
            }

        }

    }

}
