package HEURISTIC_ALGORITHMS;

import java.util.Arrays;

public class MATRIX_183_01 {

    public static void main(String[] args) {

        // Въвеждаме N =  матрицата ще е с N-reda и N-колони

        int[][] MATRIX = new int[4][4];
        int steps =  (4 + 4) - 2; // 4 rows and 4 columns = 8 - 2 = 6 steps

        char[] directions = new char[steps];

        int halfsteps = steps / 2;// number of steps / 2

        if (halfsteps%2 == 1) { halfsteps++; }


        // ПРАВОЪГЪЛНИТЕ РЕШЕНИЯ
        for (int row = 0; row < halfsteps; row++) {

            for (int i = 0; i < row; i++) {

                directions[i] = 'd';
            }

            for (int i = row; i < steps - halfsteps; i++){

                directions[i] = 'r';

            }


            for (int i = steps - halfsteps; i < steps; i++) {
                directions[i] = 'd';

            }

            System.out.printf("Directions sol [%d]", row);
            System.out.println(Arrays.toString(directions));

        }



    } // end of main

} // end of class
