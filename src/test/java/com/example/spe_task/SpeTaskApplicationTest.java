package com.example.spe_task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeTaskApplicationTests {
    @Test
    public void testAdd() {
        double result = SpeTaskApplication.add(9, 4);
        assertEquals(13, result, 0.0001,"testing addition of two numbers:"); // Delta is used for double comparison
    }

    @Test
    public void testSubtract() {
        double result = SpeTaskApplication.subtract(5, 2);
        assertEquals(3, result, 0.0001,"testing subtraction of two numbers");
    }

    @Test
    public void testMultiply() {
        double result = SpeTaskApplication.multiply(6, 4);
        assertEquals(24, result, 0.0001,"testing multiplication of two numbers");
    }

    @Test
    public void testDivide() {
        double result = SpeTaskApplication.division(30, 15);
        assertEquals(2, result, 0.0001,"testing division of two numbers of two numbers");
    }



    @Test
    public void testSquareRoot() {
        double result = SpeTaskApplication.root(400);
        assertEquals(20, result, 0.0001,"testing square root of a number");
    }


    @Test
    public void testFactorial() {
        double result = SpeTaskApplication.factorial(6);
        assertEquals(720, result,"testing factorial of a number");
    }

    @Test
    public void testFactorialZero() {
        double result = SpeTaskApplication.factorial(0);
        assertEquals(1, result,"testing factorial  of 0");
    }

    @Test
    public void testFactorialOne() {
        double result = SpeTaskApplication.factorial(1);
        assertEquals(1, result,"test factorial of 1");
    }
}