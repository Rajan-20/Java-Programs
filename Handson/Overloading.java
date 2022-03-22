package com.ob.training;

public class Overloading {
	//Different No. of arguments  
	static int Addition(int a,int b){
		int result = a+b;
		return result;
	}
	int Addition(int a,int b, int c){
		  int result = a+b+c;
		  return result;
	  }
	//Different type of arguments
	 static int Multiply(int x,int y){
		 int product = x * y;
		 return product;
	}
	   static double Multiply(double x, double y){
		 double product = x*y;
		 return product;
	 }
	//Sequence of arguments
	    static double Multiply(int a,int b,double c){
		   double product = a*b*c;
		   return product;
	   }
	     static double Mutliply(double a,int b,int c){
		   double product = a*b*c;
		   return product;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Overloading.Addition(2,3));
		Overloading obj = new Overloading();
		System.out.println(obj.Addition(4, 4, 4));
		int result = Overloading.Multiply(7,5);
		System.out.println(result);
		System.out.println(Multiply(7.4, 6.4));
		double got =Multiply(5,4,1.5);
		System.out.println(got);
		double output  = Overloading.Mutliply(3.2,3,3);
		System.out.println(output);

	}

}
