package HEURISTIC_ALGORITHMS;

import java.util.Arrays;
import java.util.Scanner;

public class MATRIX_VASILENA {


    //START OF MAIN//
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.println("Please input number of elements (N) : ");
        int N = Input.nextInt();


        System.out.println(numberOfPaths(N,N)); //INPUT NxM//
    }//END OF MAIN//


    //START OF METHOD//
    static int numberOfPaths(int row, int col){
        int[] dp = new int[col];//USING 1 DIMENSIONAL ARRAY TO STORE THE RESULTS WE ALREADY KNOW//
        dp[0] = 1;

        //i-FOR THE COLONS | j-FOR THE ROWS//
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[j] += dp[j - 1];
            }
        }
        System.out.print("The number of possible paths is: " );
        System.out.println(Arrays.toString(dp));
        return dp[col - 1];
    }//END OF CLASS//
}

/*------------------------------TESTS------------------------------
                                3x3 ----> 6 Possible paths
                                5x5 ----> 70 Possible paths
                                9x9 ----> 12870 Possible paths
                                15x15 ----> 40116600 Possible path
                                3x2 ----> 3 Possible paths
                                                                 */


