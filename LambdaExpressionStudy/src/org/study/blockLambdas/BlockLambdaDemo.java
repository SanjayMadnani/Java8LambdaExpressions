package org.study.blockLambdas;

interface SomeFunc<T> {
	T func(T n);
}

public class BlockLambdaDemo {
	public static void main(String args[]) {
		// This block lambda computes the factorial of an int value.
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println("The factoral of 3 is " + factorial.func(3));
		System.out.println("The factoral of 5 is " + factorial.func(5));
		
		
		// This block lambda reverses the characters in a string.
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			int i;
			for (i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		System.out.println("Expression reversed is " + reverse.func("Expression"));
		
		
		// lambda expressions as an argument to a method.
		System.out.println("Session reversed is " + someOperation(reverse, "Session"));
		System.out.println("Square of 10 is " + someOperation((n) -> n*n, 10));
		
	}
	
	 static <T> T someOperation(SomeFunc<T> s, T value) {
		return s.func(value);
	}
	
}
