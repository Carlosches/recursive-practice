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
	
	@Test
	public void testPalindrome(){
		assertTrue("the method don't work" , RecursiveFuctions.palindrome("ana", "ana".length()-1));
		assertTrue("the method don't work" , !RecursiveFuctions.palindrome("casa", "casa".length()-1));
		assertTrue("the method don't work" , RecursiveFuctions.palindrome("anitalavalatina", "anitalavalatina".length()-1));
		
	}
	
	@Test
	public void testFlipString(){
		assertTrue("the method don't work" , RecursiveFuctions.flipString("saque 5.0", "saque 5.0".length()-1).equals("0.5 euqas") );
		assertTrue("the method don't work" , RecursiveFuctions.flipString("Hola Mundo", "odnuM aloH".length()-1).equals("odnuM aloH"));
		assertTrue("the method don't work" , RecursiveFuctions.flipString("juliana", "anailuj".length()-1).equals("anailuj"));
		
	}
	
	@Test
	public void testMixString(){
		assertTrue("the method don't work" , RecursiveFuctions.mixString("ABCD", "EFGH", "ABCD".length()-1).equals("AEBFCGDH"));
		assertTrue("the method don't work" , RecursiveFuctions.mixString("hola", "mund" , "hola".length()-1).equals("hmoulnad"));
		assertTrue("the method don't work" , RecursiveFuctions.mixString("fg", "hj", "fg".length()-1).equals("fhgj"));
		
	}
}
