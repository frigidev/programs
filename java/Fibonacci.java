/*
  The program below calculates the Fibonacci sequence of the term n passed by the user in the method call,
  in a recursive way, and prints all the values of the numbers traversed until the n value.
*/

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number to know his value (and the previous) in the Fibonacci sequence:\n");
		int n = scan.nextInt();
		int res = fibonacci(n);
		System.out.println("The value of the number typed in the Fibonacci sequence is: " + res);
		for(int i=1; i<=n; i++) {
			System.out.println("The value of the term " + i + " of the Fibonacci sequence is: " + fibonacci(i));
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2); 
		}
	}
}
