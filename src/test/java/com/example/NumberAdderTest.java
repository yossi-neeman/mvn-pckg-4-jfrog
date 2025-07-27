package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for NumberAdder.
 */
public class NumberAdderTest {
    
    @Test
    public void testAddNumbers() {
        // Test with positive integers
        assertEquals(6.0, NumberAdder.addNumbers(1, 2, 3), 0.001);
        
        // Test with negative numbers
        assertEquals(-6.0, NumberAdder.addNumbers(-1, -2, -3), 0.001);
        
        // Test with decimal numbers
        assertEquals(7.5, NumberAdder.addNumbers(2.5, 3.0, 2.0), 0.001);
        
        // Test with zero
        assertEquals(5.0, NumberAdder.addNumbers(5, 0, 0), 0.001);
        
        // Test with large numbers
        assertEquals(3000.0, NumberAdder.addNumbers(1000, 1000, 1000), 0.001);
    }
} 