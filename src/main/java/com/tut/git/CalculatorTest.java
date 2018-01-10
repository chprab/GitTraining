package com.tut.git;

public class CalculatorTest {

	public static void main(String[] args) {
		ICalculator calculator = new CalculatorImpl();
		
		System.out.println(calculator.add(12, 15));
	}

}
