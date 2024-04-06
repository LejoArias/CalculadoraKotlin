package com.example.calculadorakotlin


import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TestCalculadoraTest {

    private lateinit var nTestCalculadora: TestCalculadora

    @Before
    fun setup() {
        nTestCalculadora = TestCalculadora()
    }

    @Test
    fun operationNotNull() {
        assertNotNull(nTestCalculadora)
    }

    @Test
    fun suma() {
        assertEquals("9", nTestCalculadora.suma("4", "5"))
    }

    @Test
    fun resta() {
        assertEquals("30", nTestCalculadora.resta("60", "30"))
    }

    @Test
    fun multiplicacion() {
        assertEquals("27", nTestCalculadora.multiplicacion("3", "9"))
    }

    @Test
    fun division() {
        assertEquals("3", nTestCalculadora.division("9", "3"))
    }
}
