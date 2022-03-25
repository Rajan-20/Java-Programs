package com.ob.assignments5.array;
import java.util.Scanner;

public class Arraysort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b[];
		System.out.println("Enter the arraysize");
		int size =scan.nextInt();
		b = new int[size];
		int num;
		for (int i=0;i<b.length;i++) {
			System.out.println("Enter the number");
			num = scan.nextInt();
			b[i]=num;
		}
//		for (int i =0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		for (int i = 0;i<b.length;i++) {
			for (int j = 0;j<b.length;j++) {
				int temp = 0;
				if(b[i]>b[j]) {
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
//			System.out.println(b[i]);
		}
		for (int i =0;i<b.length;i++) {
			num = b[i];
			System.out.print(num + " ");
		}
	}
}
