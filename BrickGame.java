package com.hackerearth;
import java.util.Scanner;

public class BrickGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String last_brick = null;
		int i = 0;
		while(N > 0){
			
			int p = i;
			N = N - p;
			if(N <= 0 ){
				last_brick = "Patlu";
				break;
			}
			
			int m = i*2;
			N = N - m;
			if(N <= 0) {
					last_brick = "Motu";
					break;
			}
			i++;
		}
		System.out.println(last_brick);
			
	}
}
