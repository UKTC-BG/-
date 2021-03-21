package SORTIN_ALGORYTHMS.QUICK_SORT_181_02;

public class QuickSortMethodsJava {

    // Quick Sort
    public static void QuickSort(int[] ARR,int low,int high) {


        if (low < high) {

            int pi = Partitioning(ARR, low, high);

            QuickSort(ARR, low, pi - 1);
            QuickSort(ARR, pi + 1, high);
        }
    }



    private static int Partitioning(int[] ARR, int low, int high) {

        int pivot = ARR[high]; // Pivot element is the element with highest index
        int i = low-1; // Index of current position in the array

        for (int j = low; j < high; j++) {

            if(ARR[j] < pivot){

                i++;
                // swap elements while comparing
                int TEMP = ARR[i];
                ARR[i] = ARR[j];
                ARR[j] = TEMP;
            }
        }
        // Set pivot element at right position
        int TEMP = ARR[high]; // Write pivot value to TEMP
        ARR[high] = ARR[i+1];
        ARR[i+1] = TEMP;

        return i+1;
    }
}
