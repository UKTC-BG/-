package SORTIN_ALGORYTHMS.QUICK_SORT_183_02;

import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.QUICK_SORT_183_02.QuickSortMethods.*;

public class QuickSortMain {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int N = Input.nextInt(); // Number of elements
        //int N = Integer.parseInt(Input.nextLine()); // Same as above

        int[] ARR = new int[N]; // Define array of N elements

        // For cycle to fill up the array
        for (int i = 0; i < N; i++) {
            System.out.printf("Please, input the [%d] element : ", i);
            ARR[i] = Input.nextInt();
        }

        // BEFORE SORTING
        System.out.println("BEFORE SORTING : " + Arrays.toString(ARR));

        // Call QuickSort
        QuickSort(ARR,0,N-1);

        // AFTER SORTING
        System.out.println("AFTER SORTING : " + Arrays.toString(ARR));

    }

}
