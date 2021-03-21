package SORTIN_ALGORYTHMS.QUICK_SORT_182_02;

public class QuickSortMethods {

    // Quick Sort Method ///////////////////////////////////////
    public static void QuickSort(int[] ARR, int low, int high){

        if (low < high){

            int pi = Partition(ARR,low,high);// pi = Pivot index - where to put the
                                            // pivot element after comparison

            QuickSort(ARR, low,pi-1); // recursive call for first half of array
            QuickSort(ARR,pi+1,high); // recursive call for second half of array
        }
    }


    // Partitioning Method ///////////////////////////////////////////////////
    private static int Partition(int[] ARR, int low, int high) {

        int pivot = ARR[high];
        int i = low-1; // Index for iteration if pivot is bigger

        for (int j = low; j < high; j++) {

            if(ARR[j] < pivot){ // If current element is smaller than pivot value

                i++;
                // Swap the elements if current is smaller
                int TEMP = ARR[i];
                ARR[i] = ARR[j];
                ARR[j] = TEMP;
            }

        }

        // Swap the Pivot element at the correct pisition
        int TEMP = ARR[high];
        ARR[high] = ARR[i+1];
        ARR[i+1] = TEMP;

        return i +1;
    }

}
