package com.hackerearth;

import java.util.Scanner;

public class LiftQueries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
//		int TotalFloors = 7;
		int liftA = 0;
		int liftB = 7;
		int[] testCases = new int[noOfTestCases];
		
		for (int i = 0; i < noOfTestCases ; i++) {
			testCases[i] = sc.nextInt();
		}
		
		for (int i = 0; i < testCases.length ; i++) {
			int floorNo = testCases[i];
			
			if ((floorNo - liftA) > (liftB - floorNo)) {
				System.out.println("B");
				liftB = floorNo; 
			}
			else if ((floorNo - liftA) < (liftB - floorNo)) {
				System.out.println("A");
				liftA = floorNo;
			}
			else if ((floorNo - liftA) == (liftB - floorNo)) {
				System.out.println("A");
				liftA = floorNo;
			}
		}
		
	}	
	
}
