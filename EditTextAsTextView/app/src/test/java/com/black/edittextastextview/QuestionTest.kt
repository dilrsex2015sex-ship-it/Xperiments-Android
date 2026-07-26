package com.black.edittextastextview

import org.junit.Assert.*
import org.junit.Test

class QuestionTest {

    @Test
    fun primaryConstructor_setsQuestionAndAnswer() {
        val q = Question("What is 2+2?", "4")
        assertEquals("What is 2+2?", q.question)
        assertEquals("4", q.answer)
    }

    @Test
    fun defaultConstructor_setsEmptyStrings() {
        val q = Question()
        assertEquals("", q.question)
        assertEquals("", q.answer)
    }

    @Test
    fun equality_sameValues_areEqual() {
        val q1 = Question("Q?", "A")
        val q2 = Question("Q?", "A")
        assertEquals(q1, q2)
    }

    @Test
    fun equality_differentQuestion_areNotEqual() {
        val q1 = Question("Q1?", "A")
        val q2 = Question("Q2?", "A")
        assertNotEquals(q1, q2)
    }

    @Test
    fun equality_differentAnswer_areNotEqual() {
        val q1 = Question("Q?", "A")
        val q2 = Question("Q?", "B")
        assertNotEquals(q1, q2)
    }

    @Test
    fun copy_changesOnlyAnswer() {
        val original = Question("Original Q?", "A")
        val copied = original.copy(answer = "B")
        assertEquals("Original Q?", copied.question)
        assertEquals("B", copied.answer)
    }

    @Test
    fun copy_changesOnlyQuestion() {
        val original = Question("Old Q?", "Answer")
        val copied = original.copy(question = "New Q?")
        assertEquals("New Q?", copied.question)
        assertEquals("Answer", copied.answer)
    }

    @Test
    fun mutableProperties_canBeUpdated() {
        val q = Question("Old Q?", "Old A")
        q.question = "New Q?"
        q.answer = "New A"
        assertEquals("New Q?", q.question)
        assertEquals("New A", q.answer)
    }

    @Test
    fun isSerializable() {
        val q = Question("Q?", "A")
        assertTrue(q is java.io.Serializable)
    }

    @Test
    fun hashCode_equalObjects_haveSameHashCode() {
        val q1 = Question("Q?", "A")
        val q2 = Question("Q?", "A")
        assertEquals(q1.hashCode(), q2.hashCode())
    }
}
