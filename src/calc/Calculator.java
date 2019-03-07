package calc;

import static org.junit.Assert.fail;

public class Calculator {

	public double add(double a, double b){
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

	public String calculateExpression(String equation) {

		
		double result = 0;
		if (equation.contains("+")) {
		
			String[] parts = equation.split("[+]");
			for (int i = 0; i < parts.length-1; i++) {
				result = add(result, Double.parseDouble(parts[i]));
				System.out.println(parts[i]);
			}
			System.out.println(result);
			System.out.println(equation);
		}

		if (equation.contains("-")) {
			
			String parts[] = equation.split("-");
			for (int i = 0; i < parts.length; i++) {
				System.out.println(parts[i]);
			}
		}
		
		return Double.toString(result);
	}
}
