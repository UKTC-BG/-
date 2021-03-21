package HEURISTIC_ALGORITHMS;

import java.util.*;

public class YankoKabranov_BackPack {

    public static boolean STATZero = false;
    public static int Iterations = 0;

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("МОЛЯ ВЪВЕДЕТЕ ВМЕСТИМОСТ НА РАНОЦАТА /кг/ : ");
        int M = Integer.parseInt(Input.nextLine());

        System.out.println("МОЛЯ ВЪВЕДЕТЕ БРОЯ НА ПРЕДМЕТИТЕ /между в и 5/ : ");
        int N = Integer.parseInt(Input.nextLine());

        int[] G = new int[N];

        for (int i = 0; i < G.length; i++) {
            System.out.println("МОЛЯ ВЪВЕДЕТЕ ТЕГЛОТО  /не по-малко от 2 кг/ НА ПРЕДМЕТШ[" + i + "] :");
            G[i] = Integer.parseInt(Input.nextLine());
        }

        System.out.println();

        SortArrayG(G);

        CheckBackpack(M, G);


    }//END OF MAIN


    private static void SortArrayG(int[] G) {
    }

    private static void CheckBackpack(int M, int[] G) {

        Scanner PAUSE = new Scanner(System.in);

        int[] STAT = new int[G.length];
        int index = 0;
        int StartIterIndex = 0;
        boolean EOP = false;

        while (M > 0 && !EOP) {

            if (G[index] <= M) {
                M = M - G[index];
                STAT[index] = STAT[index] + 1;
                STATZero = false;

                //System.out.println("to continue press 'y' ");
                //String pause = PAUSE.next("y");

                System.out.println();
                System.out.println("======= ИНТЕРАЦИЯ НОМЕР : " + ++Iterations + "===========================");
                System.out.println("ИНДЕКСА НА ТЕКУЩЕЯ ПРЕДМЕТ Е : " + index);
                System.out.println("А ТЕГЛОТО  /G/ НА ПРЕДМЕТА Е  : " + G[index]);
                System.out.println("В РАНИЦАТА (" + (M + G[index]) + ") ОСТАВАТ СВОБОДНИ");
                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));
            } else {

                System.out.println();
                System.out.println("======= ИНТЕРАЦИЯ НОМЕР : " + ++Iterations + "===========================");
                System.out.println("ИНДЕКСА НА ТЕКУЩЕЯ ПРЕДМЕТ Е : " + index);
                System.out.println("А ТЕГЛОТО  /G/ НА ПРЕДМЕТА Е  : " + G[index]);
                System.out.println("В РАНИЦАТА (" + G[index] + ")КГ Е-ТЕЖЪК ОТ СВОБОДНОТО В РАНИЦАТА" + M + "");
                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));


                System.out.println();
                if (index + 1 < G.length) {
                    System.out.println("ПРЕДМИНАВАМЕ НА СЛЕДВАЩИЯ ПРЕДМЕТ =-=->");
                    System.out.println("(за продължаване антисни) : y");
                    //String pause = PAUSE.next(pattern:"y")  // не се слъчват нещата

                    index++;

                    System.out.println("В РАНИЦАТА СА СВОБОДНИ " + M + "КИЛОГРАМА");

                } else {

                    System.out.println("         >> о << КРАЯ НА МАСИВА С КИЛОГРАМИТЕ НА ТРЕДМЕТИТЕ >> О <<");
                    System.out.println("ИНДЕКСА НА ПОСЛЕДНИЯ ПРЕДМЕТ Е : " + index);
                    System.out.println("А ТЕГЛОТО  /G/ НА ПРЕДМЕТА Е  : " + G[index]);
                    System.out.println("В РАНИЦАТА ВСЕ ОЩЕ ОСТАВАТ СВОБОДНИ" + M + "КИЛОГРАМА");
                    System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                    System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));

                    System.out.println("(за продължаване натисни) : y ");
                    //String pause = PAUSE.next(pattern:"y")  // не се слъчват нещата

                    System.out.println("      << << << ЗАПОЧВАТ ИНТЕРАЦИИТЕ С ИЗВАЖДАНЕ ПО 1 ПРЕДМЕТ (ОБРАТНИ ИНТЕРАЦИИ)........");

                    if (M > 0 && index == G.length - 1) {

                        for (int j = 0; j >= 0; j--) {
                            if (STAT[j] > 0) {
                                System.out.println();
                                System.out.println("ИЗВАЖДАНЕ ПО 1 ПРЕДМЕТ 2 ОБРАТЕН РЕД");

                                System.out.println("(за продължаване натисни) : y ");
                                //String pause = PAUSE.next(pattern:"y")  // не се слъчват нещата

                                M = M + G[j];

                                if (j == G.length - 1 && STAT[j] > 0) {
                                    EOP = true;
                                }

                                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                                System.out.println("G-МАИСВА    [ КГ ]: " + Arrays.toString(G));
                                System.out.println("ИЗВАДЕН 1 ПРЕДМЕТ ОТ " + G[j] + " КИЛОГРАМА");
                                System.out.println("В РАНИЦАТА СВОБОДНИТЕ КИЛОГРАМИ СТАНАХА " + M);

                                System.out.println("(за продължаване) : y ");
                                //String pause = PAUSE.next(pattern:"y")  // не се слъчват нещата

                                if (StartIterIndex + j + 1 < G.length) {
                                    StartIterIndex = j + 1;

                                    index = StartIterIndex;
                                } else {
                                    index = G.length - 1;
                                }
                            }

                        }
                    }

                }
            }
        }//end of while

        if (M == 0) {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("              ЗАДАЧАТА ИМА РЕШЕНИЕ            ");
            System.out.println("==============================================");
            System.out.println("В РАНИЦАТА ОСТАВАТ СВОБОДНИ " + M + "КИЛОГРАМА");
            System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
            System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));
        } else {

            System.out.println("==============================================");
            System.out.println("              ЗАДАЧАТА НЯМА РЕШЕНИЕ           ");
            System.out.println("==============================================");
            System.out.println("В РАНИЦАТА ОСТАВАТ СВОБОДНИ " + M + "КИЛОГРАМА");
            System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
            System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));

        }
    }

}
