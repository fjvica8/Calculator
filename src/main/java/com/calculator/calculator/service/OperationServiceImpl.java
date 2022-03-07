package com.calculator.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.calculator.exception.OperationException;

import io.corp.calculator.TracerImpl;

@Service
public class OperationServiceImpl implements OperationService {

	private TracerImpl tracerImpl;

	/**
	 * Construct
	 * 
	 * @param tracerImpl implement log
	 */
	public OperationServiceImpl(TracerImpl tracerImpl) {
		this.tracerImpl = tracerImpl;
	}

	@Override
	public Double sum(Double number1, Double number2) {
		try {
			tracerImpl.trace(
					(new StringBuilder()).append("Sum ").append(number1).append(" and ").append(number2).toString());

			return number1 + number2;
		} catch (Exception e) {
			throw new OperationException("Error in sum operation");
		}

	}

	@Override
	public Double subtract(Double number1, Double number2) {
		try {
			tracerImpl.trace((new StringBuilder()).append("Subtract ").append(number1).append(" and ").append(number2)
					.toString());

			return number1 - number2;

		} catch (Exception e) {
			throw new OperationException("Error in subtract operation");
		}
	}

}
