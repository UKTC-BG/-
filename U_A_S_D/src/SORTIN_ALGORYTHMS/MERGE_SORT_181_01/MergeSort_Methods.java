package SORTIN_ALGORYTHMS.MERGE_SORT_181_01;

public class MergeSort_Methods {


    // DIVIDE
    public static void Divide(int[] ARR, int l, int r){

        if(l < r){
            int m = (l+r)/2;    // НАМИРАМЕ СРЕДНИЯ ЕЛЕМЕНТ
            Divide(ARR,l,m);     // РАЗДЕЛЯМЕ ЛЯВАТА ЧАСТ
            Divide(ARR,m+1,r); // РАЗДЕЛЯМЕ ДЯСНАТА ЧАСТ

            CompareAndMerge(ARR,l,m,r); // СОРТИРАНЕ И ОБЕДИНЯВАМЕ ЛЯВАТА И ДЯСНАТА ЧАСТ
        }

    }// end of divide


    //SORT AND MERGE
    private static void CompareAndMerge(int[] arr, int l, int m, int r) {
        // Дефинираме дължините на левия и десния помощни масиви
        int LeftArrLenght = m - l + 1;
        int RightArrLenght = r - m;

        // Дефинираме помощните масиви
        int[] L = new int[LeftArrLenght];
        int[] R = new int[RightArrLenght];

        for (int i = 0; i < LeftArrLenght; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < RightArrLenght; j++) {
            R[j] = arr[m + 1 + j];
        }

        // СРАВНЯВАНЕ И ОБЕНИНЯВАНЕ НА ДАННИТЕ ОТ ПОМОЩНИТЕ МАСИВИ
        int i = 0;// начален индекс за левия масив
        int j = 0;// начален индекс за десния масив
        int k = l;// !!! начален индекс за обединяващия масив

        while(i < LeftArrLenght && j < RightArrLenght){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Записване на останалите елементи (ако има такива)
        // във събирателния масив - arr
        while(i < LeftArrLenght){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < RightArrLenght){
            arr[k] = R[j];
            j++;
            k++;
        }




    }    // end of SortAndMerge









    }// end of class


