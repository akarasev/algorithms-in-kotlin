package org.example.sorting

class CountingSorter {
    fun sort(a: IntArray, k: Int): IntArray {
        val b = IntArray(a.size)

        val c = IntArray(k)
        for (i in a.indices) {
            c[a[i]]++
        }

        for (i in 1 until c.size) {
            c[i] = c[i] + c[i - 1]
        }

        for (j in a.size - 1 downTo 0) {
            b[c[a[j]] - 1] = a[j]
            c[a[j]]--
        }

        return b
    }
}