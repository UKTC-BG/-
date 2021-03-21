// БЕЗ ОПТИМИЗАЦИЯ 20 НА 20 ЗА 3 МИНУТИ : 35,345,263,800 РЕШЕНИЯ


package HEURISTIC_ALGORITHMS;


public class RemROWRemCOL {


    public static void main(String[] args) {


        // Дефинираме променлива за броя на редове и колони
        int number = 30;
        int row = number;
        int col = number;

        // Дефинираме СТАТ масив за следене на вече изчислените състояния
        long[][] STAT = new long[35][35];


        System.out.println("Number of solutions : " + recurse(row - 1, col - 1, STAT));
    }




    // МЕТОД ЗА МАНИРАНЕ НА ВЪЗМОЖНИТЕ ПЪТИЩА
    private static long recurse(int remRows, int remCols, long[][] STAT) {

        // Проверяваме дали не сме стигнали до последния ред или последната колона
        if (remRows == 0 || remCols == 0)
            return 1;

        // Проверяваме дели вече не е направено това изчисление
        if(STAT[remRows][remCols] != -1){
            return STAT[remRows][remCols];
        }

        // Променлива за броя на втзможните пътища (отговори)
        long answer = 0;
            answer = answer + recurse(remRows - 1, remCols, STAT); // Движим се надолу
            answer = answer + recurse(remRows, remCols - 1, STAT); // Движим се надясно

        //PrintArrays(STAT);
        return answer;

    }



/*
    // Utility methods for print
    private static void PrintArrays(int[][] stat) {
        System.out.println("STAT : ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                System.out.printf("[%d]",stat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
*/

}// end  of class
