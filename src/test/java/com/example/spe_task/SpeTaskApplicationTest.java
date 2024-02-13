package com.example.spe_task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeTaskApplicationTests {
    @Test
    public void testAdd() {
        double result = SpeTaskApplication.add(3, 4);
        assertEquals(7, result, 0.0001,"testing addition of two numbers"); // Delta is used for double comparison
    }

    @Test
    public void testSubtract() {
        double result = SpeTaskApplication.subtract(8, 5);
        assertEquals(3, result, 0.0001,"testing subtraction of two numbers");
    }

    @Test
    public void testMultiply() {
        double result = SpeTaskApplication.multiply(2, 6);
        assertEquals(12, result, 0.0001,"testing multiplication of two numbers");
    }

    @Test
    public void testDivide() {
        double result = SpeTaskApplication.divide(9, 3);
        assertEquals(3, result, 0.0001,"testing division of two numbers of two numbers");
    }

    @Test
    public void testDivideByZero() {
        double result = SpeTaskApplication.divide(9, 0);
        assertEquals(0, result, 0.0001,"testing divide by zero exception of two numbers"); // Check for the expected result when dividing by zero
    }

    @Test
    public void testSquareRoot() {
        double result = SpeTaskApplication.squareRoot(25);
        assertEquals(5, result, 0.0001,"testing square root of a number");
    }

    @Test
    public void testNaturalLog() {
        double result = SpeTaskApplication.naturalLog(1);
        assertEquals(0, result, 0.0001,"testing natural log of a number");
    }

    @Test
    public void testFactorial() {
        int result = SpeTaskApplication.factorial(5);
        assertEquals(120, result,"testing factorial of a number");
    }

    @Test
    public void testFactorialZero() {
        int result = SpeTaskApplication.factorial(0);
        assertEquals(1, result,"testing factorial  of 0");
    }

    @Test
    public void testFactorialOne() {
        int result = SpeTaskApplication.factorial(1);
        assertEquals(1, result,"testing factorial of 1");
    }
}