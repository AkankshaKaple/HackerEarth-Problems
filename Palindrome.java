package com.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
				
		char[] char_array = s.toCharArray();
		char[] reverse_array = new char[s.length()];
		
		int count = 0;
		for(int i = s.length()-1 ; i >= 0 ; i--) {	
			reverse_array[count] = s.charAt(i);
			count ++;
		}
		
		if (Arrays.equals(char_array, reverse_array)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
