package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
	
	VowelConsonant vowelConsonant = new VowelConsonant();
	
	@Test
	public void isVowel(){

		String[] expected = {"Vowel","Vowel","Vowel"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("aei");
		System.out.println("Test1");

//		Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void isJerry(){

		String[] expected = {"Consonant","Consonant","Consonant"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("str");
		System.out.println("Test2");

//  	Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void bothVowelAndConsonant(){
		
		String[] expected = {"Consonant","Vowel","Consonant","Consonant","Vowel"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("hello");
		System.out.println("Test3");

//  	Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void NotLetter(){

		String[] expexcted = {"Error: Not a letter"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("4");
		System.out.println("Test4");

//  	Assert
		assertArrayEquals(expexcted, result);
	}
	
	
}