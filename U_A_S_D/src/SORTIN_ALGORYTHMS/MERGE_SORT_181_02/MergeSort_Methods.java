package SORTIN_ALGORYTHMS.MERGE_SORT_181_02;

public class MergeSort_Methods {


    // SORT
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

        int LArrLenght = m - l + 1;
        int RArrLengh = r - m;

        int[] L = new int[LArrLenght];
        int[] R = new int[RArrLengh];

        for (int i = 0; i < LArrLenght; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < RArrLengh; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0; // index of Left array;
        int j = 0; // index of Kight array;
        int k = 0; // index of United array;

        while (i < LArrLenght && j < RArrLengh){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < LArrLenght){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < RArrLengh){
            arr[k] = R[j];
            j++;
            k++;
        }








    }    // end of SortAndMerge









    }// end of class


