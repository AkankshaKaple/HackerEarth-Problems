package com.hackerearth;

import java.util.Scanner;

public class ToggleString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] ch = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				ch[i] = Character.toLowerCase(s.charAt(i));
				
			}else {
				ch[i] = Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(String.valueOf(ch));
	}

}
