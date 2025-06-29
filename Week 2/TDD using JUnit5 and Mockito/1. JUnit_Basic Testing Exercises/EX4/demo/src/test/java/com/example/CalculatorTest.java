package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup (Arrange)
        System.out.println("Setting up Calculator");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        // Teardown
        System.out.println("Cleaning up Calculator");
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Arrange is done in setUp()

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}
