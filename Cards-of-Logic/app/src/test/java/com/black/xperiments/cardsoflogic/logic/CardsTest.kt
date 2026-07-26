package com.black.xperiments.cardsoflogic.logic

import org.junit.Assert.*
import org.junit.Test

class CardsTest {

    @Test
    fun defaultConstructor_setsAllFieldsToEmptyStrings() {
        val card = Cards()
        assertEquals("", card.imgSrc)
        assertEquals("", card.title)
        assertEquals("", card.explanation)
        assertEquals("", card.example)
        assertEquals("", card.conclusion)
    }

    @Test
    fun primaryConstructor_withAllArgs_setsProvidedValues() {
        val card = Cards("img.png", "Strawman", "Misrepresentation of position", "Example here", "Conclusion here")
        assertEquals("img.png", card.imgSrc)
        assertEquals("Strawman", card.title)
        assertEquals("Misrepresentation of position", card.explanation)
        assertEquals("Example here", card.example)
        assertEquals("Conclusion here", card.conclusion)
    }

    @Test
    fun primaryConstructor_defaultValues_areUsedWhenNotProvided() {
        val card = Cards(imgSrc = "test.png")
        assertEquals("test.png", card.imgSrc)
        assertEquals("Name of the Fallacy", card.title)
        assertEquals("Here is the explanation of the fallacy", card.explanation)
        assertEquals("Example of the fallacy", card.example)
        assertEquals("Conclusion of the example", card.conclusion)
    }

    @Test
    fun equality_sameValues_areEqual() {
        val card1 = Cards("img.png", "Ad Hominem", "Attack on person", "Example", "Conclusion")
        val card2 = Cards("img.png", "Ad Hominem", "Attack on person", "Example", "Conclusion")
        assertEquals(card1, card2)
    }

    @Test
    fun equality_differentTitle_areNotEqual() {
        val card1 = Cards("img.png", "Strawman", "Explanation", "Example", "Conclusion")
        val card2 = Cards("img.png", "Ad Hominem", "Explanation", "Example", "Conclusion")
        assertNotEquals(card1, card2)
    }

    @Test
    fun copy_changesOnlySpecifiedField() {
        val original = Cards("img.png", "Strawman", "Misrepresentation", "Example", "Conclusion")
        val copied = original.copy(title = "Ad Hominem")
        assertEquals("Ad Hominem", copied.title)
        assertEquals("img.png", copied.imgSrc)
        assertEquals("Misrepresentation", copied.explanation)
    }

    @Test
    fun mutableProperties_canBeUpdated() {
        val card = Cards()
        card.title = "New Title"
        card.explanation = "New Explanation"
        assertEquals("New Title", card.title)
        assertEquals("New Explanation", card.explanation)
    }

    @Test
    fun isSerializable() {
        val card = Cards("img.png", "Test", "Explanation", "Example", "Conclusion")
        assertTrue(card is java.io.Serializable)
    }

    @Test
    fun imgSrc_canBeNull() {
        val card = Cards(imgSrc = null)
        assertNull(card.imgSrc)
    }

    @Test
    fun hashCode_equalObjects_haveSameHashCode() {
        val card1 = Cards("img.png", "Fallacy", "Expl", "Ex", "Con")
        val card2 = Cards("img.png", "Fallacy", "Expl", "Ex", "Con")
        assertEquals(card1.hashCode(), card2.hashCode())
    }
}
