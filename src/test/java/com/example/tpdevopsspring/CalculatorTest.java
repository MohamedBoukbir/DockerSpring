package com.example.tpdevopsspring;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator ;

    @BeforeEach
    void setup(){
        calculator = new Calculator(1,2) ;
    }
    @Test
    public  void testSomme(){
        assertEquals(3,calculator.somme()) ;
    }
    @Test
    void testSoustraction(){
        assertTrue(calculator.soustractio()<0);
    }
    @Test
    void testMultupl(){
        assertNotEquals(0,calculator.multuplication());
    }
    @Test
    void testGreatest(){
        assertEquals("b",calculator.greatest());
    }
}
