package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Back_Pack_Petra_Abrasheva
{
    public static void check(int m, int[] g) {
        int sum = 0;
        int uo = 0;
        int cs= 0;
        for (int i = 0; i < g.length; i++) {
            uo= (cs/ g[i]) * g[i];
            cs= m - uo;
            if (sum + uo<= m && m - cs + uo!= 1) {
                sum +=uo;
            }
        }

        if (sum == m) {
            System.out.println("A solution is found");
        } else {
            System.out.println("A solution is not found");
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the capacity: " );
        int m = scan.nextInt();
        System.out.println("Input the number of items: ");
        int n = scan.nextInt();
        int[] g = new int[n];
        System.out.println("Input the weight of the items: ");
        for (int i = 0; i < n; i++) {
            int e = scan.nextInt();
            g[i] = e;
        }

        check(m, g);
    }
}

