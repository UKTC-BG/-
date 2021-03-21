package HEURISTIC_ALGORITHMS;


public class DinOpt_185_02 {


    private static final int number = 5;
    private static final int row = number;
    private static final int col = number;
    private static long counter=0;
    //private static long answer = 0;



    public static void main(String[] args) {

        long[][] STAT = new long[row][col]; // МАСИВ ЗА ВОДЕНЕ НА СТАТИСТИКА КОИ ВАРИАНТИ СА ВЕЧЕ ИЗЧИСЛЕНИ

        MemSet(STAT); // ИНИЦИАЛИЗИРАНЕ STAT МАСИВА


        System.out.println( "Брой пътища през матрицата : " + recurse(row-1, col-1, STAT) );
        System.out.println();

        System.out.println("STAT масива е :");
        PrintArrays(STAT); // РАЗПЕЧАТВАМЕ STAT МАСИВА

        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));



    }// end of main




    // Method : recurse -----------------------------------------------------
    private static long recurse(int remRow, int remCol, long[][] STAT) {


        //PrintArrays(STAT);

        counter++;
        System.out.println("БРОЙ РЕКУРСИИ : " + counter);

        // АКО СМЕ В КРАЯ НА ИТЕРАЦИИТЕ == ДЪНО НА РЕКУРСИЯТА
        if(remRow == 0 || remCol == 0){ return 1; }

        // АКО СМЕ ПРАВИЛИ ТОВА ИЗЧИСЛЕНИЕ
        if (STAT[remRow][remCol] != -1) { return STAT[remRow][remCol]; }


        // ПРЕБРОЯВАНЕ НА ВЪЗМОЖНИТЕ ВАРИАНТИ
        long answer = 0;// Променлива за преброяване на броя пътища

        // Row - 1 -----------------------------------------------
        answer = answer + recurse(remRow-1, remCol, STAT);
        //PrintArrays(STAT); // РАЗПЕЧАТВАМЕ STAT МАСИВА

        // Col - 1 -----------------------------------------------
        answer = answer + recurse(remRow, remCol-1, STAT);
        //PrintArrays(STAT); // РАЗПЕЧАТВАМЕ STAT МАСИВА

        // ЗАПАЗВАМЕ ОТГОВОРА В STAT И ГО ВРЪЩАМЕ
        return STAT[remRow][remCol] = answer;
             //return answer;


    }// end of recurse




// //////////////////////////////////// UTILITIES /////////////////////////////


    // Method : Print array ---------------------------------------------------
    private static void PrintArrays(long[][] STAT) {
        System.out.println("STAT : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.printf("[%d]",STAT[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }// end of PrintArrays



    // Method : Set array with a value (memset) -------------------------------
    private static void MemSet(long[][] STAT){
        for (int r = 0; r < row; r++) {

            for (int c = 0; c < col; c++) {

                STAT[r][c] = -1;
            }
        }
    }// end of MemSet

}// end of class
