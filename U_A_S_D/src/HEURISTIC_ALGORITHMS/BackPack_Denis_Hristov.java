package HEURISTIC_ALGORITHMS;
import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void sortArrays(int [] g){
        int n = g.length;

        int FirstUnsortedElement;
        int LastSortedElement;

        for (int i = 1; i < n; i++) {
            FirstUnsortedElement = g[i];
            LastSortedElement = i - 1;

            while (LastSortedElement >= 0 && g[LastSortedElement] < FirstUnsortedElement) {
                g[LastSortedElement + 1] = g[LastSortedElement];
                LastSortedElement = LastSortedElement - 1;
            }
            g[LastSortedElement + 1] = FirstUnsortedElement;
        }
    }

    public static void checkbackpack(int m, int[] g){
        int[]stat = new int[g.length];
        int index = 0;

        while(m > 0 && index <= g.length){
            if(g[index] <= m){
                System.out.println("Index of current subject is: " + index);
                System.out.println("Weight of the subject is: " + g[index]);
                System.out.println("In the backpack (" + m + "-" + g[index] + ") there are left "+ (m - g[index]) + " KG");

                m = m-g[index];
                System.out.println(m);
                index ++;

                if(m != 0){
                    System.out.println("THERE IS NO SOLUTION");
                }
            }
        }

        if(m == 0){
            System.out.println("THERE IS A SOLUTION");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input capacity (KG): ");
        int m = scan.nextInt();

        System.out.println("Please input the nunmber of subjects (2 to 5): ");
        int n = scan.nextInt();

        int[]g = new int[n];

        for (int i = 0; i < g.length ; i++) {
            System.out.printf("Input the weight of the [%d] subject (not less than 2KG): ", i);
            g[i] = scan.nextInt();
        }
        System.out.println();

        sortArrays(g);
        checkbackpack(m, g);
    }
}
