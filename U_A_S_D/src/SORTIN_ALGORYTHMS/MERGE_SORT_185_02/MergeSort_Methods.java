package SORTIN_ALGORYTHMS.MERGE_SORT_185_02;

public class MergeSort_Methods {


        // SORT --------------------------------------------------------------
        public static void Divide(int[] ARR, int l, int r){

            if(l < r){
                int m = (l+r)/2;    // НАМИРАМЕ СРЕДНИЯ ЕЛЕМЕНТ
                Divide(ARR,l,m);     // РАЗДЕЛЯМЕ ЛЯВАТА ЧАСТ
                Divide(ARR,m+1,r); // РАЗДЕЛЯМЕ ДЯСНАТА ЧАСТ

                CompareAndMerge(ARR,l,m,r); // СОРТИРАМЕ И ОБЕДИНЯВАМЕ ЛЯВАТА И ДЯСНАТА ЧАСТ
            }

        }// end of sort




    // ОБЕДИНЯВА ДВАТА ПОД-МАСИВА НА arr[].
    // ПЪРВИЯ ПОДМАСИВ Е arr[l..m]
    // ВТОРИЯТ ПОДМАСИВ Е arr[m+1..r]

    //COMPARE AND MERGE --------------------------------------------------------------------
    public static void CompareAndMerge(int[] arr, int l, int m, int r){

        // НАМИРА РАЗМЕРА НА ДВАТА ПОД-МАСИВА, КОИТО ЩЕ СЕ ОБЕДИНЯТ
        int LeftArrayLenght = m - l + 1;
        int RightArrayLenght = r - m;

        /* СЪЗДАВА ВРЕМЕННИ МАСИВИ */
        int L[] = new int[LeftArrayLenght];
        int R[] = new int[RightArrayLenght];


        /* КОПИРА ДАННИТЕ ВЪВ ВРЕМЕННИТЕ МАСИВИ - ЛЯВ И ДЕСЕН */
        for (int i = 0; i < LeftArrayLenght; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < RightArrayLenght; ++j)
            R[j] = arr[m + 1 + j];


        /* ОБЕДИНЯВА ВРЕМЕННИТЕ МАСИВИ */

        // ИНИЦИАЛИЗИРА ИНДЕКСИТЕ НА - ЛЕВИЯ И ДЕСНИЯ ПОДМАСИВ
        int i = 0; // Индекс за левия масив
        int j = 0; // Индекс за десния масив

        // НАЧАЛНИЯ ИНДЕКС НА ОБЕДИНЯВАЩИЯ МАСИВ
        int k = l;

        while (i < LeftArrayLenght && j < RightArrayLenght) {
            if (L[i] <= R[j]) { // СРАВНЯВА ТЕКУЩИЯ ЕЛЕМЕНТ НА ЛЕВИЯ С ТЕКУЩИЯ ЕЛЕМНТ НА ДЕСНИЯ МАСИВ
                arr[k] = L[i];
                i++; // ЗА ПРЕМИНАВАНЕ НА СЛЕДВАЩИЯ ЕЛЕМЕНТ ОТ ЛЕВИЯ МАСИВ
            }
            else {
                arr[k] = R[j];
                j++; // ЗА ПРЕМИНАВАНЕ НА СЛЕДВАЩИЯ ЕЛЕМЕНТ ОТ ДЕСНИЯ МАСИВ
            }
            k++; // ЗА ПРЕМИНАВАНЕ НА СЛЕДВАЩИЯ ЕЛЕМЕНТ ОТ ОБЕДИНЯВАЩИЯ МАСИВ
        }



        /* КОПИРА ОСТАВАЩИТЕ ЕЛЕМЕНТИ НА L[] АКО ИМ НЯНКАКВИ */
        while (i < LeftArrayLenght) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* КОПИРА ОСТАВАЩИТЕ ЕЛЕМЕНТИ НА R[] АКО ИМ НЯНКАКВИ */
        while (j < RightArrayLenght) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }// end of merge


} // end of class
