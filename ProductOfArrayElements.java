package com.hackerearth;

import java.util.Scanner;

public class ProductOfArrayElements {
	
	public static void main(String[] args) {
		
		long  M = (long) (Math.pow(10, 9) + 7);
//		System.out.println(M);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] inputArray = new int[n];
		
		for(int i = 0; i<n ; i++) {
			inputArray[i]  = sc.nextInt();
		}
		
		
		
		long answer = 1;
		
		for (int i=0 ; i<n ; i++) {
			answer = (answer * inputArray[i]) % M;
//			System.out.println("answer == " + answer  + "   " +  );
		}
		
		System.out.println(answer);
	}

}
