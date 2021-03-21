package SORTIN_ALGORYTHMS.QUICK_SORT_184_01;

public class QuickSortMethods {


    // ARR[] --> Array to be sorted,
    // low  --> Starting index,
    // high  --> Ending index

    public static void QuickSort(int[] ARR, int low, int high){
        
        if(low < high){

            int pi = Partitionig(ARR,low,high);
            
            QuickSort(ARR,low,pi-1);
            QuickSort(ARR,pi+1,high);

        }
        
        
        
    }

    private static int Partitionig(int[] ARR, int low, int high) {

        int pivot = ARR[high]; // Take highest index element for pivot
        int i = low-1;// Variable to do iteration over ARR


        for (int j = low; j < high; j++) {

            if(ARR[j] < pivot){
                i++;
                int TEMP = ARR[i];
                ARR[i] = ARR[j];
                ARR[j] = TEMP;
            }

        }

        int TEMP = ARR[i+1];
        ARR[i+1] = ARR[high];
        ARR[high] = TEMP;

        return i+1;
    }


}
