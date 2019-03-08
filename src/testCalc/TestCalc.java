package testCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import calc.Calculator;

public class TestCalc {

	
	@Test
	public void calculateExpression_test() {
		
		Calculator calc = new Calculator();
		
		String expression = "5+7+5-2";
		String expected = "15.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	
	@Ignore
	@Test
	public void addition_test() {
		
		// Arrange
		Calculator calc = new Calculator();
		
		// Act
		double actual = calc.addition(3, 6);
		
		
		// Assert
		assertEquals(9d, actual, 0.111);
	}
	
	@Ignore
	@Test
	public void subtratction_test() {
		
		Calculator calc = new Calculator();
		
		double actual = calc.subtraction(25, 10);
		
		assertEquals(15d, actual, 0.111);
		
	}
	
	
	@Ignore
	@Test
	public void divide_test() {
		
		Calculator calc = new Calculator();
		
		double actual = calc.divide(7, 7);
		
		assertEquals(1, actual, 0.111);
	}
	
	
	@Ignore
	@Test
	public void multiplication_test() {
		Calculator calc = new Calculator();
		
		double actual = calc.multiply(5, 10);
		
		assertEquals(50d, actual, 0.111);
	}
	
	
	
}
