package com.ob.training;

public class Statements {
	// Decision making
	public static void main(String[] args) {
		int money = 11000;
		if (money > 10000 && money < 11000) {
			System.out.println("Lets go to Goa");
		} else if (money > 11000 && money < 12000) {
			System.out.println("Lets goto Delhi");
		} else if (money > 12000) {
			System.out.println("Let's go to Shimla");
		} else {
			System.out.println("Let's go to chickmangalur");
		}

		// Switch Statements
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("Let's go to Goa");
			break;
		case 2:
			System.out.println("Let's  got Delhi");
			break;
		case 3:
			System.out.println("Let's go to shimla");
			break;
		case 4:
			System.out.println("Let's go to chickmangalur");
			break;
		default:
			System.out.println("Goo home!!!");

		}//Number is even or not 
		
		//Exercise : 
		int y =10;
		if (y%2 == 0) {
			System.out.println("this is even");
		}else {
			System.out.println("this is odd");
		}
		
	
	}

}
