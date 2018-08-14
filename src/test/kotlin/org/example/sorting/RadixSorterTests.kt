package org.example.sorting

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class RadixSorterTests {

    @Test fun testSort() {
        val a = intArrayOf(170, 45, 75, 90, 802, 24, 2, 65)
        RadixSorter().sort(a)
        assertArrayEquals(intArrayOf(2, 24, 45, 65, 75, 90, 170, 802), a)
    }

}