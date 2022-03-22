package com.ob.training;

public class Phone {
	int price;
	int ram;
	String brand;

	//Create a constructor
	public Phone(int p,int r) {
		price = p;
		ram = r;
		//System.out.println("From that smart phone that is subclass");
	}
	// no arg
	public void mobile() {
		System.out.println("dinesh's gf has bought a phone");
	}

	public void call() {
		System.out.println("Calling dinesh");
	}

	public void radio() {
		System.out.println("Plyaing a song");
	}

	public void message(String msg) {
		System.out.println(msg);
	}
}
