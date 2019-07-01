package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOrOddChecker {
	
	public String verifyEvenOrOdd(int num){
	
//		checks for num is between 20 and 30
		if(num>20 && num<30){
			if(num%2 == 0){
				return "Tom"; // Even
			} else {
				return "Jerry"; // Odd
			}
		} else {
			return "Neither Tom nor Jerry";
		}
	}
}
