package com.ob.training;

public class Store {
public static void main(String[] args) {
	Phone phone = new Phone(12000,4);
	System.out.println(phone.price);
	System.out.println(phone.ram);
	Phone phone2 = new Phone(11000,3);
	System.out.println(phone2.price); 
//	SmartPhone smartphone = new SmartPhone();
//	phone.mobile();
//	smartphone.selfie();
//	phone.call();
//	phone.radio();
//	phone.message("missing you");
	Smartphone1 obj = new Smartphone1(48.8,3);
	System.out.println(obj.camera);
}
}
