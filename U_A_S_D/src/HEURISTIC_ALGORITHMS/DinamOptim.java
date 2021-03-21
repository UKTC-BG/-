// 181_01

package HEURISTIC_ALGORITHMS;

import java.util.Arrays;
import java.util.Scanner;

public class DinamOptim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the dimension / N / : ");
        int N = input.nextInt(); // размерност на матрицата, бр редове е равен на броя колони
        int row = N;
        int col = N;

        int [][] MATRIX = new int[row][col];

        // ЗАНУЛЯВАНЕ на матрицата
        for (int x = 0; x < row; x++) { // обхождане по редове

            for (int y = 0; y < col; y++) { // обхождане по колони
                MATRIX[x][y]=0;

            }

        }






        // ////////////////////////////////////////////////////////////////////////////////////
        //      Ако първия ни ход е НАДЯСНО :
        // 1	В началото на итерацията увеличваме с 1-ца индекса на КОЛОНАТА
        // 2	Изчерваме всички възможни ходове до края на матрицата по РЕДОВЕ  (НАДОЛУ).
        // 3	Изчерваме всички възможни ходове до края на матрицата по КОЛОНИ (НАДЯСНО).
        // ////////////////////////////////////////////////////////////////////////////////////



        int r = 0;              // променлива за итерации с индекса на реда
        int c = 0;              // променлива за итерации с индекса на колона
        int numOfTracks = 0;    // брой открити пътища птрез матрицата

        // Дефинираме два фор цикъла за итерации по редове и колони
        for (int i = 0; i < row; i++) { // цикъл за итерации с 1-ца на индекса на реда

            r = i;


            for (int j = 0; j < col; j++) { // цикъл за итерации на индекса на първата стъпка = увеличваме с 1ца индекса на КОЛОНАТА

                if (r == row && c == col) {
                    // System.out.println("Number of tracks is : " + numOfTracks);
                    break;
                }
                else {

                    c = j;

                    while (r < row-1) {
                        //MATRIX[r][c]=1;
                        r++;
                        MATRIX[r][c]=1;


                        while (c < col-1) {
                            //MATRIX[r][c]=1;
                            c++;
                            MATRIX[r][c]=1;

                        }
                        numOfTracks++;

                        // РАЗПЕЧАТВА на матрицата
                        for (int x = 0; x < row; x++) { // обхождане по редове

                            for (int y = 0; y < col; y++) { // обхождане по колони
                                System.out.print(MATRIX[x][y] + " ");
                            }
                            System.out.println();
                        }

                        // ЗАНУЛЯВАНЕ на матрицата
                        for (int x = 0; x < row; x++) { // обхождане по редове

                            for (int y = 0; y < col; y++) { // обхождане по колони
                                MATRIX[x][y]=0;

                            }
                        }


                        System.out.println();
                    }

                }




            }// end of for-cycle for column

        }// end of for-cycle for row


        System.out.println("Number of tracks is : " + numOfTracks);



/*

        // ////////////////////////////////////////////////////////////////////////////////////
        //        Ако първия ни ход е НАДОЛУ :
        //1	В началото на итерацията увеличваме с 1ца индекса РЕДА
        //2	Изчерваме всички възможни ходове до края на матрицата по КОЛОНИ (НАДЯСНО).
        //3	Изчерваме всички възможни ходове до края на матрицата по РЕДОВЕ	 (НАДОЛУ).
        // ////////////////////////////////////////////////////////////////////////////////////

        c = 0;
        r = 0;

        for (int i = 0; i < N; i++) { // цикъл за итерации на индекса на първата стъпка

            if( r==c && r==N){
                System.out.println("Number of tracks is : " + numOfTracks);
                break;
            }

            r = i;

            while( c < N){
                c++;

                while(r<N) { r++;}
                numOfTracks++;
            }

        }// end of for

 */


    } // end of main

} // end of class
