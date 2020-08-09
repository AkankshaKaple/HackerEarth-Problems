package com.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class SplitHouses {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfGrids = sc.nextInt();
		String village = sc.next();
		String[] fields =  village.toString().split("");

		for (int i = 0; i< fields.length; i++) {
			if (fields[i].equals("H") == false) {
				fields[i] = "B";
			}
			
		}

		String joinedString = String.join("", fields);
		 
		System.out.println(joinedString);

	}
	
	
}
