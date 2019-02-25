package testCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calc.Calculator;

public class TestCalc {

	@Test
	public void add_test() {
		
		// Arrange
		Calculator calc = new Calculator();
		
		// Act
		double actual = calc.add(3, 6);
		
		
		// Assert
		assertEquals(9d, actual, 0.111);
	}
	
	@Test
	public void divide_test() {
		
		Calculator calc = new Calculator();
		
		double actual = calc.divide(0, 7);
		
		assertEquals(7, actual, 0.111);
	}
	
	
	
}
