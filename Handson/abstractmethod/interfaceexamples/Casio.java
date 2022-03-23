package com.ob.abstractmethod.interfaceexamples;

public class Casio implements Calculator {
	@Override
	public int add(int x,int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int multiply(int x,int y) {
		return x*y;
	}
	public int division(int x,int y) {
		return x/y;
	}
}

