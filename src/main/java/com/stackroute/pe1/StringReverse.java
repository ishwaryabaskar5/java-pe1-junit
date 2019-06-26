package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {

//	reverse a string
	public String reverseString(String str){
	try {
//		declaration
		String rev = "";
		char[] word;

//		convert a string to character array
		word = str.toCharArray();

//		reverse a string
		for (int i = word.length - 1; i >= 0; i--) {
			rev += word[i];
		}
		
		return rev;
	} catch (NullPointerException e){
		return "Exception";
	}
	}
}
