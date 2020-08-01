package com.hackerearth;

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class Zoos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
				
		Pattern pattern = Pattern.compile("[^z]*z");
		Matcher matcher = pattern.matcher(text);
		int noOfZs = 0;
		while (matcher.find()) {
			noOfZs++;
		}
			
		int noOfOs = text.length() - noOfZs;
		
		if (noOfOs == noOfZs*2){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
