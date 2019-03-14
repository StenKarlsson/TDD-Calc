package testCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import calc.Calculator;

public class TestCalc {

	Calculator calc = new Calculator();

	
	
	// Tests where I start using the calculate method with a String parameter
	
	@Test
	public void testUsingStringAndAddition() {
		
		String expression = "5+7";
		String expected = "12.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testUsingStringAndSubtraction() {
		
		String expression = "9-2";
		String expected = "7.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testUsingStringAndDivision() {
		
		String expression = "8/2";
		String expected = "4.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testUsingStringAndMultiplication() {
		
		String expression = "10*4";
		String expected = "40.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	
	
	
	// Tests with multiple operands
	@Test
	public void testUsingStringAndMultipleAdditions() {
		
		String expression = "10+5+1";
		String expected = "16.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testUsingStringAndMultipleSubtractions() {
		
		String expression = "30-4-7-4-5";
		String expected = "10.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);	
		}
	
	@Test
	public void testUsingStringAndMultipleMultiplications() {
		
		String expression = "3*4*7";
		String expected = "84.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	@Test
	public void testUsingStringAndMultipleDivisions() {
		
		String expression = "100/10/2";
		String expected = "5.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	// Tests using multiple unique operands
	
	@Test
	public void MultipleUniqueOperandsTest() {
		
		String expression = "10+5*6/2";
		String expected = "25.0";
		String result = calc.calculate(expression);
		assertEquals(expected, result);
	}
	
	
	
	
	
	// My first tests to make sure the methods are working as they're supposed to
	@Test
	public void addition_test() {
		
		// Arrange
		Calculator calc = new Calculator();
		
		// Act
		double actual = calc.addition(3, 6);
		
		
		// Assert
		assertEquals(9d, actual, 0.111);
	}
	
	
	@Test
	public void subtratction_test() {
		
		Calculator calc = new Calculator();
		
		double actual = calc.subtraction(25, 10);
		
		assertEquals(15d, actual, 0.111);
		
	}
	
	
	
	@Test
	public void divide_test() {
		
		Calculator calc = new Calculator();
		
		double actual = calc.divide(7, 7);
		
		assertEquals(1, actual, 0.111);
	}
	
	
	
	@Test
	public void multiplication_test() {
		Calculator calc = new Calculator();
		
		double actual = calc.multiplication(5, 10);
		
		assertEquals(50d, actual, 0.111);
	}
	
	
	
}
