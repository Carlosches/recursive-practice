
public class RecursiveFuctions {
	
	
	//11
	
	
	
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
}
