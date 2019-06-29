package main;

public class Math {
	
	public static long factorial(long n) {
		if(n > 0) {
			return n * (Math.factorial(n - 1));
		}
		else if(n == 0) {
			return 1;
		}
		else {
			return 1;
		}
	}
}
