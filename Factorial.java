package com.hackerearth;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int result = 1;
		
		for (int i = 1; i<=num1 ; i++) {
			result = result * i;
		}
		
		System.out.println(result);
	}
}
