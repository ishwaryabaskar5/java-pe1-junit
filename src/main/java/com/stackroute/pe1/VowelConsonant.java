package com.stackroute.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VowelConsonant {

//	method checks a char is vowel or consonent
	public String[] checkVowelOrConsonant(String str) {
		
		//		declaration
		char[] word;
		int len = str.length();
		String result[] = new String[len];
		
//		Convert a string to char array
		word = str.toCharArray();
		
		for (int i = 0; i < word.length; i++) {
//			find a char is vowel or consonent
			if (word[i] >= 97 && word[i] <= 122 || word[i] >= 65 && word[i] <= 90) {
				if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
					result[i] = "Vowel";
				} else {
					result[i] = "Consonant";
				}
			} else {
				result[i] = "Error: Not a letter";
			}
		}
		return result;
	}
}
