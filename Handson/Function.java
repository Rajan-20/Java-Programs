package com.ob.training;

public class Function {
	 static int mul(int x, int y){
		 int  prod = x *y;
		 return prod;
	}
	 public static void main(String[] args) {
		 int mul =Function.mul(3,5);
		 System.out.println(mul);
	 }
	 
	 //method overloading
	 //different number of arguments
	 static void add(int x, int y, int z) {
		 System.out.println(x+y+z);
	 }
	 //diff type of args
	 static void add (double x, double y) {
		 System.out.println(x*y);
	 }
	 static void add (double x, int y) {
		 System.out.println(x*y);
	 } 
	 //sequentce of args
	 static void add (int x, double y) {
		 System.out.println(x*y);
	 }
}
