package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class BinarySearch_182_02 {

    public static void main(String[] args) {
        // Диапазон 1 - 1000
        int CPUNumber = 0;
        int LL = 1;
        int UL = 1000;
        boolean loop = true;

        CPUNumber = (UL - LL)/2; // 499
        Scanner Input = new Scanner(System.in);

        System.out.println("Please choose your number /between 1 an 1000/ and write it on a paper : ");


        while(loop) {

            //System.out.println("LL : " + LL);
            //System.out.println("UL : " + UL);

            if(UL - LL == 2){
                System.out.println();
                System.out.printf("Your number is : %d", LL+1);
                loop=false;
                break;
            }

                System.out.println("Is Your Numebr : " + CPUNumber + " ?");
                System.out.print("Please answer u-up or d-down : ");
                String Answer = Input.nextLine();


            if (Answer.equals("u")) {
                LL = CPUNumber;
                CPUNumber = CPUNumber + (UL - LL) / 2;
            }

            if (Answer.equals("d")) {
                UL = CPUNumber;
                CPUNumber = CPUNumber - (UL - LL) / 2;

            }
        }
    }
}
