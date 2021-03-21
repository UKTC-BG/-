package HEURISTIC_ALGORITHMS;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_Algorithm_Backpack {

    public static int Iterations = 0; // БРОЯЧ НА ИТЕРАЦИИТЕ

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("МОЛЯ ВЪВЕДЕТЕ ВМЕСТИМОСТТА НА РАНИЦАТА /кг/ : ");
        int M = Integer.parseInt(Input.nextLine());
        // int M = Input.nextInt(); // СЪЩОТО Е КАТО ТОВА ОТГОРЕ

        System.out.println("МОЛЯ ВЪВЕДЕТЕ БРОЯ НА ПРЕДМЕТИТЕ /между 2 и 5/ : ");
        int N = Integer.parseInt(Input.nextLine());
        // int N = Input.nextInt(); // СЪЩОТО Е КАТО ТОВА ОТГОРЕ

        int[] G = new int[N];// МАСИВ С КИЛОГРАМИТЕ НА ПРЕДМЕТИТЕ

        for (int i = 0; i < G.length; i++) {
            System.out.println("МОЛЯ ВЪВЕДЕТЕ ТЕГЛОТО /не по-малко от 2 кг/ НА ПРЕДМЕТ [" + i + "] :");
            G[i] = Integer.parseInt(Input.nextLine());;
            // G[i] = Input.nextInt(); // СЪЩОТО Е КАТО ТОВА ОТГОРЕ
        }

        System.out.println();

        SortArrayG(G);          // ЗА ДА ПОДРЕДИ МАСИВА С КИЛОГРАМИТЕ ПО НАРАСТВАЩ РЕД

        CheckBackpack(M, G);    // ПРОВЕРЯВА ДАЛИ РАНИЦАТА МОЖЕ ДА СЕ ЗАПЪЛНИ ТОЧНО


    }// end of main //////////////////////////////////////////////////////////////////////


    // METHOD : (INSERTION SORT) ЗА ПОДРЕЖДАНЕ НА МАСИВА С КИЛОГРАМИТЕ ПО НАМАЛЯВАЩ РЕД
    private static void SortArrayG(int[] G) {
        int n = G.length;

        for (int i = 1; i < n; ++i) {
            int eXtracted = G[i];// ВЗИМАМЕ i-ТИЯ ЕЛЕМЕНТ КАТО EXTRACTED (X)
            // С НЕГО ЩЕ СРАВНЯВАМЕ ОСТАНАЛИТЕ ПРЕД НЕГО
            int j = i - 1;// J НАМАЛЯВАМЕ С 1, ЗА ДА ПРОВЕРИМ ВСИЧКИ ЕЛЕМЕНТ ПРЕДИ (Х)

            /* Премвстваме елементите от arr[0..i-1], които са
               по-големи от eXtracted, с един елемент напред за да освободим
               една позиция от тяхната текуща позиция */

            while (j >= 0 && eXtracted > G[j])// j НАМАЛЯВА ДОКАТО Е ПО ГОЛЯМО ОТ KEY-ЕЛЕМЕНТА
            {
                G[j + 1] = G[j];// ПРЕМЕСТВАМЕ С ЕДНО НАДЯСНО
                j = j - 1;// НАМАЛЯВАМЕ ИНДЕКСА НА ЕЛЕМЕНТА
            }
            G[j + 1] = eXtracted;// ЗАПИСВАМЕ EXTRACTED (X) ЕЛЕМЕНТ НА ОСВОБОДЕНАТА ПОЗИЦИЯ
        }
        // System.out.println("SORT : " + Arrays.toString(G));
    } // End of Sorting Method


    // METHOD :  ЗА ПРОВЕРКА НА РАНИЦАТА
    private static void CheckBackpack(int M, int[] G) {

        Scanner PAUSE = new Scanner(System.in);// ПОЛЗВАМ ГО ЗА ПАУЗИРАНЕ

        int[] STAT = new int[G.length]; // МАСИВ ЗА ПРЕБРОЯВАНЕ НА ПРЕДМЕТИТЕ ОТ СЪОТВЕТНИТЕ КИЛОГРАМИ
        int index = 0;                  // ИНДЕКС ЗА ЕЛЕМЕНТИТЕ НА МАСИВА С КИЛОГРАМИ
        int StartIterIndex = 0;         // ИНДЕКСА ОТ КОЙТО ДА ЗАПОЧВА ВСЯКА СЛЕДВАЩА ИТЕРАЦИЯ
        boolean EOP = false;             // МАРКЕР ЗА КРАЙ НА ВСИЧКИ ИТЕРАЦИИ (КРАЙ НА ПРОГРАМАТА)

        while (M > 0 && !EOP) {

            if (G[index] <= M) // АКО ТЕКУЩИЯ ПРЕДМЕТ МОЖЕ ДА СЕ ПОБЕРЕ В РАНИЦАТА
            {
                M = M - G[index];               // ПРИСПАДАМЕ КИЛОГРАМИТЕ ОТ РАНИЦАТА
                STAT[index] = STAT[index] + 1;  // УВЕЛИЧАВАМЕ С 1 БРОЯ НА СЪОТВЕТНЯ ПРЕДМЕТ

                System.out.println();
                System.out.println("======= ИТЕРАЦИЯ НОМЕР : " + ++Iterations + " ==============================");
                System.out.println("ИНДЕКСА НА ТЕКУЩИЯ ПРЕДМЕТ Е : " + index);
                System.out.println("А ТЕГЛОТО /G/ НА ПРЕДМЕТА Е : " + G[index]);
                System.out.println("В РАНИЦАТА (" + (M + G[index]) + " - " + G[index] + ") ОСТАВАТ СВОБОДНИ " + M + " КИЛОГРАМА");
                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));


            } else  // АКО ТОЗИ ПРЕДМЕТ НЕ МОЖЕ ПОВЕЧЕ ДА СЕ ПОБЕРЕ,
                    // ПРОВЕВРЯВАМЕ СЪС СЛЕДВАЩИЯ
            {

                System.out.println();
                System.out.println("======= ИТЕРАЦИЯ НОМЕР : " + ++Iterations + " ==============================");
                System.out.println("ИНДЕКСА НА ТЕКУЩИЯ ПРЕДМЕТ Е : " + index);
                System.out.println("А ТЕГЛОТО /G/ НА ПРЕДМЕТА Е : " + G[index]);
                System.out.println("ТЕКУЩИЯ ПРЕДМЕТ " + G[index] + " КГ Е ПО-ТЕЖЪК ОТ СВОБОДНОТО В РАНИЦАТА " + M + " КГ");
                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));


                System.out.println();
                if (index + 1 < G.length) // АКО НЕ Е СВЪРШИЛ МАСИВА С КИЛОГРАМИТЕ НА ПРЕДМЕТИТЕ
                {
                    System.out.println("ПРЕМИНАВАМЕ НА СЛЕДВАЩИЯ ПРЕДМЕТ =-=->");
                    System.out.println("(за продължаване натисни) : y ");

                    String pause = PAUSE.next("y");

                    index++; // ПРЕМИНАВАМЕ НА СЛЕДВАЩИЯ ПРЕДМЕТ !!!!!!!!!!!!!!!!!!!!!

                    System.out.println("В РАНИЦАТА СА СВОБОДНИ " + M + " КИЛОГРАМА");

                } else  // КОГАТО СМЕ НАКРАЯ НА МАСИВА С КИЛОГРАМИТЕ НА ПРЕДМЕТИТЕ
                {        // ЗАПОЧВАТ ИТЕРАЦИИ С ПРИСПАДАНЕ С ПО 1 ПРЕДМЕТ

                    System.out.println("       >> o <<  КРАЯ НА МАСИВА С КИЛОГРАМИТЕ НА ПРЕДМЕТИТЕ  >> o <<");
                    System.out.println();
                    System.out.println("ИНДЕКСА НА ПОСЛЕДНИЯ ПРЕДМЕТ Е : " + index);
                    System.out.println("А ТЕГЛОТО /G/ НА ПРЕДМЕТА Е : " + G[index]);
                    System.out.println("В РАНИЦАТА  ВСЕ ОЩЕ ОСТАВАТ СВОБОДНИ " + M + " КИЛОГРАМА");
                    System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                    System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));

                    System.out.println("(за продължаване натисни) : y ");
                    String pause = PAUSE.next("y");

                    System.out.println("     << << << ЗАПОЧВАТ ИТЕРАЦИИТЕ С ИЗВАЖДАНЕ ПО 1 ПРЕДМЕТ (ОБРАТНИ ИТЕРАЦИИ)");

                    if (M > 0 && index == G.length - 1) {
                        // АКО РАНИЦАТА ОЩЕ НЕ Е ЗАПЪЛЕНА,
                        // НО СМЕ СТИГНАЛИ ДО КРАЯ НА МАСИВА С ПРЕДМЕТИТЕ


                        for (int j = index; j >= 0; j--)    // ВРЪЩАМЕ НАЗАД ОТ ТЕКУЩИЯ ЕЛЕМЕНТ
                                                            // И ПРИСПАДАМЕ ПО 1 ПРЕДМЕТ
                        {
                            if (STAT[j] > 0)    // АКО БРОЯ НА ПРЕДМЕТИТЕ ОТ ДАДЕНИ КИЛОГРАМИ Е ПО ГОЛЯМ ОТ НУЛА
                            {
                                System.out.println();
                                System.out.println("ИЗВАЖДАНЕ ПО 1 ПРЕДМЕТ В ОБРАТЕН РЕД");

                                System.out.println("(за продължаване натисни) : y ");
                                pause = PAUSE.next("y");

                                STAT[j] = STAT[j] - 1; // НАМАЛЯВАМЕ БРОЯ НА ПРЕДМЕТА С 1
                                M = M + G[j];          // ВРЪЩАМЕ НЕГОВОТО ТЕГЛО В РАНИЦАТА

                                if(j == G.length-1 && STAT[j] > 0)  // КОГАТО СМЕ В КРАЯ НА МАСИВА
                                {EOP = true;}                      // И ИТЕРАЦИИТЕ НЕ ВЪРШАТ РАБОТА
                                                                    // МАРКЕРА ЗА КРАЯ НА ПРОГРАМТА СТАВА ВАЛИДЕН

                                System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
                                System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));
                                System.out.println("ИЗВАДЕН 1 ПРЕДМЕТ ОТ " + G[j] + " КИЛОГРАМА");
                                System.out.println("В РАНИЦАТА СВОБОДНИТЕ КИЛОГРАМИ СТАНАХА " + M);

                                System.out.println("(за продължаване натисни) : y ");
                                pause = PAUSE.next("y");

                                if (StartIterIndex + j + 1 < G.length) {
                                    StartIterIndex = j + 1;
                                    // StartIterIndex - ИНДЕКСА ЗА ИТЕРАЦИИ
                                    // ПРЕМЕСТВАМЕ НАЧАЛОТО НА ИТЕРАЦИИТЕ
                                    // С ЕДНО НАДЯСНО САМО АКО НЕ СМЕ В КРАЯ НА МАСИВА С ПРЕДМЕТИЕ

                                    index = StartIterIndex; // ИНИЦИАЛИЗИРАМЕ НОВА ИТЕРАЦИЯ

                                } else {

                                        index = G.length - 1;   // АКО НЕ МОЖЕМ ПОВЕЧЕ ДА УВЕЛИЧАВАМЕ
                                                                // ЗАЩОТО СМЕ В КРАЯ НА МАСИВА С КИЛОГРАМИТЕ
                                }


                            }   // КРАЙ НА if ЗА ИТЕРАЦИИ С ПРИСПАДАНЕ НА 1 АКО БРОЯ НА ПРЕДМЕТИТЕ
                                // ОТ ДАДЕНИ КИЛОГРАМИ Е ПО ГОЛЯМ ОТ 0

                        } // КРАЙ НА for ЗА ВРЪЩАНЕ НАЗАД И ПРИСПАДАНЕ С 1 ПРЕДМЕТ

                    }

                }// КРАЙ НА else КОГАТО СМЕ В КРАЯ НА МАСИВА С КИЛОГРАМИТЕ НА ПРЕДМЕТИТЕ
                // И СМЕ ЗАПОЧНАЛИ ИТЕРАЦИИ НАЗАД С ПРИСПАДАНЕ НА 1 ПРЕДМЕТ

            }   // КРАЙ НА else АКО ТЕКУЩИЯ ПРЕДМЕТ ВЕЧЕ НЕ СЕ ПОБИРА И ПРОДЪЛЖАВАМЕ СЪС СЛЕДВАЩИТЕ
                // !!! ТОВА НЕ СА ОБРАТНИТЕ ИТЕРАЦИИ С ПРИСПАДАНЕ !!!

        }// end of while

        if (M == 0) {

            System.out.println();
            System.out.println("================================================");
            System.out.println("           ЗАДАЧАТА ИМА РЕШЕНИЕ                 ");
            System.out.println("================================================");
            System.out.println("В РАНИЦАТА  ОСТАВАТ СВОБОДНИ " + M + " КИЛОГРАМА");
            System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
            System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));
        }
        else {
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("           ЗАДАЧАТА НЯМА РЕШЕНИЕ                ");
            System.out.println("------------------------------------------------");
            System.out.println("В РАНИЦАТА  ОСТАВАТ СВОБОДНИ " + M + " КИЛОГРАМА");
            System.out.println("STAT-МАСИВА [ БР ]: " + Arrays.toString(STAT));
            System.out.println("G-МАСИВА    [ КГ ]: " + Arrays.toString(G));
        }


    }// end of CheckBackPack

} // end of class


// ПРОБВАЙТЕ ЗАДАЧАТА С РАНИЦА : 13 КИЛОГРАМА И 3 ПРЕДМЕТА С ТЕГЛА : 2, 5, 4 ; ОК
// ПРОБВАЙТЕ ЗАДАЧАТА С РАНИЦА : 19 КИЛОГРАМА И 4 ПРЕДМЕТА С ТЕГЛА : 5, 6, 7, 8 ; BEST-TEST (8+6+5 и 7+7+5)
// ПРОБВАЙТЕ ЗАДАЧАТА С РАНИЦА : 15 КИЛОГРАМА И 3 ПРЕДМЕТА С ТЕГЛА : 11, 5, 9 ; CRINGE-TEST
// ПРОБВАЙТЕ ЗАДАЧАТА С РАНИЦА : 25 КИЛОГРАМА И 3 ПРЕДМЕТА С ТЕГЛА : 11, 7, 9 ; CRINGE-TEST (има две решения):
//                                                                                            11+7+7  и 7+9+9


