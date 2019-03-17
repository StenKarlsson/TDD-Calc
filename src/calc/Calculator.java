package calc;


public class Calculator {

	private double sum(String equation) {
		
		
		
		if(equation.contains("+")) {
			return processAddition(equation);
		}
		if(equation.contains("-")) {
			return ProcessSubtraction(equation);
		}
		if(equation.contains("*")) {
			return processMultiplication(equation);
		}
		if(equation.contains("/")) {
			return processDivision(equation);
		}
		if(equation.matches("[0-9]+")) {
			return Double.parseDouble(equation);
		}
		if(equation.matches("[0-9].+")) {
			return Double.parseDouble(equation);
		}
		
		return Double.NaN;
		
	}

	private double processMultiplication(String equation) {
		String[] parts = equation.split("\\*");
		double result = Double.parseDouble(parts[0]);
		
		for (int i = 1; i < parts.length; i++) {
			result *= sum(parts[i]);
		}
		return result;
	}

	private double processDivision(String equation) {
		String[] parts = equation.split("/");
		double result = Double.parseDouble(parts[0]);
		
		if(Double.parseDouble(parts[0]) == 0 || Double.parseDouble(parts[1]) == 0) {
			throw new ArithmeticException("You can't divide by zero");
		}
		
		for (int i = 1; i < parts.length; i++) {
			result /= sum(parts[i]);
		}
		return result;
	}

	private double ProcessSubtraction(String equation) {
		String[] parts = equation.split("-");
		double result = Double.parseDouble(parts[0]);
		for (int i = 1; i < parts.length; i++) {
			result -= sum(parts[i]);
		}
		return result;
	}

	private double processAddition(String equation) {
		String[] parts = equation.split("\\+");
		double result = 0;
		for (String str : parts) {
			result += sum(str);
			
		}
		return result;
	}
	
	public String calculateExpression(String equation) {
		double resulttmp = sum(equation);
		
		String result = resulttmp + "";
		return result;
	}
	
}
	
