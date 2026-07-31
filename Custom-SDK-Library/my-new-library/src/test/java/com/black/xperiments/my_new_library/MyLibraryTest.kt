package com.black.xperiments.my_new_library

import org.junit.Assert.*
import org.junit.Test

class MyLibraryTest {

    private val library = MyLibrary()

    @Test
    fun blind_positiveValue_returnsHello() {
        assertEquals("hello", library.blind(1))
    }

    @Test
    fun blind_largePositiveValue_returnsHello() {
        assertEquals("hello", library.blind(Int.MAX_VALUE))
    }

    @Test
    fun blind_zero_returnsByeBye() {
        assertEquals("bye bye", library.blind(0))
    }

    @Test
    fun blind_negativeOne_returnsByeBye() {
        assertEquals("bye bye", library.blind(-1))
    }

    @Test
    fun blind_largeNegativeValue_returnsByeBye() {
        assertEquals("bye bye", library.blind(Int.MIN_VALUE))
    }

    @Test
    fun blind_onlyPositiveValuesReturnHello() {
        assertTrue(library.blind(100) == "hello")
        assertTrue(library.blind(0) != "hello")
        assertTrue(library.blind(-100) != "hello")
    }
}
