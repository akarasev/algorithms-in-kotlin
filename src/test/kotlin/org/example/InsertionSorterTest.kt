package org.example

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class InsertionSorterTest {
    
    @Test
    fun testSort() {
        val a = intArrayOf(2, 8, 7, 1, 3, 5, 6, 4)
        InsertionSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), a)
    }

    @Test fun testSortReversed() {
        val a = intArrayOf(5, 4, 3, 2, 1)
        InsertionSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test fun testSortAlreadySorted() {
        val a = intArrayOf(1, 2, 3, 4, 5)
        InsertionSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test fun testSortWithDuplicates() {
        val a = intArrayOf(5, 4, 4, 1, 1)
        InsertionSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 1, 4, 4, 5), a)
    }
}
