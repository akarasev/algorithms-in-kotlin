package org.example

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MergeSorterTest {

    @Test
    fun testSort() {
        val a = intArrayOf(2, 4, 5, 7, 1, 2, 3, 6)
        MergeSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 4, 5, 6, 7), a)
    }

    @Test
    fun testSortReversed() {
        val a = intArrayOf(5, 4, 3, 2, 1)
        MergeSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test
    fun testSortAlreadySorted() {
        val a = intArrayOf(1, 2, 3, 4, 5)
        MergeSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), a)
    }

    @Test
    fun testSortWithDuplicates() {
        val a = intArrayOf(5, 4, 4, 1, 1)
        MergeSorter().sort(a)
        assertArrayEquals(intArrayOf(1, 1, 4, 4, 5), a)
    }
}