package org.example

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class HeapSorterTest {

    @Test fun testSort() {
        val a = intArrayOf(16, 14, 10, 8, 7, 9, 3, 2, 4, 1);
        HeapSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 7, 8, 9, 10, 14, 16), a)
    }

    @Test fun testReversed() {
        val a = intArrayOf(5, 4, 3, 2, 1)
        HeapSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test fun testSorted() {
        val a = intArrayOf(1, 2, 3, 4, 5)
        HeapSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test fun testDuplicates() {
        val a = intArrayOf(5, 4, 4, 1, 1)
        HeapSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 1, 4, 4, 5), a)
    }

    @Test fun testReverse() {
        val a = intArrayOf(1, 3, 2, 5, 4)
        HeapSorter().reverse(a);
        assertArrayEquals(intArrayOf(5, 4, 3, 2, 1), a)
    }
}
