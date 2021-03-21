package SORTIN_ALGORYTHMS.MERGE_SORT_184_01;

public class MergeSort_Methods {

// DIVIDE ----------------------------------------------------
public static void Divide(int[] ARR, int l, int r ){

    if(l < r){
        int m = (l + r) / 2; // ОПРЕДЕЛЯМЕ СРЕДНАТА ТОЧКА ЗА РАЗДЕЛЯНЕ

        Divide(ARR,l,m);// РАЗДЕЛЯМЕ ЛЕВИЯ ВИКАМЕ РЕКУРСИВНО
        Divide(ARR,m+1,r);// РАЗДЕЛЯМЕ ДЕСНИЯ ВИКАМЕ РЕКУРСИВНО

        CompareAndMerge(ARR,l,m,r);// СОРТИРАМЕ И СЛИВАМЕ
    }
}// end of DIVIDE



    // SORT AND MERGE -------------------------------------------------
    private static void CompareAndMerge(int[] arr, int l, int m, int r) {

        // L and R array def
        int LeftArrayLenght = m - l +1;
        int RightArrayLeng = r - m ;

        int L[] = new int[LeftArrayLenght];
        int R[] = new int[RightArrayLeng];

        for (int i = 0; i < LeftArrayLenght; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < RightArrayLeng; j++) {
            R[j] = arr[m+1+j];
        }


        int i = 0; // Index for L[]
        int j = 0; // Index of R[]
        int k = l; // Indx of arr[]

        while(i < LeftArrayLenght && j < RightArrayLeng){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<LeftArrayLenght){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<RightArrayLeng){
            arr[k] = R[j];
            j++;
            k++;
        }





    
    }// end of CompareAndMerge



}// еnd of class
