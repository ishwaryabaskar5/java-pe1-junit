package com.stackroute.pe1;

import java.util.Scanner;

public class SumOfArray {
	public int addNumbers(int[] array){
	
//		declaration
		int sum =0, i = 0;
		
		while (i < array.length){
//				sum the array elements
				sum += array[i];
				i++;
		}
		return sum;
	}
}
