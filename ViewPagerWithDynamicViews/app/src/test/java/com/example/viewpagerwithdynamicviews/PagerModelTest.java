package com.example.viewpagerwithdynamicviews;

import org.junit.Test;

import static org.junit.Assert.*;

public class PagerModelTest {

    @Test
    public void constructor_setsPageNumber() {
        PagerModel model = new PagerModel(2, true);
        assertEquals(2, model.getPageNumber());
    }

    @Test
    public void constructor_setsToPageTrue() {
        PagerModel model = new PagerModel(0, true);
        assertTrue(model.isToPage());
    }

    @Test
    public void constructor_setsToPageFalse() {
        PagerModel model = new PagerModel(1, false);
        assertFalse(model.isToPage());
    }

    @Test
    public void getPageNumber_returnsZeroForFirstPage() {
        PagerModel model = new PagerModel(0, true);
        assertEquals(0, model.getPageNumber());
    }

    @Test
    public void getPageNumber_returnsLargeValue() {
        PagerModel model = new PagerModel(100, false);
        assertEquals(100, model.getPageNumber());
    }

    @Test
    public void getPageNumber_returnsNegativeValue() {
        PagerModel model = new PagerModel(-1, false);
        assertEquals(-1, model.getPageNumber());
    }

    @Test
    public void isToPage_trueAndFalse_areDistinct() {
        PagerModel toPage = new PagerModel(0, true);
        PagerModel notToPage = new PagerModel(0, false);
        assertNotEquals(toPage.isToPage(), notToPage.isToPage());
    }
}
