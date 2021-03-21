package SORTIN_ALGORYTHMS.QUICK_SORT_183_02_KOTLIN


// Function Quick Sort ///////////////////////////////////////////////////////////////
    fun quickSort(arr: IntArray, low: Int, high: Int) {

        if (low < high) {
            val pivotIndex = partition(arr, low, high) // Index of pivot element

            quickSort(arr, low, pivotIndex - 1) // Recursively call for left part
            quickSort(arr, pivotIndex + 1, high) // Recursively call for right part
        }
    }


// Function Partition //////////////////////////////////////////////////////////////////
    fun partition(arr: IntArray, low: Int, high: Int): Int {

        var i = low - 1 // Index of current element which we have to swap
        val pivot = arr[high]

        for (j in low until high) {

            if (arr[j] < pivot) {
                i++

                // Swap if the current element is smaller than pivot
                var temp: Int = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        // Moves the pivot element to its correct position
        val temp: Int = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp

        return i + 1
    }
