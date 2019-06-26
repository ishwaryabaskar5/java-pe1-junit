package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterIdentification {

//	Identify a character whether it is capital case, lower case, number or symbol
	public String identifyCharacter(char character){
	
//		Check a character with ASCII value
		if(character>=97 && character <= 122){
			return "Small case letter";
		} else if(character>=65 && character <= 90){
			return "Capital letter";
		} else if(character>=48 && character <= 57){
			return  "Digit";
		} else{
			return "Symbol";
		}
		
	}
}
