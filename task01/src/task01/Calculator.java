package task01;

public class Calculator {
	public int inc(int a) {
		return a+1;

		
	}

	public int dec(int a) {
		
		return a-1;
	}

	public int sum(int a, int b) {
		
		return a+b;
	}

	public String check(int a) {
		if (a>0) {
			return "positive";
		}
		else if (a<0) {
			return "negative";
		}
		else 
			return "Zero";
		}
}

