package SORTIN_ALGORYTHMS.QUICK_SORT_183_02_KOTLIN

import java.util.*

object QuickSortMain {
    @JvmStatic
    fun main(args: Array<String>) {

        val input = Scanner(System.`in`)

        println("Input The Number Of Elements : ")
        val N = Integer.parseInt(input.nextLine())

        val arr = IntArray(N) // Define array of N elements

        // For cycle to fill up the array
        for (i in 0 until N) {
            println("Please, input the element [$i] element : ")
            arr[i] = input.nextInt()
        }

        // BEFORE SORTING
        println("BEFORE SORTING : " + arr.contentToString())

        // Call QuickSort
        quickSort(arr, 0, N - 1)

        // AFTER SORTING
        println("AFTER SORTING : " + arr.contentToString())
    }
}