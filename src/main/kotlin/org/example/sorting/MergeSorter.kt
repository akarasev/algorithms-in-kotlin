package org.example.sorting

class MergeSorter {

    fun sort(a: IntArray) {
        sort(a, 0, a.size - 1);
    }

    private fun sort(a: IntArray, p: Int, r: Int) {
        if (p < r) {
            val q = (p + r) / 2
            sort(a, p, q)
            sort(a, q + 1, r)
            merge(a, p, q, r)
        }
    }

    private fun merge(a: IntArray, p: Int, q: Int, r: Int) {
        val leftSize = q - p + 1
        val left = IntArray(leftSize + 1)
        for (i in 0 until leftSize) {
            left[i] = a[p + i]
        }
        left[leftSize] = Int.MAX_VALUE

        val rightSize = r - q
        val right = IntArray(rightSize + 1)
        for (j in 0 until rightSize) {
            right[j] = a[q + j + 1]
        }
        right[rightSize] = Int.MAX_VALUE

        var i = 0
        var j = 0
        for (k in p..r) {
            if (left[i] <= right[j]) {
                a[k] = left[i]
                i++
            } else {
                a[k] = right[j]
                j++
            }
        }
    }
}