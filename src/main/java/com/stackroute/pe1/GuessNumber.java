package com.stackroute.pe1;

import java.util.Scanner;

public class GuessNumber {

	public  String guessNumber(int num){
	
//		declaration
		int target;
		
//		generate a random target value
		target = 30;

//		Get a number from user until both num and target are equal
		do{
		
//			check with target value
			if(num == target){
				return "HURRAY!!  YOU ARE CORRECT!!";
			} else if(num>target) {
				return "OOPS!! GUESS AGAIN..Number guessed is more than original number";
			} else {
				return "OOPS!! GUESS AGAIN..Number guessed is less than original number";
			}
		}while (num != target);
		
	}
	
}

