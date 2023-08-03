package day1.august2023practice;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a number");
		long num = sc.nextInt();
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digit in the entered are:: " +count);
	}
}
