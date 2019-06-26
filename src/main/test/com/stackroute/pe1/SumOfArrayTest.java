package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfArrayTest {
	
	SumOfArray sumOfArray = new SumOfArray();
	
	@org.junit.Before
	public void setUp() throws Exception {
	}
	
	@org.junit.After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addPositiveIntegers(){

		int array[] = {3,6,32};
//		Act
		int result = sumOfArray.addNumbers(array);
		System.out.println("Test1");

//		Assert
		assertEquals(41, result);
	}
	
	@Test
	public void addNegativeValuesInArray(){

		int array[] = {3,6,-32};

//		Act
		int result = sumOfArray.addNumbers(array);
		System.out.println("Test2");

//  	Assert
		assertEquals(-23, result);
	}
	
}