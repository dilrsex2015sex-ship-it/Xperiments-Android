package com.example.onboardingexample;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScreenItemTest {

    @Test
    public void constructor_setsTitle() {
        ScreenItem item = new ScreenItem("Welcome", "Get started today", 1);
        assertEquals("Welcome", item.getTitle());
    }

    @Test
    public void constructor_setsDescription() {
        ScreenItem item = new ScreenItem("Welcome", "Get started today", 1);
        assertEquals("Get started today", item.getDesciption());
    }

    @Test
    public void constructor_setsScreenImg() {
        ScreenItem item = new ScreenItem("Welcome", "Get started today", 5);
        assertEquals(5, item.getScreenImg());
    }

    @Test
    public void setTitle_updatesTitle() {
        ScreenItem item = new ScreenItem("Old Title", "Desc", 0);
        item.setTitle("New Title");
        assertEquals("New Title", item.getTitle());
    }

    @Test
    public void setDesciption_updatesDescription() {
        ScreenItem item = new ScreenItem("Title", "Old Desc", 0);
        item.setDesciption("New Desc");
        assertEquals("New Desc", item.getDesciption());
    }

    @Test
    public void setScreenImg_updatesScreenImg() {
        ScreenItem item = new ScreenItem("Title", "Desc", 0);
        item.setScreenImg(42);
        assertEquals(42, item.getScreenImg());
    }

    @Test
    public void setTitle_doesNotAffectDescription() {
        ScreenItem item = new ScreenItem("Title", "Desc", 0);
        item.setTitle("New Title");
        assertEquals("Desc", item.getDesciption());
    }

    @Test
    public void setScreenImg_withZero_storesZero() {
        ScreenItem item = new ScreenItem("Title", "Desc", 99);
        item.setScreenImg(0);
        assertEquals(0, item.getScreenImg());
    }

    @Test
    public void allFields_canBeUpdatedIndependently() {
        ScreenItem item = new ScreenItem("T", "D", 1);
        item.setTitle("Updated Title");
        item.setDesciption("Updated Desc");
        item.setScreenImg(7);
        assertEquals("Updated Title", item.getTitle());
        assertEquals("Updated Desc", item.getDesciption());
        assertEquals(7, item.getScreenImg());
    }
}
