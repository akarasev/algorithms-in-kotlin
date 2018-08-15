package org.example.sorting

class BucketSorter {

    fun sort(a: DoubleArray) {
        val n = a.size
        val b: MutableList<MutableList<Double>> = ArrayList()

        for (i in 0 until n) {
            b.add(i, mutableListOf())
        }

        for (i in a.indices) {
            b[(n * a[i]).toInt()].add(a[i])
        }

        for (i in b.indices) {
            b[i].sort()
        }

        var index = 0
        for (i in b.indices) {
            for (item in b[i]) {
                a[index++] = item
            }
        }
    }

}
