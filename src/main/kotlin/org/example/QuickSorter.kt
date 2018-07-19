package org.example

import java.util.*

class QuickSorter {

    fun sort(a: IntArray): Unit {
        sort(a, 0, a.size - 1)
    }

    private fun ClosedRange<Int>.random() =
            Random().nextInt((endInclusive + 1) - start) + start

    private fun sort(a: IntArray, p: Int, r: Int): Unit {
        if (p < r) {
            val q = randomizedPartition(a, p, r)
            sort(a, p, q - 1)
            sort(a, q + 1, r)
        }
    }

    private fun randomizedPartition(a: IntArray, p: Int, r: Int): Int {
        val i = (p..r).random()
        swap(a, r, i)
        return partition(a, p, r)
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