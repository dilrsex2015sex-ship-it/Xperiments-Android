package com.xperiments.imublesensor.navigation

import org.junit.Assert.*
import org.junit.Test

class ScreenTest {

    @Test
    fun mainScreen_hasCorrectRoute() {
        assertEquals("main_screen", Screen.MainScreen.route)
    }

    @Test
    fun detailScreen_hasCorrectRoute() {
        assertEquals("detail_screen", Screen.DetailScreen.route)
    }

    @Test
    fun withArgs_noArgs_returnsRouteUnchanged() {
        assertEquals("main_screen", Screen.MainScreen.withArgs())
    }

    @Test
    fun withArgs_singleArg_appendsSlashAndArg() {
        assertEquals("main_screen/foo", Screen.MainScreen.withArgs("foo"))
    }

    @Test
    fun withArgs_multipleArgs_appendsSlashSeparatedArgs() {
        assertEquals("detail_screen/a/b/c", Screen.DetailScreen.withArgs("a", "b", "c"))
    }

    @Test
    fun withArgs_emptyStringArg_appendsSlash() {
        assertEquals("main_screen/", Screen.MainScreen.withArgs(""))
    }

    @Test
    fun withArgs_detailScreen_singleArg_buildsCorrectPath() {
        assertEquals("detail_screen/42", Screen.DetailScreen.withArgs("42"))
    }

    @Test
    fun withArgs_twoArgs_appendsBothWithSlashes() {
        assertEquals("main_screen/first/second", Screen.MainScreen.withArgs("first", "second"))
    }
}
