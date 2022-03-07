package com.calculator.calculator.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.calculator.calculator.service.OperationService;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration()
@WebMvcTest(controllers = CalculatorController.class)
public class CalculatorControllerTest {

	@Autowired
	private WebApplicationContext wac;

	@MockBean
	private OperationService operationService;

	private MockMvc mockMvc;

	@BeforeEach
	void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	void getSum() throws Exception {
		when(operationService.sum(1D, 1D)).thenReturn(2D);
		this.mockMvc.perform(get("/operation/sum?number1=1&number2=1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().json("{\"result\": 2.0}"));
	}

	@Test
	void getSubtract() throws Exception {
		when(operationService.subtract(1D, 1D)).thenReturn(0D);
		this.mockMvc.perform(get("/operation/subtract?number1=1&number2=1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().json("{\"result\": 0.0}"));
	}
	
	@Test
    public void exceptionAdvice() throws Exception {
        this.mockMvc.perform(get("/operation/sum?number1=hola&number2=1")).andDo(print()).andExpect(status().isBadRequest())
                .andExpect(content().string("Arguments are incorrects."));
    }
}
