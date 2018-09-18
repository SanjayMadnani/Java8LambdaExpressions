package org.study.basics;

import java.util.function.Function;

interface FactorTest {
	boolean test(int i, int j);
}

public class TwoParameters {
	public static void main(String[] args) {
		FactorTest isFactor = null;
		isFactor = (n, d) -> (n % d) == 0;
		
		System.out.println("Is 5 factor of 80: " + isFactor.test(80, 5));
		System.out.println("Is 5 factor of 81: " + isFactor.test(81, 5));
		
		
		isFactor = (n, d) -> (n % d == 0); // valid
		isFactor = (int n, int d) -> (n % d == 0); // valid
//		isFactor = (int n, d) -> (n % d == 0); // Invalid
//		isFactor = (n, int d) -> (n % d == 0); // Invalid
//		isFactor = n, d -> n % d == 0; // Invalid
//		isFactor = (Integer n, Integer d) -> (n % d == 0);  // Invalid
		
		Function<Integer, Integer> isFactor1 = null;
		
	}
}
