
public class RecursiveFuctions {
	
	
	public static long factorial(int n){
		
		if(n==0){
			return 1;
		}
		return n*factorial(n-1);
		
	}
	
	
	public static int fibonacci(int n){
		
		if(n == 1){
			return 1;
		}
		else if(n==0){
			return 0;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int arraySummatory(int[] array, int n){
		
		if(n==0){
			return array[0];
		}
		return array[n] + arraySummatory(array, n-1);
	}
	
	public static boolean palindrome(String s, int n){
		
		if(n == (n/2)){
			return true;
		}else if(s.charAt(s.length()-1-n) != s.charAt(n)){
			return false;
		}else{
			return palindrome(s, n-1);
		}
	}
	
	public static String flipString(String cadena, int n ){
		
		if(n == 0){
			return ""+cadena.charAt(n);
		}else{
			return ""+ cadena.charAt(n) + flipString(cadena, n-1);
		}
	}
	
	
	public static String mixString(String s1, String s2, int n){
		
		if( n== 0){
			return ""+s1.charAt(0) + s2.charAt(0);
		}
		return mixString(s1,s2, n-1) + "" +s1.charAt(n) + s2.charAt(n);
	}
}
