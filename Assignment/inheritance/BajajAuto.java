package com.ob.assignments;

public class BajajAuto extends Bikes {
	String color;

	public BajajAuto(String brand) {
		// TODO Auto-generated constructor stub

		super(brand);
		System.out.println("The brand of the bike is " + brand);
	}
	

	public BajajAuto(String string, int i) {
		// TODO Auto-generated constructor stub
		super(string,i);
		System.out.println("========sub class========");
	}
	public BajajAuto(String string, int i, String col) {
		// TODO Auto-generated constructor stub
		super(string,i);
		this.color = col;
		System.out.println("========sub class========");
	}


	public void EngineCapacity(int s) {
		int storage = s;
		System.out.println("The Engine capacity of the BajaAuto is " + storage);
	}
}
