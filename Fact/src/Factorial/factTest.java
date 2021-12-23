package Factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factTest {

	@Test
	void test() {
		assertEquals(CalculateFactorial.factorial(0),1);
		assertEquals(CalculateFactorial.factorial(5),120);
	}

}
