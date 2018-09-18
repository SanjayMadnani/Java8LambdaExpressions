package org.study.basics;

@FunctionalInterface
interface MyNumber {
	double getValue();
}

public class LambdaDemo {
	public static void main(String[] args) {

		MyNumber oldTraditionalWay = new MyNumber() {
			@Override
			public double getValue() {
				// TODO Auto-generated method stub
				return 123.45;
			}
		};
		System.out.println("oldTraditionalWay: " + oldTraditionalWay.getValue());

		
		MyNumber lambdasWay = () -> 123.46;
		System.out.println("lambdasWay: " + lambdasWay.getValue());
		
		lambdasWay = () -> Math.random() * 100;
		System.out.println("Random value by lambda: " + lambdasWay.getValue());
		System.out.println("Random value by lambda: " + lambdasWay.getValue());
		
		//This is not compatible with functional interface, hence it will give compilation error
		//lambdasWay = () -> "XYZ";
		
	}

}
