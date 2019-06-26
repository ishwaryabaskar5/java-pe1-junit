package com.stackroute.pe1;

public class NumberSeries {

//	  Generates number series like this. 1,2,2,3,3,3,4,4,4,4...n
	  public String generateSeries(int num) {
		
		  String series = new String();
		  if (num <= 0) {
			  return "Please enter a positive integer";
		  } else {
//		generate and print series
			  for (int i = 1; i <= num; i++) {
				  for (int j = 1; j <= i; j++) {
					  series += i;
				  }
			  }
			  return series;
		  }
	  }
}
