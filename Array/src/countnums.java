
public class countnums {
	public static int count (int[] A, int x) {
		int low = 0; 
		// low of vector
		int high = A.length - 1; 
		// high of vector
		int count = 0; 
		// Returns accum. of the specified integer
		x = 0;
		// WHILE LOOP: Allows code to be repeatedly executed
		while (low<=high) { 
			if(A[low] == x)  {
				count++;
			}
			else {
				low++;
			}


		}
		return count;
	}
}

//TESTS are in JUnit Test Case

