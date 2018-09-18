package org.study.methodReference;

@FunctionalInterface
interface SomeFunc<T> {
	T func(T n);
}

class Utility {
	static String strReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	int factorial (int value) {
		int result = 1;
		for (int i = 1; i <= value; i++)
			result = i * result;
		return result;
	}
}

public class MethodRefDemo {
	
	static <T> T someOperation(SomeFunc<T> s, T value) {
		return s.func(value);
	}
	
	public static void main(String[] args) {
		String strInput = "Just a Demo";
		String strOutput = someOperation(Utility::strReverse, strInput);
		
		System.out.println("strInput: " + strInput + "\nstrOutput: " + strOutput + "\n");
		
		Utility utility = new Utility();
		int intInput = 5;
		int intOutput = someOperation(utility::factorial, intInput);
		
		System.out.println("intInput: " + intInput + "\nintOutput: " + intOutput + "\n");
	}

}
