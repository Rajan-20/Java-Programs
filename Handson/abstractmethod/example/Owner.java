package com.ob.abstractmethod.example;

public class Owner {
	public static void main(String[] args) {
		Pet p = new Jack();
		p.sound();
		p.play();
		p.food();
	}
}
