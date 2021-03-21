package SORTIN_ALGORYTHMS.QUICK_SORT_185_02;

public class QuickSortMethods {
    
    public static void QuickSort(int[] ARR, int low, int high){

        if(low < high){

            int pi = Partitionig(ARR,low,high);

            QuickSort(ARR,low,pi-1);
            QuickSort(ARR,pi+1,high);
        }

    }

    public static int Partitionig(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = (low - 1);

        for(int j = low; j < high; j++){

            if(arr[j] < pivot){
                i++;

                // swap elements i and j of ARR
                int BUFF = arr[i];
                arr[i] = arr[j];
                arr[j] = BUFF;
            }

        }

        // put the pivot element at right pisition
        int BUFF = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = BUFF;




        return i+1;
    }


}
