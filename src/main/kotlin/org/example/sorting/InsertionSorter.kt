package org.example.sorting

class InsertionSorter {

    fun sort(a: IntArray): Unit {
        for (j in 1 until a.size) {
            val key = a[j]
            var i = j - 1
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i]
                i--
            }
            a[i + 1] = key
        }
    }
}