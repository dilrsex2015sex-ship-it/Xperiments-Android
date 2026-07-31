package com.example.daolivechange;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataObjectTest {

    @Test
    public void defaultConstructor_initializesAppleToZero() {
        DataObject obj = new DataObject();
        assertEquals(0, obj.getApple());
    }

    @Test
    public void defaultConstructor_initializesBananaToZero() {
        DataObject obj = new DataObject();
        assertEquals(0, obj.getBanana());
    }

    @Test
    public void defaultConstructor_initializesOrangeToZero() {
        DataObject obj = new DataObject();
        assertEquals(0, obj.getOrange());
    }

    @Test
    public void setApple_updatesApple() {
        DataObject obj = new DataObject();
        obj.setApple(5);
        assertEquals(5, obj.getApple());
    }

    @Test
    public void setBanana_updatesBanana() {
        DataObject obj = new DataObject();
        obj.setBanana(10);
        assertEquals(10, obj.getBanana());
    }

    @Test
    public void setOrange_updatesOrange() {
        DataObject obj = new DataObject();
        obj.setOrange(3);
        assertEquals(3, obj.getOrange());
    }

    @Test
    public void setApple_negativeValue_storesNegative() {
        DataObject obj = new DataObject();
        obj.setApple(-1);
        assertEquals(-1, obj.getApple());
    }

    @Test
    public void setApple_doesNotAffectOtherFields() {
        DataObject obj = new DataObject();
        obj.setApple(99);
        assertEquals(0, obj.getBanana());
        assertEquals(0, obj.getOrange());
    }

    @Test
    public void allSetters_areIndependent() {
        DataObject obj = new DataObject();
        obj.setApple(1);
        obj.setBanana(2);
        obj.setOrange(3);
        assertEquals(1, obj.getApple());
        assertEquals(2, obj.getBanana());
        assertEquals(3, obj.getOrange());
    }

    @Test
    public void setter_overwritesPreviousValue() {
        DataObject obj = new DataObject();
        obj.setApple(5);
        obj.setApple(10);
        assertEquals(10, obj.getApple());
    }
}
