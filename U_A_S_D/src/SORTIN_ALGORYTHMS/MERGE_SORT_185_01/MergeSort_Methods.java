package SORTIN_ALGORYTHMS.MERGE_SORT_185_01;

public class MergeSort_Methods {


    static void Divide(int[] Arr, int l, int r){
        int m= 0;

        if (l < r){
            m = (l+r)/2;
            Divide(Arr,l, m);
            Divide(Arr,m+1,r);

            SortAndMerge(Arr,l,m,r);
        }

    }

    private static void SortAndMerge(int[] arr, int l, int m, int r) {

        int n1 = m - l;// ДЪЛЖИНА НА ЛЕВИЯ МАСИВ
        int n2 = r - m+1;// ДЪЛЖИНА НА ДЕСНИЯ МАСИВ

        // ПОМОЩНИ МАСИВИ - ЛЯВ И ДЕСЕН
        int[] L = new int[n1];// ЛЯВ ПОМОЩЕН МАСИВ
        int[] R = new int[n2];// ДЕСЕН ПОМОЩЕН МАСИВ


        // КОПИРАНЕ НА ДАННИТЕ ОТ ОРИГИНАЛНИЯ МАСИВ
        // В ДВАТА ПОМОЩНИ МАСИВА - L R

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m+1+j];
        }

        // СРАВНЯВАМЕ ЕЛЕМЕНТ ПО ЕЛЕМЕНТ L-ЛЕВИЯ И R-ДЕСНИЯ ПОМОЩЕН МАСИВ
        // И ГИ ЗАПИСВАМЕ В ОБЕДИНЯВАЩ МАСИВ arr
        int i = 0;// ИНДЕКС ЗА РАБОТА С ЛЕВИЯ ПОМОЩЕН МАСИВ
        int j = 0;// ИНДЕКС ЗА РАБОТА С ДЕСНИЯ ПОМОЩЕН МАСИВ
        int k = l;// ИНДЕКС ЗА РАБОТА СЪС СЪБИРАТЕЛНИЯ МАСИВ

        while(i < n1 && j < n2){

            if(L[i]<= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;

            // КОПИРАНЕ НА ОСТАВАЩИТЕ ЕЛЕМНТИ ОТ ПОМОЩНИТЕ МАСИВИ
            // СРАБОТВА САМО КОГАТО ПОМОЩНИТЕ МАСИВИ СА С НЕЧЕТЕН БРОЙ ЕЛЕМНТИ




        }



    }


}
