package org.study.basics;

import java.util.function.Predicate;

@FunctionalInterface
interface NumericTest {
	boolean test(int n);
}

public class LambdaDemoForOneParameter {

	public static void main(String[] args) {
		NumericTest isEven = null;
		isEven = (n) -> (n % 2 == 0); // valid
		isEven = (int n) -> (n % 2 == 0); // valid
		isEven = n -> n % 2 == 0; // valid
//		isEven = (Integer n) -> (n % 2 == 0);  //Invalid
		
		System.out.println("Is 20 Even number: " + isEven.test(20));
		System.out.println("Is 21 Even number: " + isEven.test(21));

		System.out.println();
		
		NumericTest isNegative = (n) -> n < 0;
		System.out.println("Is 5 Negative number: " + isNegative.test(5));
		System.out.println("Is -5 Negative number: " + isNegative.test(-5));
		
		System.out.println();
		
		// boolean test(T t);
		
		// Predicate<T> functional interface provided by Java
		Predicate<Integer> isEven1 = null;
		isEven1 = (n) -> (n % 2 == 0); // valid
		isEven1 = n -> n % 2 == 0; // valid
		isEven1 = (Integer n) -> (n % 2 == 0);  // valid
//		isEven1 = (int n) -> (n % 2 == 0); // Invalid
//		isEven1 = (Object n) -> (n % 2 == 0);  // Invalid
		
		System.out.println("Is 20 Even number: " + isEven1.test(20));
		System.out.println("Is 21 Even number: " + isEven1.test(21));
	}
}
