package com.calculator.calculator.service;

public interface OperationService {

	/**
	 * Service to sum two numbers
	 * 
	 * @param number1 first number
	 * @param number2 second number
	 * @return return the value of the operation
	 */
	public Double sum(Double number1, Double number2);

	/**
	 * Service to subtract two numbers
	 * 
	 * @param number1 first number
	 * @param number2 second number
	 * @return return the value of the operation
	 */
	public Double subtract(Double number1, Double number2);

}
