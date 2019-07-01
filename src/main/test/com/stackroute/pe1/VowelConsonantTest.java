package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
	
	VowelConsonant vowelConsonant;
	
	@Before
	public void setUp() {
		vowelConsonant = new VowelConsonant();
	}
	
	@After
	public void tearDown() {
		vowelConsonant = null;
	}
	
	@Test
	public void givenInputShouldReturnVowel(){

		String[] expected = {"Vowel","Vowel","Vowel"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("aei");

//		Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void givenInputShouldReturnConsonant(){

		String[] expected = {"Consonant","Consonant","Consonant"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("str");

//  	Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void givenInputShouldReturnBothVowelAndConsonant(){
		
		String[] expected = {"Consonant","Vowel","Consonant","Consonant","Vowel"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("hello");

//  	Assert
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){

		String[] expected = {"Error: Not a letter"};
//		Act
		String[] result = vowelConsonant.checkVowelOrConsonant("4");

//  	Assert
		assertArrayEquals(expected, result);
	}
	
	
}