package SORTIN_ALGORYTHMS.QUICK_SORT_181_02;

import java.util.Arrays;
import java.util.Scanner;

import static SORTIN_ALGORYTHMS.QUICK_SORT_181_02.QuickSortMethods.*;

public class QuickSortMain {

    public static void main(String[] args) {
        
       // int N = 0;
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Please, input the number of elements : ");
        int N = Input.nextInt();
        // int N = Integer.parseInt(Input.nextLine()); // Same as above
        
        int[] ARR = new int[N];
        
        // For cycle to load array values
        for (int i = 0; i < N; i++) {

            System.out.printf("Please input [%d] element of array : ",i);
            ARR[i] = Input.nextInt();
            
        }
        
        
        // Print Before
        System.out.println("BEFORE SORT : " + Arrays.toString(ARR));
        
        
        // QuickSort
        QuickSort(ARR,0,N-1);
        
        
        // Print After
        System.out.println("AFTER SORT : " + Arrays.toString(ARR));
        
        
    }// end of Main
    
    
}// end of Class
