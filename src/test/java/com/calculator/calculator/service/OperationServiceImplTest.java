package com.calculator.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.calculator.calculator.exception.OperationException;

import io.corp.calculator.TracerImpl;

@ExtendWith(SpringExtension.class)
public class OperationServiceImplTest {

	@InjectMocks
	OperationServiceImpl operationServiceImpl;

	@BeforeEach
	public void init() {
		operationServiceImpl = new OperationServiceImpl(new TracerImpl());
	}

	@Test
	void sumOK() {

		Double expect = 2D;
		Double result = operationServiceImpl.sum(1D, 1D);
		assertEquals(expect, result);

	}

	@Test
	void sumKo() {

		OperationException thrown = Assertions.assertThrows(OperationException.class, () -> {
			operationServiceImpl.sum(null, 1D);
		});
		Assertions.assertEquals("Error in sum operation", thrown.getMessage());

	}

	@Test
	void subtractOK() {

		Double expect = 0D;
		Double result = operationServiceImpl.subtract(1D, 1D);
		assertEquals(expect, result);

	}

	@Test
	void subtractKo() {

		OperationException thrown = Assertions.assertThrows(OperationException.class, () -> {
			operationServiceImpl.subtract(null, null);
		});
		Assertions.assertEquals("Error in subtract operation", thrown.getMessage());

	}

}
