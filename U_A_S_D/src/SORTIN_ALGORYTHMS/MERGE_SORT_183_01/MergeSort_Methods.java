package SORTIN_ALGORYTHMS.MERGE_SORT_183_01;

public class MergeSort_Methods {



    // Divide /////////////////////////////////////////////////////////////////////
    public static void Divide(int[] arr, int l, int r) {

        if(l < r){

            int m = (l + r) / 2;

            Divide(arr, l, m);  // РЕКУРСИВНО РАЗДЕЛЯ ЛЕВИЯ МАСИВ;
            Divide(arr,m+1, r); // РЕКУРСИВНО РАЗДЕЛЯ ДЕСНИЯ МАСИВ;

            CompareAndMerge(arr, l, m, r); // СОРТИРА И ОБЕДИНЯВА МАСИВИТЕ;
        }
    } // end of Divide


    private static void CompareAndMerge(int[] arr, int l, int m, int r) {

        int LeftArrLenght =  m - l + 1;
        int RigtArrLenght = r - m;

        int[] LeftArr = new int[LeftArrLenght];
        int[] RightArr = new int[RigtArrLenght];

        for (int i = 0; i < LeftArrLenght; i++) {
            LeftArr[i] = arr[l+i];
        }

        for (int j = 0; j < RigtArrLenght; j++) {
            RightArr[j] = arr[m + 1 + j];
        }

        int i = 0; //Индекс за Левия масив
        int j = 0; //Индекс за Десния масив
        int k = l; //Индекс за Обобщаващия масив = arr[];

        while(i < LeftArrLenght && j < RigtArrLenght){

            if(LeftArr[i] <= RightArr[j]){
                arr[k] = LeftArr[i];
                i++;
            }else{
                arr[k] = RightArr[j];
                j++;
            }
            k++;
        }


        // Копиране на остатъците, ако има такива,
        while(i < LeftArrLenght){
            arr[k] = LeftArr[i];
            i++;
            k++;
        }

        while(j < RigtArrLenght){
            arr[k] = RightArr[j];
            j++;
            k++;
        }


    }// End of Method Compare and Merge























    // CompareAndMerge /////////////////////////////////////////////////////////////////////
    /*
    private static void SortAndMerge(int[] arr, int l, int m, int r) {

        // НАМИРА РАЗМЕРА НА ДВАТА ПОД-МАСИВА, КОИТО ДА СЕ ОБЕДИНЯТ
        int n1 = m - l + 1;
        int n2 = r - m;

        // СЪЗДАВА ВРЕМЕННИ МАСИВИ /
        int L[] = new int[n1];
        int R[] = new int[n2];

        // КОПИРА ДАННИТЕ ВЪВ ВРЕМЕННИТЕ МАСИВИ /
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        // ОБЕДИНЯВАНЕ НА ВРЕМЕННИТЕ МАСИВИ /

        // ИНИЦИАЛИЗИРА ИНДЕКСИТЕ НА ПЪРВИЯ И ВТОРИЯ ПОД-МАСИВИ
        int i = 0, j = 0;


        // НАЧАЛЕН ИНДЕКС НА ОБЕДИНЯВАЩИЯ МАСИВ
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // КОПИРА ОСТАНАЛИТЕ ЕЛЕМЕНТИ НА L[] АКО ИМА НЯКАКВИ /
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // КОПИРА ОСТАНАЛИТЕ ЕЛЕМЕНТИ НА R[] АКО ИМА НЯКАКВИ /
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    } // end of SortAndMerge
*/






}// end of class
