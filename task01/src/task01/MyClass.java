package task01;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();

		int intResult;
		intResult = calculator.inc(1);
		System.out.println(intResult);

		intResult = calculator.dec(1);
		System.out.println(intResult);

		intResult = calculator.sum(2, 3);
		System.out.println(intResult);

		String strResult;
		strResult = calculator.check(1);
		System.out.println(strResult);

		strResult = calculator.check(-1);
		System.out.println(strResult);

		strResult = calculator.check(0);
		
	}

}
