import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveFuctionsTest {

	@Test
	public void testFactorial() {
		
		
		assertTrue("the method don't work", RecursiveFuctions.factorial(5) == 120);
		assertTrue("the method don't work", RecursiveFuctions.factorial(10) == 3628800);
		assertTrue("the method don't work", RecursiveFuctions.factorial(8) == 40320);
		
	}
	
	@Test
	public void testFibonacci() {
		
		assertTrue("the method don't work" , RecursiveFuctions.fibonacci(4) == 3);
		assertTrue("the method don't work", RecursiveFuctions.fibonacci(7) == 13);
		assertTrue("the method don't work", RecursiveFuctions.fibonacci(10) == 55);
		
	}

	
	@Test
	public void testarraySummatory() {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		assertTrue("the method don't work" , RecursiveFuctions.arraySummatory(arr, arr.length-1) == 45);
		assertTrue("the method don't work", RecursiveFuctions.arraySummatory(arr, 4) == 15);
		assertTrue("the method don't work",  RecursiveFuctions.arraySummatory(arr, 7) == 36);
		
	}
}
