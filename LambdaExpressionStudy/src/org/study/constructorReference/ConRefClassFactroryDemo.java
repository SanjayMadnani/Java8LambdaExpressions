package org.study.constructorReference;

import java.util.function.Function;

// A simple generic class.
class MyClass1<T> {
	private T val;

	// A constructor that takes an argument.
	MyClass1(T val) {
		this.val = val;
	}

	// The default constructor. This constructor is NOT used by this program.
	MyClass1() {
		val = null;
	}

	// ...
	T getVal() {
		return val;
	};
}

// A simple, non-generic class.
class MyClass2 {
	String str;

	// A constructor that takes an argument.
	MyClass2(String s) {
		str = s;
	}

	// The default constructor. This
	// constructor is NOT used by this program.
	MyClass2() {
		str = "";
	}

	// ...
	String getVal() {
		return str;
	};
}

public class ConRefClassFactroryDemo {
	// A factory method for class objects. The class must have a constructor that takes one parameter of type T. R
	// specifies the type of object being created.
	static <T, R> R myClassFactory(Function<T, R> cons, T v) {
		return cons.apply(v);
	}

	public static void main(String args[]) {
		// Create a reference to a MyClass1 constructor. In this case, new refers to the constructor that takes an
		// argument.
		Function<Double, MyClass1<Double>> myClassCons = MyClass1<Double>::new;
		// Create an instance of MyClass by use of the factory method.
		MyClass1<Double> mc = myClassFactory(myClassCons, 100.1);
		// Use the instance of MyClass just created.
		System.out.println("val in mc is " + mc.getVal());
		// Now, create a different class by use of myClassFactory().
		Function<String, MyClass2> myClassCons2 = MyClass2::new;
		// Create an instance of MyClass2 by use of the factory method.
		MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
		// Use the instance of MyClass just created.
		System.out.println("str in mc2 is " + mc2.getVal());
	}
}
