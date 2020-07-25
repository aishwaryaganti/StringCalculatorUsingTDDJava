package com.example.SpringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpringCalculatorApplication {

	public static int add(String numbers) {
		String[] numberArray;
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
			if(numbers.startsWith("//")) {
				Matcher m=Pattern.compile("//(.)\n(.*)").matcher(numbers);
				m.matches();
				String customDelimiter=m.group(1);
				numberArray=m.group(2).split(Pattern.quote(customDelimiter));
			}
			else {
				numberArray=numbers.split(",|\n");
			}
			
			int sum=0;
			for(String var : numberArray) {
				sum=sum+Integer.parseInt(var);
			}
			return sum;
		}
	}

}
