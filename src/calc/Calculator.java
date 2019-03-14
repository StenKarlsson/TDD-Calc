package calc;


public class Calculator {

	
	
	
	public double addition(double a, double b){
		return a + b;
	}
	
	public double divide(double a, double b) {
		
			if(a != 0 && b != 0) {
				return a / b;
			}
			
			else {
				throw new ArithmeticException("Can't divide by zero");
			}
			
		 
	}
	
	public double multiplication(double d1, double d2) {
		
		return d1*d2;
	}

	public double subtraction(double d1, double d2) {
		
		return d1 - d2;
	}

	
	public String calculate(String equation) {
		
		double result = 0;
		
		if(equation.contains("+")) {
			String[] parts = equation.split("\\+");
			
			for (String str : parts) {
				result = addition(result, Double.parseDouble(str));
			}
			//result = addition(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
			
			
		}
		if(equation.contains("-")) {
			String[] parts = equation.split("-");
			result = Double.parseDouble(parts[0]);
			
			for (int i = 1; i < parts.length; i++) {
				result = subtraction(result, Double.parseDouble(parts[i]));
			}
			
			//result = subtraction(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
			
		}
		
		if(equation.contains("/")) {
			
			String[] parts = equation.split("/");
			result = Double.parseDouble(parts[0]);
			
			for (int i = 1; i < parts.length; i++) {
				
				result = divide(result, Double.parseDouble(parts[i]));
				
			}
			
			//result = divide(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
		}
		
		if(equation.contains("*")) {

			String[] parts = equation.split("\\*");
			
			result = Double.parseDouble(parts[0]);
			
			for (int i = 1; i < parts.length; i++) {
			
				result = multiplication(result, Double.parseDouble(parts[i]));
			}
			
			//result = multiply(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
			
		}
		
		String resultStr = result + "";
		return resultStr;
	}
	
}
