
import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;
class ReverseArraysTest {

	@Test
	void test() {
		int [] a ={1,2,3};
		ReverseArrays.reverseArray(a);
		
		assertArrayEquals(a, new int [] {3,2,1,});
	
	}

}
