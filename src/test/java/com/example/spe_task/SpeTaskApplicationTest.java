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
        assertEquals(7, result, 0.0001,"testing addition of two numbers:"); // Delta is used for double comparison
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
        double result = SpeTaskApplication.division(9, 3);
        assertEquals(3, result, 0.0001,"testing division of two numbers of two numbers");
    }



    @Test
    public void testSquareRoot() {
        double result = SpeTaskApplication.root(25);
        assertEquals(5, result, 0.0001,"testing square root of a number");
    }

//    @Test
//    public void testNaturalLog() {
//        double result = SpeTaskApplication.naturalLog(1);
//        assertEquals(0, result, 0.0001,"testing natural log of a number");
//    }

    @Test
    public void testFactorial() {
        double result = SpeTaskApplication.factorial(5);
        assertEquals(120, result,"testing factorial of a number");
    }

    @Test
    public void testFactorialZero() {
        double result = SpeTaskApplication.factorial(0);
        assertEquals(1, result,"testing factorial  of 0");
    }

    @Test
    public void testFactorialOne() {
        double result = SpeTaskApplication.factorial(1);
        assertEquals(1, result,"testing factorial of 1");
    }
}