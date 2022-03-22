package com.ob.training;

public class Methods {
	  void Addition() {
		int a =5,b = 4;
		int sum  =  a + b;
		System.out.println(sum);
	}
	    static int Subtraction(){
		  int c =7, d=3;
		  int res = c-d;
		  return res;
	  }
	      static void Multiply(){
	    	int e =4, f = 3;
	    	int product = e*f;
	    	System.out.println(product);
	    }
	       double Division(double g,double h){
	    	  double res = g/h;
	    	  return res;
	      }
	public static void main(String[] args) {
		
		Methods obj =  new Methods();
		obj.Addition();
		int value =Subtraction();
		System.out.println(value);
		Methods.Multiply();
		double got = obj.Division(10,2);
		System.out.println(got);
	}
	
}





class Subtraction{
	 void subtraction(){
		int c =5, d=3;
		int res = c-d;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Subtraction obj = new Subtraction();
		obj.subtraction();
	}
}

