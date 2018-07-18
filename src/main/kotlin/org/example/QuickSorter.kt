package org.example

class QuickSorter {

    fun sort(a: IntArray): Unit {
        sort(a, 0, a.size - 1)
    }

    private fun sort(a: IntArray, p: Int, r: Int): Unit {
        if (p < r) {
            val q = partition(a, p, r)
            sort(a, p, q - 1)
            sort(a, q + 1, r)
        }
    }

    private fun partition(a: IntArray, p: Int, r: Int): Int {
        val x = a[r]
        var i = p - 1
        for (j in p..r - 1) {
            if (a[j] <= x) {
                i++
                swap(a, i, j)
            }
        }
        swap(a, i + 1, r)
        return i + 1
    }

    private fun swap(a: IntArray, i: Int, j: Int) {
        val tmp = a[i]
        a[i] = a[j]
        a[j] = tmp
    }

    fun reverse(a: IntArray): Unit {
        reverse(a, 0, a.size - 1)
    }

    private fun reverse(a: IntArray, p: Int, r: Int): Unit {
        if (p < r) {
            val q = partitionReversed(a, p, r);
            reverse(a, p, q - 1)
            reverse(a, q + 1, r)
        }
    }

    private fun partitionReversed(a: IntArray, p: Int, r: Int): Int {
        val x = a[r]
        var i = p - 1
        for (j in p..(r - 1)) {
            if (a[j] >= x) {
                i++
                swap(a, i, j)
            }
        }
        swap(a, i + 1, r)
        return i + 1
    }
}