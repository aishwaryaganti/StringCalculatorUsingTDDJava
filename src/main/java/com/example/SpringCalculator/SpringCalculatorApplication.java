package com.example.SpringCalculator;

public class SpringCalculatorApplication {

	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
			String[] numberArray=numbers.split(",|\n");
			int sum=0;
			for(String var : numberArray) {
				//System.out.println(var);
				sum=sum+Integer.parseInt(var);
			}
			return sum;
		}
	}

}
