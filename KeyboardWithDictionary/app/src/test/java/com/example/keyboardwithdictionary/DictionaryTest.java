package com.example.keyboardwithdictionary;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {

    @Test
    public void constructor_setsWordAndLocale() {
        Dictionary dict = new Dictionary("hello", "en");
        assertEquals("hello", dict.getWord());
        assertEquals("en", dict.getLocale());
    }

    @Test
    public void getWord_returnsCorrectValue() {
        Dictionary dict = new Dictionary("bonjour", "fr");
        assertEquals("bonjour", dict.getWord());
    }

    @Test
    public void getLocale_returnsCorrectValue() {
        Dictionary dict = new Dictionary("ciao", "it");
        assertEquals("it", dict.getLocale());
    }

    @Test
    public void setWord_updatesWord() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setWord("world");
        assertEquals("world", dict.getWord());
    }

    @Test
    public void setLocale_updatesLocale() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setLocale("fr");
        assertEquals("fr", dict.getLocale());
    }

    @Test
    public void setWord_doesNotAffectLocale() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setWord("world");
        assertEquals("en", dict.getLocale());
    }

    @Test
    public void setLocale_doesNotAffectWord() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setLocale("de");
        assertEquals("hello", dict.getWord());
    }

    @Test
    public void setWord_toNull_storesNull() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setWord(null);
        assertNull(dict.getWord());
    }

    @Test
    public void setLocale_toNull_storesNull() {
        Dictionary dict = new Dictionary("hello", "en");
        dict.setLocale(null);
        assertNull(dict.getLocale());
    }

    @Test
    public void multipleSetters_canBeChained() {
        Dictionary dict = new Dictionary("old_word", "old_locale");
        dict.setWord("new_word");
        dict.setLocale("new_locale");
        assertEquals("new_word", dict.getWord());
        assertEquals("new_locale", dict.getLocale());
    }
}
