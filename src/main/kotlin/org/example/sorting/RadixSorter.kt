package org.example.sorting

class RadixSorter {
    fun sort(a: IntArray) {
        val max = a.max()!!

        var exponent = 1
        while (max / exponent > 0) {
            sort(a, exponent)
            println(a.joinToString())

            exponent *= 10
        }
    }

    private fun sort(a: IntArray, exponent: Int) {
        val b = IntArray(a.size)
        val c = IntArray(10)

        for (number in a) {
            c[(number / exponent) % 10]++;
        }

        for (i in 1..9) {
            c[i] = c[i - 1] + c[i]
        }

        for (j in a.size - 1 downTo 0) {
            b[c[(a[j] / exponent) % 10] - 1] = a[j]
            c[(a[j] / exponent) % 10]--;
        }

        for (i in b.indices) {
            a[i] = b[i]
        }
    }

}
