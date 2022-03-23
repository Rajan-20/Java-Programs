package com.ob.abstractmethod;

public class Child extends Testing {
	public Child(int x) {
		super(x);
	}
	
	@Override
	void m1() {
		System.out.println("This is overriding");
	}
}
