package com.stackroute.pe1;

import java.util.Scanner;

public class Sorting {
	public <T> T sort(int number) throws ArrayIndexOutOfBoundsException {

//		declaration and initialization
		int temp, counter = 0, sortedNumber = 0;
		int[] array= new int[20];
		
		if (number <= 0) {
			return (T)"Please enter a positive integer";
		} else {
		
//		converts a number into array of numbers
			for (int i = 0; number != 0; number /= 10, i++) {
				array[i] = number % 10;
				counter =i;
			}

			for (int i=0;i<=counter;i++){
				System.out.println(array[i]);
			}
//		sort the array elements
			for (int j = 0; j < counter ; j++) {
				for (int k = j + 1; k < counter; k++) {
					if (array[j] < array[k]) {
						temp = array[j];
						array[j] = array[k];
						array[k] = temp;
					}
				}
			}
			for (int i=0;i<=counter;i++){
				System.out.println(array[i]);
			}
//		converts array into a number
			for (int i = 0; i < counter; i++) {
				if (array[i] == 0) {
					break;
				} else {
					sortedNumber = (sortedNumber * 10) + (array[i]);
				}
			}
			
			return (T)((Integer)sortedNumber);
		}
	}
}
