package com.calculator.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.calculator.dto.OperationDto;
import com.calculator.calculator.service.OperationService;

@RestController
@RequestMapping("/operation")
public class CalculatorController {

	/**
	 * Construct
	 * 
	 * @param operationService operation interface
	 */
	CalculatorController(OperationService operationService) {
	}

	/**
	 * Do the sum
	 * 
	 * @param number1 first number
	 * @param number2 second number
	 * @return return the sum of number1 and number2
	 */
	@GetMapping("/sum")
	public ResponseEntity<OperationDto> sum(@RequestParam Double number1, @RequestParam Double number2) {

		OperationDto result = null; // Create service
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	/**
	 * Do the subtract
	 * 
	 * @param number1 first number
	 * @param number2 second number
	 * @return return the subtract of number1 and number2
	 */
	@GetMapping("/subtract")
	public ResponseEntity<OperationDto> subtract(@RequestParam Double number1, @RequestParam Double number2) {
		OperationDto result = null; // Create service
		return new ResponseEntity<>(result, HttpStatus.OK);

	}
}
