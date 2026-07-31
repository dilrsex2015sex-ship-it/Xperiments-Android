package com.example.binge.movie

import org.junit.Assert.*
import org.junit.Test

class MovieTest {

    private val movie = Movie("1", "Inception", "8.8", "abc123", "inception.jpg")

    @Test
    fun id_returnsCorrectValue() {
        assertEquals("1", movie.id)
    }

    @Test
    fun title_returnsCorrectValue() {
        assertEquals("Inception", movie.title)
    }

    @Test
    fun rating_returnsCorrectValue() {
        assertEquals("8.8", movie.rating)
    }

    @Test
    fun youtubeUrl_returnsCorrectValue() {
        assertEquals("abc123", movie.youtube_url)
    }

    @Test
    fun img_returnsCorrectValue() {
        assertEquals("inception.jpg", movie.img)
    }

    @Test
    fun equality_sameValues_areEqual() {
        val other = Movie("1", "Inception", "8.8", "abc123", "inception.jpg")
        assertEquals(movie, other)
    }

    @Test
    fun equality_differentId_areNotEqual() {
        val other = Movie("2", "Inception", "8.8", "abc123", "inception.jpg")
        assertNotEquals(movie, other)
    }

    @Test
    fun equality_differentTitle_areNotEqual() {
        val other = Movie("1", "Interstellar", "8.8", "abc123", "inception.jpg")
        assertNotEquals(movie, other)
    }

    @Test
    fun copy_withChangedTitle_hasNewTitle() {
        val copied = movie.copy(title = "Interstellar")
        assertEquals("Interstellar", copied.title)
        assertEquals("1", copied.id)
    }

    @Test
    fun copy_withChangedRating_preservesOtherFields() {
        val copied = movie.copy(rating = "9.0")
        assertEquals("9.0", copied.rating)
        assertEquals("Inception", copied.title)
        assertEquals("abc123", copied.youtube_url)
    }

    @Test
    fun hashCode_sameValues_sameHashCode() {
        val other = Movie("1", "Inception", "8.8", "abc123", "inception.jpg")
        assertEquals(movie.hashCode(), other.hashCode())
    }

    @Test
    fun toString_containsTitle() {
        assertTrue(movie.toString().contains("Inception"))
    }
}
