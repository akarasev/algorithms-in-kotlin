package org.example.sorting

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class CountingSorterTest {

    @Test fun testSort() {
        val a = intArrayOf(2, 5, 3, 0, 2, 3, 0, 3)
        val b = CountingSorter().sort(a, a.max()!! + 1)
        assertArrayEquals(intArrayOf(0, 0, 2, 2, 3, 3, 3, 5), b)
    }
}