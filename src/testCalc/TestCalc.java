package testCalc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import calc.Calculator;

public class TestCalc {

	Calculator calc = new Calculator();

	
	
	// Simple, basic tests to get started
	
	@Ignore
	@Test
	public void testUsingStringAndAddition() {
		
		String expression = "5+7";
		String expected = "12.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	@Ignore
	@Test
	public void testUsingStringAndSubtraction() {
		
		String expression = "9-2";
		String expected = "7.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	@Ignore
	@Test
	public void testUsingStringAndDivision() {
		
		String expression = "8/2";
		String expected = "4.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	@Ignore
	@Test
	public void testUsingStringAndMultiplication() {
		
		String expression = "10*4";
		String expected = "40.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	
	
	
	// Tests with multiple operands
	@Ignore
	@Test
	public void testUsingStringAndMultipleAdditions() {
		
		String expression = "10+5+1";
		String expected = "16.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
		
	}
	
	@Ignore
	@Test
	public void testUsingStringAndMultipleSubtractions() {
		
		String expression = "30-4-7-4-5";
		String expected = "10.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);	
		}
	
	@Ignore
	@Test
	public void testUsingStringAndMultipleMultiplications() {
		
		String expression = "3*4*7";
		String expected = "84.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	@Ignore
	@Test
	public void testUsingStringAndMultipleDivisions() {
		
		String expression = "100/10/2";
		String expected = "5.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	// Tests using multiple unique operands
	
	@Ignore
	@Test
	public void MultipleUniqueOperandsTest() {
		
		String expression = "5*4+7-3*0+4-10";
		String expected = "21.0";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	@Ignore
	@Test
	public void MultipleUniqueOperandsTest2() {
		
		String expression = "7*4+6-3/2";
		String expected = "32.5";
		String result = calc.calculateExpression(expression);
		assertEquals(expected, result);
	}
	
	// Exceptions tests
	
	@Test
	public void DivisionByZeroTest() {
		
		String expression = "10/0";
		try {
			String result = calc.calculateExpression(expression);
			fail();
			
		} catch (ArithmeticException e) {
			assertEquals("You can't divide by zero", e.getMessage());
		}
	}
	
	@Test
	public void InseringLettersExpectingException() {
		
		String expression = "a+b";
		String result = calc.calculateExpression(expression);
		assertEquals(Double.NaN + "", result);
	}
	
}
