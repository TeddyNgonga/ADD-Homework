package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
	@Test
	void testFib() {
		assertEquals(0, Fibonacci.calc(0));
		assertEquals(1, Fibonacci.calc(1));
		assertEquals(1, Fibonacci.calc(2));
		assertEquals(2, Fibonacci.calc(3));
		assertEquals(3, Fibonacci.calc(4));
		assertEquals(5, Fibonacci.calc(5));
		assertEquals(1134903170, Fibonacci.calc(45));
	}

}
