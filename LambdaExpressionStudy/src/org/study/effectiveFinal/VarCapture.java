package org.study.effectiveFinal;

import java.util.function.Function;

public class VarCapture {

	static int k = 10;

	int j = 20;

	public static void main(String[] args) {
		//R apply(T t);
		
		VarCapture obj = new VarCapture();
		// effective final local variable
		int num = 10;
		// num value should not be modified to keep it effective final, else we will not be able to use num in lambda
		// num++;
		Function<Integer, Integer> function = (n) -> {
			// this is ok as num value is not modified
			int v = num + 10;
			// num++; // invalid as num value can not be modified
			k++;
			obj.j++;
			return v;
		};

		System.out.println(function.apply(10));
		System.out.println(k);
		System.out.println(obj.j);

	}
}
