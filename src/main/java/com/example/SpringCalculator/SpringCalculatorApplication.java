package com.example.SpringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpringCalculatorApplication {

	public static int add(String numbers) {
		String[] numberArray;
		List<Integer> negatives=new ArrayList<Integer>();
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
				if(Integer.parseInt(var)<0) {
					negatives.add(Integer.parseInt(var));
				}
				else if(Integer.parseInt(var)>=1000) {
					continue;
				}
				else {
					sum=sum+Integer.parseInt(var);
				}
			}
			if(negatives.size()>=1) {
				int len=negatives.toString().length();
				throw new RuntimeException("Negatives not allowed: "+ negatives.toString().substring(1,len-1));
			}
			return sum;
		}
	}

}
