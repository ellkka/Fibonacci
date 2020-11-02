import md.roadmap.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacciFactorial {

    @Test
    public void TestFibonacciRecursion() {
        Fibonacci number = new Fibonacci();
        assertEquals(3, number.fibonacciRecursion(5));
    }

    @Test
    public void TestFactorialIterative() {
        Factorial number = new Factorial();
        assertEquals(24, number.factorialIterative(4));
    }

}
