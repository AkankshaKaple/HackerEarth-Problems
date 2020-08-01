package com.hackerearth;

public class SeattingArrangement {
public static void main(String[] args) {
		
		int number_of_inputs = Integer.parseInt(args[0]);
		
		System.out.println(number_of_inputs);
				
		for(int i = 1 ; i <= number_of_inputs ; i++) {
			
			int seat_no = Integer.parseInt(args[i]);  
			 
			String seat_type = null;
			int facing_seat = 0;
			
			if(seat_no % 12 == 1 || seat_no % 12 == 0) {
				seat_type = "WS";
				
				if(seat_no%12 == 0) {
					facing_seat = seat_no - 11;
				}
				else {
					facing_seat = seat_no + 11;
				}
			}
			else if(seat_no % 12 == 6 || seat_no % 12 == 7) {
				seat_type = "WS";
				
				if(seat_no%12 == 6) {
					facing_seat = seat_no + 1;
				}
				else {
					facing_seat = seat_no - 1;
				}
			}
			
			
			if(seat_no % 12 == 2 || seat_no % 12 == 11) {
				seat_type = "MS";
				
				if(seat_no%12 == 2) {
					facing_seat = seat_no - 9;
				}
				else {
					facing_seat = seat_no + 9;
				}
			}
			else if(seat_no % 12 == 5 || seat_no % 12 == 8) {
				seat_type = "MS";
				
				if(seat_no%12 == 5) {
					facing_seat = seat_no + 3;
				}
				else {
					facing_seat = seat_no - 3;
				}
			}		
			
			
			if(seat_no % 12 == 3 || seat_no % 12 == 10) {
				seat_type = "AS";
				
				if(seat_no%12 == 7) {
					facing_seat = seat_no - 7;
				}
				else {
					facing_seat = seat_no + 7;
				}
			}
			else if(seat_no % 12 == 4 || seat_no % 12 == 9) {
				seat_type = "AS";
				
				if(seat_no%12 == 4) {
					facing_seat = seat_no + 5;
				}
				else {
					facing_seat = seat_no - 5;
				}
			}
			
			System.out.println(facing_seat + " " + seat_type);
			
		}
}
}
