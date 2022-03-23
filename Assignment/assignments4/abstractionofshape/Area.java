package com.ob.assignments4.abstractionofshape;

public class Area extends Shape {
	@Override
	int RectangleArea(int length,int width) {
		return length*width;
	}
	@Override
	int SquareArea(int a) {
		return a*a;
	}
	@Override
	double CircleArea(int r) {
		return 3.17*r*r;
	}
	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("The area of the Rectangle "+a.RectangleArea(8,5));
		System.out.println("The area of the Square "+a.SquareArea(8));
		System.out.println("The area of the Circle "+a.CircleArea(42));
	}
}

