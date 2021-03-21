package SORTIN_ALGORYTHMS.QUICK_SORT_183_02;

public class QuickSortMethods {

    public static void QuickSort(int[] ARR,int low,int high){
        
        if(low < high){
            
            int PivotIndex = Partition(ARR,low,high); // Index of pivot element
            
            QuickSort(ARR,low, PivotIndex-1); // Recursively call for left part
            QuickSort(ARR,PivotIndex+1, high); // Recursively call for right part
        }

    }

    private static int Partition(int[] ARR, int low, int high) {

        int i = (low-1); // Index of current element which we have to swap
        int pivot = ARR[high];

        for (int j = low; j < high; j++) {

            if(ARR[j] < pivot){
                i++;
                int TEMP;
                // Swap if the current element is smaller than pivot
                TEMP = ARR[i];
                ARR[i] = ARR[j];
                ARR[j] = TEMP;
            }
        }

        int TEMP;
        // Swap the pivot element to its correct pisition
        TEMP = ARR[i+1];
        ARR[i+1] = ARR[high];
        ARR[high] = TEMP;

        return i + 1;
    }

}
