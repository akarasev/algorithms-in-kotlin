package org.example.sorting

import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class BucketSorterTests {

    @Test fun test() {
        val a = doubleArrayOf(.78, .17, .39, .26, .72, .94, .21, .12, .23, .68)
        BucketSorter().sort(a)
        assertTrue(Arrays.equals(doubleArrayOf(.12, .17, .21, .23, .26, .39, .68, .72, .78, .94), a))
    }
}