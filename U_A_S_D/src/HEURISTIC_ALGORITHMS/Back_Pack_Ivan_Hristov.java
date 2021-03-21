package HEURISTIC_ALGORITHMS;

import java.util.Scanner;

public class Back_Pack_Ivan_Hristov
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int[] g = new int[n];

        int free;
        for (int i = 0; i < n; i++) {
            System.out.print("Insert an element: ");
            g[i] = Integer.parseInt(scan.nextLine());
            System.out.println();
        }
        for (int i = 0; i < g.length - 1; i++) {
            for (int j = 0; j < g.length - 1 - i; j++) {
                if (g[j] < g[j + 1]) {
                    free = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = free;

                }
            }

        }
        for (int i = 0; i < g.length - 1; i++) {
            while (m > 0) {
                if (g[i] <= m) {
                    m -= g[i];
                    System.out.println("Now used: " + g[i]);
                } else {
                    m -= g[1];
                    System.out.println("Now used: " + g[1]);
                }
            }

        }
        if (m > 0) {
            System.out.println("Rest: " + m);
        }
    }// end of main

}// end of class
