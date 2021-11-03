package task03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(One.square(3));

{


		int x = 2;
		int y = 3;
		int expected = 9;
				int actual = One.power(x, y);;
		System.out.println(actual);
		// Is the 'expected' equal to the 'actual'?
		assert expected == actual : "expected = " + expected + " but actual = " + actual;
	}
	{
		A actual = new A();
		actual.x = 3;
		int y = 3;
		int expected = 9;
		One.power(actual, y);
		
		// Is the 'expected' equal to the 'actual.x'?
		assert expected == actual.x : "expected = " + expected + " but actual = " + actual.x;
	}
	{
		
		int[] actual = { 1, 2, 3, 4, 5 };
		int y = 4;
		int[] expected = { 1, 4, 9, 16, 25 };

		// Is the 'expected' equal to the 'actual'?
		for(int i=0; i<actual.length; i++) {
		System.out.print(One.power(actual[i], y)  + " ");
		assert Arrays.equals(expected, actual) : "expected = " + Arrays.toString(expected) + " but actual = "
		+ Arrays.toString(actual);	

		
	}	
	}
	System.out.println("\nDone.");
	
	 
	}
}


