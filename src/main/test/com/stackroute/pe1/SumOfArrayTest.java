package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfArrayTest {
	
	SumOfArray sumOfArray;
	
	@Before
	public void setUp() {
		sumOfArray = new SumOfArray();
	}
	
	@After
	public void tearDown() {
		sumOfArray = null;
	}
	
	@Test
	public void givenInputShouldReturnSumOfArrayOfPositiveNumbers(){

		int array[] = {3,6,32};
//		Act
		int result = sumOfArray.addNumbers(array);

//		Assert
		assertEquals(41, result);
	}
	
	@Test
	public void givenInputShouldReturnSumOfArrayOfNegativeNumbers(){

		int array[] = {3,6,-32};

//		Act
		int result = sumOfArray.addNumbers(array);

//  	Assert
		assertEquals(-23, result);
	}
	
}