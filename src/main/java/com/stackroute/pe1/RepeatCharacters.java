package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatCharacters {

//	Repeat last n number of characters of a word at n times
	public String repeatSubString(String str, int n){
	
		if(n <= 0){
			return "Error:Please enter a positive integer";
		} else {

//		declaration
			String result, substr;
			result = str;

//		create a substring
			int startIndex = str.length() - n;
			substr = str.substring(startIndex);

//		append the substring n times
			for (int i = 0; i < n; i++) {
				result += substr;
			}
			return result;
		}
		
	}
}
