package SORTIN_ALGORYTHMS.QUICK_SORT_181_02

//import SORTIN_ALGORYTHMS.QUICK_SORT_181_02.QuickSortMethods

object QuickSortMethods {
    // Quick Sort
    @JvmStatic
    fun QuickSort(ARR: IntArray, low: Int, high: Int) {

        if (low < high) {
            val pi = Partitioning(ARR, low, high)
            QuickSort(ARR, low, pi - 1)
            QuickSort(ARR, pi + 1, high)
        }
    }

    private fun Partitioning(ARR: IntArray, low: Int, high: Int): Int {
        val pivot = ARR[high] // Pivot element is the element with highest index
        var i = low - 1 // Index of current position in the array

        for (j in low until high) {
            if (ARR[j] < pivot) {
                i++
                // swap elements while comparing
                val TEMP = ARR[i]
                ARR[i] = ARR[j]
                ARR[j] = TEMP
            }
        }

        // Set pivot element at right position
        val TEMP = ARR[high] // Write pivot value to TEMP
        ARR[high] = ARR[i + 1]
        ARR[i + 1] = TEMP
        return i + 1
    }
}