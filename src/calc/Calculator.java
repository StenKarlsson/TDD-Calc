package calc;

import static org.junit.Assert.fail;

public class Calculator {

	public double addition(double a, double b){
		return a + b;
	}
	
	public double divide(double a, double b) {
		double result = 0;
		
			if(a != 0 && b != 0) {
				return a / b;
			}
			
			else {
				throw new ArithmeticException("Can't divide by zero");
			}
			
		 
	}
	
	public double multiply(double d1, double d2) {
		
		return d1*d2;
	}

	public double subtraction(double d1, double d2) {
		
		return d1 - d2;
	}

	private String calculate(char operand, double d1, double d2) {
		double result = 0;
		String resultStr = "";
		switch (operand) {
		case '+': result = addition(d1, d2);
			
			break;

		case '-': result = subtraction(d1, d2);
		}
		
		resultStr = result + "";
		return resultStr;
	}
	public String calculateExpression(String equation) {

		double result = 0;
		char[] eq = equation.toCharArray();
		String[] parts = {"", ""};
		char operand = 0;
		char[] operands = {'+', '-'};
		int counter = 0;
		boolean timeToCalc = false;
		
		for (int i = 0; i < eq.length; i++) {
			
			if(counter >= 2) {
				parts[0] = calculate(operand, Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
				counter = 1;
				parts[counter] = "";
			}
			
			if (eq[i] == operands[0] || eq[i] == operands[1]) {
			
				operand = eq[i];
				counter++;
				
			}
			else {
				parts[counter] = parts[counter] + eq[i];
			}
		}
		
		
		
		System.out.println(result);
		return Double.toString(result);
	}
}
