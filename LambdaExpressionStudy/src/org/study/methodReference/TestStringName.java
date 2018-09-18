package org.study.methodReference;

interface JustFun<T> {
	boolean func(T v1, T v2);
}

class SameName {
	private String name;

	public SameName(String name) {
		this.name = name;
	}

	boolean isNameSame(SameName object) {
		return this.name.equals(object.name);
	}
}

public class TestStringName {

	public static void main(String[] args) {
		JustFun<SameName> funcLambda = SameName::isNameSame;
		boolean isObjectEqual = funcLambda.func(new SameName("SanjayM"), new SameName("Sanjay"));
		System.out.println("SanjayM equal Sanjay: " + isObjectEqual);
	}

}
