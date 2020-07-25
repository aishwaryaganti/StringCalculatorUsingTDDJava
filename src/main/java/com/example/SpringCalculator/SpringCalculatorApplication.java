package com.example.SpringCalculator;

public class SpringCalculatorApplication {

	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		else if(numbers.contains(",")) {
			String[] numberArray=numbers.split(",");
			int sum=0;
			for(String var : numberArray) {
				sum=sum+Integer.parseInt(var);
			}
			return sum;
			//return (Integer.parseInt(numberArray[0])+Integer.parseInt(numberArray[1]));
		}
		else {
			return Integer.parseInt(numbers);
		}
	}

}
