package org.study.methodReference;

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
	private int val;

	MyClass(int v) {
		val = v;
	}

	int getVal() {
		return val;
	}
}

public class UseMethodRef {
	static int compareMyclass(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}

	public static void main(String args[]) {
		ArrayList<MyClass> arryList = new ArrayList<MyClass>();
		arryList.add(new MyClass(10));
		arryList.add(new MyClass(40));
		arryList.add(new MyClass(200));
		arryList.add(new MyClass(9));
		arryList.add(new MyClass(31));

		// Find the maximum value in arryList using the compareMC() method.
		MyClass maxValObj = Collections.max(arryList, UseMethodRef::compareMyclass);
		System.out.println("Maximum value is: " + maxValObj.getVal());
	}
}
