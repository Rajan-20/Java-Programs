package com.ob.assignments;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = input.nextInt();
		System.out.println("Enter the value of b:");
		int b = input.nextInt();
		System.out.println("Enter the value of limit");
		int limit = input.nextInt();
		for(int i=0;i<limit;i++)
			{
			int s = 0;
			for(int j=0; j<=i;j++)
			{
			s = s+ (int)(Math.pow(2, j)*b);
	}
		System.out.println(a+s);
			}}}
