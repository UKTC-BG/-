package HEURISTIC_ALGORITHMS;



import java.util.ArrayList;
import java.util.Random;
import java.util.Random;
import java.util.Random.*;

    public class Matrix_18307 {

        public static final int n = 5;
        public static int rows = n;
        public static int cols = n;



        public static void main(String[] args) {

            ArrayList<String> stat = new ArrayList<>(rows * cols);

            ArrayList<ArrayList<String>> solARR = new ArrayList<ArrayList<String>>(3);

            System.out.println(solARR);

            System.out.println(find(cols, rows, stat,solARR));
        }//end of main

        public static long find(int cols, int rows, ArrayList<String> stat, ArrayList<ArrayList<String>> solARR){
            Random rand = new Random();

            String solution = "";
            int solutions = 0;
            int count = 0;
            int limit = rows * cols * 10; // nashat izmislica

            while (count < limit) {
                int remRows = rows - 1;
                int remCols = cols - 1;


                solution = "";

                while (remRows != 0 || remCols != 0) {
                    int step = rand.nextInt(2);

                    if (step == 0 && remRows > 0) {
                        remRows--;
                        solution = solution + " d";
                    } else if (step == 1 && remCols > 0) {
                        remCols--;
                        solution = solution + " r";
                    }
                }

                // if (!weche ima takowa reshenie)
                //{

                solutions++;
                stat.add(solution);
                solARR.add(stat);

                //}

                count++;
            }



            //System.out.println(stat);

            return solutions;
        }
    }

