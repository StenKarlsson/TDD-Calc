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
				fail("Can't divide by zero");
				return (Double) null;
			}
			
		 
//		catch (NullPointerException expected) {
//			// If divide by zero
//			return (Double) null;
//		}
//		return result;
	}
}
