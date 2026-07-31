package com.black.xperiments.readwriteshare.common

import org.junit.Assert.*
import org.junit.Test

class SensorDataTest {

    @Test
    fun toCSVData_endsWithNewline() {
        val csv = SensorData("1.5").toCSVData()
        assertTrue(csv.endsWith("\n"))
    }

    @Test
    fun toCSVData_containsComma() {
        val csv = SensorData("42.0").toCSVData()
        assertTrue(csv.contains(","))
    }

    @Test
    fun toCSVData_dataAppearsAfterComma() {
        val data = "99.9"
        val csv = SensorData(data).toCSVData()
        val parts = csv.trimEnd().split(",")
        assertEquals(2, parts.size)
        assertEquals(data, parts[1])
    }

    @Test
    fun toCSVData_timestampIsValidLong() {
        val before = System.currentTimeMillis()
        val csv = SensorData("0").toCSVData()
        val after = System.currentTimeMillis()
        val timestamp = csv.split(",")[0].toLong()
        assertTrue(timestamp >= before)
        assertTrue(timestamp <= after)
    }

    @Test
    fun toCSVData_emptyData_stillFormatsWithCommaAndNewline() {
        val csv = SensorData("").toCSVData()
        assertTrue(csv.contains(","))
        assertTrue(csv.endsWith("\n"))
    }

    @Test
    fun toCSVData_hasExactlyOneComma() {
        val csv = SensorData("12.34").toCSVData()
        assertEquals(1, csv.count { it == ',' })
    }

    @Test
    fun toCSVData_hasExactlyOneNewline() {
        val csv = SensorData("5.0").toCSVData()
        assertEquals(1, csv.count { it == '\n' })
    }

    @Test
    fun toCSVData_differentDataValues_produceDistinctDataSegment() {
        val csv1 = SensorData("aaa").toCSVData().trimEnd().split(",")[1]
        val csv2 = SensorData("bbb").toCSVData().trimEnd().split(",")[1]
        assertNotEquals(csv1, csv2)
    }
}
