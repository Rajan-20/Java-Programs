package com.ob.training;

public class Loops {
	//Finding the odd number between 1 to 100
	//For loop
	public static void main(String[] args) {
		for(int x =1;x<=100;x++) {
			if (x % 2!=0) {
				System.out.println(x);
			}
		}
	//While loops
		int b=1;
		while(b<=100) {
			
			if (b % 2 != 0) {
				System.out.println(b);	
		}
		b++;
	}
}
}
