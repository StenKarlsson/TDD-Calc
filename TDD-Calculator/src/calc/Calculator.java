package calc;

public class Calculator {

	public double add(double a, double b){
		return a + b;
	}
	
	public double divide(double a, double b) {
		
		if(a != 0 && b != 0) {
			return a / b;
		}
		else {
			return (Double) null;
		}
	}
}
