package org.example.sorting

class CountingSorter {
    fun sort(a: IntArray, b: IntArray, k: Int) {
        val c = IntArray(k)
        for (i in a.indices) {
            c[a[i]] += 1
        }

        for (j in 1 until k) {
            c[j] = c[j] + c[j - 1]
        }

        for (i in a.size - 1 downTo 0) {
            b[c[a[i]] - 1] = a[i]
            c[a[i]] -= 1
        }
    }
}