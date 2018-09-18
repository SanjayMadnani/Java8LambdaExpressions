package org.study.blockLambdas;

interface NumericArrayFunction {
	double func(double[] n) throws EmptyArrayException;
}

class Xyz {
	
	void someMethod() throws EmptyArrayException {
		LambdaExceptionDemo myobj = new LambdaExceptionDemo();
		NumericArrayFunction d = myobj.average;
		double[] values = { 1.0, 2.0, 3.0, 4.0 };
		System.out.println(d.func(values));
	}
	
	
	
}

class EmptyArrayException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyArrayException() {
		super("Empty Array");
	}
}

public class LambdaExceptionDemo {
	
	public NumericArrayFunction average = (n) -> {
		double sum = 0;
		if (n.length == 0)
			throw new EmptyArrayException();
		for (int i = 0; i < n.length; i++)
			sum += n[i];
		return sum / n.length;
	};
	
	public static void main(String[] args) throws EmptyArrayException {

		double[] values = { 1.0, 2.0, 3.0, 4.0 };
		// This block lambda computes the average of an array of doubles.
		NumericArrayFunction average = (n) -> {
			double sum = 0;
			if (n.length == 0)
				throw new EmptyArrayException();
			for (int i = 0; i < n.length; i++)
				sum += n[i];
			return sum / n.length;
		};
		System.out.println("The average is " + average.func(values));
		// This causes an exception to be thrown.
		System.out.println("The average is " + average.func(new double[0]));
	}
}
