package com.example.sharepreferencenew.DataRepository;

import org.junit.Test;

import static org.junit.Assert.*;

public class StateObjectTest {

    private static final float DELTA = 0.001f;

    @Test
    public void defaultConstructor_initializesLevelToZero() {
        StateObject obj = new StateObject();
        assertEquals(0, obj.getLevel());
    }

    @Test
    public void defaultConstructor_initializesSpeedZeroToZero() {
        StateObject obj = new StateObject();
        assertEquals(0.0f, obj.getSpeed_zero(), DELTA);
    }

    @Test
    public void defaultConstructor_initializesSpeedOneToZero() {
        StateObject obj = new StateObject();
        assertEquals(0.0f, obj.getSpeed_one(), DELTA);
    }

    @Test
    public void defaultConstructor_initializesSpeedTwoToZero() {
        StateObject obj = new StateObject();
        assertEquals(0.0f, obj.getSpeed_two(), DELTA);
    }

    @Test
    public void setLevel_updatesLevel() {
        StateObject obj = new StateObject();
        obj.setLevel(3);
        assertEquals(3, obj.getLevel());
    }

    @Test
    public void setSpeedZero_updatesSpeedZero() {
        StateObject obj = new StateObject();
        obj.setSpeed_zero(1.5f);
        assertEquals(1.5f, obj.getSpeed_zero(), DELTA);
    }

    @Test
    public void setSpeedOne_updatesSpeedOne() {
        StateObject obj = new StateObject();
        obj.setSpeed_one(2.5f);
        assertEquals(2.5f, obj.getSpeed_one(), DELTA);
    }

    @Test
    public void setSpeedTwo_updatesSpeedTwo() {
        StateObject obj = new StateObject();
        obj.setSpeed_two(3.5f);
        assertEquals(3.5f, obj.getSpeed_two(), DELTA);
    }

    @Test
    public void setLevel_doesNotAffectSpeeds() {
        StateObject obj = new StateObject();
        obj.setLevel(5);
        assertEquals(0.0f, obj.getSpeed_zero(), DELTA);
        assertEquals(0.0f, obj.getSpeed_one(), DELTA);
        assertEquals(0.0f, obj.getSpeed_two(), DELTA);
    }

    @Test
    public void allFields_canBeSetAndReadIndependently() {
        StateObject obj = new StateObject();
        obj.setLevel(2);
        obj.setSpeed_zero(0.1f);
        obj.setSpeed_one(0.2f);
        obj.setSpeed_two(0.3f);
        assertEquals(2, obj.getLevel());
        assertEquals(0.1f, obj.getSpeed_zero(), DELTA);
        assertEquals(0.2f, obj.getSpeed_one(), DELTA);
        assertEquals(0.3f, obj.getSpeed_two(), DELTA);
    }
}
