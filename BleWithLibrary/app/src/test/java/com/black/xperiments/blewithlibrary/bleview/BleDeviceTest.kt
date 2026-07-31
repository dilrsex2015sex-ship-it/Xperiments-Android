package com.black.xperiments.blewithlibrary.bleview

import org.junit.Assert.*
import org.junit.Test

class BleDeviceTest {

    @Test
    fun constructor_setsName() {
        val device = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        assertEquals("MyDevice", device.name)
    }

    @Test
    fun constructor_setsAddress() {
        val device = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        assertEquals("AA:BB:CC:DD:EE:FF", device.address)
    }

    @Test
    fun constructor_setsRssi() {
        val device = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        assertEquals("-70", device.rssi)
    }

    @Test
    fun equality_sameValues_areEqual() {
        val d1 = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        val d2 = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        assertEquals(d1, d2)
    }

    @Test
    fun equality_differentName_areNotEqual() {
        val d1 = BleDevice("DeviceA", "AA:BB:CC:DD:EE:FF", "-70")
        val d2 = BleDevice("DeviceB", "AA:BB:CC:DD:EE:FF", "-70")
        assertNotEquals(d1, d2)
    }

    @Test
    fun equality_differentAddress_areNotEqual() {
        val d1 = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-70")
        val d2 = BleDevice("MyDevice", "11:22:33:44:55:66", "-70")
        assertNotEquals(d1, d2)
    }

    @Test
    fun equality_differentRssi_areNotEqual() {
        val d1 = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-60")
        val d2 = BleDevice("MyDevice", "AA:BB:CC:DD:EE:FF", "-80")
        assertNotEquals(d1, d2)
    }

    @Test
    fun copy_changesOnlyRssi() {
        val original = BleDevice("DevA", "AA:BB:CC:DD:EE:FF", "-60")
        val copied = original.copy(rssi = "-80")
        assertEquals("DevA", copied.name)
        assertEquals("AA:BB:CC:DD:EE:FF", copied.address)
        assertEquals("-80", copied.rssi)
    }

    @Test
    fun hashCode_equalObjects_haveSameHashCode() {
        val d1 = BleDevice("X", "addr", "rssi")
        val d2 = BleDevice("X", "addr", "rssi")
        assertEquals(d1.hashCode(), d2.hashCode())
    }

    @Test
    fun toString_containsName() {
        val device = BleDevice("TargetDevice", "addr", "rssi")
        assertTrue(device.toString().contains("TargetDevice"))
    }
}
