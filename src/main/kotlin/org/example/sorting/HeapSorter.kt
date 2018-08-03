package org.example.sorting

class HeapSorter {

    fun sort(a: IntArray) {
        var heapSize = a.size

        for (i in heapSize / 2 downTo 1) {
            maxHeapify(a, i, heapSize)
        }

        while (heapSize > 1) {
            swap(a, 1, heapSize)
            heapSize--
            maxHeapify(a, 1, heapSize)
        }
    }

    private tailrec fun maxHeapify(a: IntArray, i: Int, heapSize: Int) {
        val left = getLeft(i)
        val right = getRight(i)

        var largest: Int
        if (left <= heapSize && a[left - 1] > a[i - 1]) {
            largest = left
        } else {
            largest = i
        }

        if (right <= heapSize && a[right - 1] > a[largest - 1]) {
            largest = right
        }

        if (i != largest) {
            swap(a, i, largest)
            maxHeapify(a, largest, heapSize)
        }
    }

    private fun swap(a: IntArray, i: Int, j: Int) {
        val tmp = a[i - 1]
        a[i - 1] = a[j - 1]
        a[j - 1] = tmp
    }

    private fun getLeft(i: Int): Int {
        return i * 2
    }

    private fun getRight(i: Int): Int {
        return i * 2 + 1
    }

    fun reverse(a: IntArray) {
        var heapSize = a.size

        for (i in heapSize / 2 downTo 1) {
            minHeapify(a, i, heapSize)
        }

        while (heapSize > 1) {
            swap(a, 1, heapSize)
            heapSize--
            minHeapify(a, 1, heapSize)
        }
    }

    private tailrec fun minHeapify(a: IntArray, i: Int, heapSize: Int) {
        val left = getLeft(i)
        val right = getRight(i)

        var smallest: Int
        if (left <= heapSize && a[left - 1] < a[i - 1]) {
            smallest = left
        } else {
            smallest = i
        }

        if (right <= heapSize && a[right - 1] < a[smallest - 1]) {
            smallest = right
        }

        if (i != smallest) {
            swap(a, i, smallest)
            minHeapify(a, smallest, heapSize)
        }
    }

}
