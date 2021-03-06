package task02;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = { 1.1, 2.2, 3.3 };
		System.out.println("Sum of {1.1,2.2,3.3} = " + calcSum1(numbers));
		System.out.println("Average of {1.1,2.2,3.3} = " + calcAverage(numbers));
		double[] moreNumbers = { 1.1, 2.2, 3.3, -1, -2, 4,0};
		System.out.println("Number positive = " + numPositive(moreNumbers));
		System.out.println("Number from 1.1 to 3.2 = " + numInRange(moreNumbers, 1.0,3.2));
	}

	public static double calcSum1(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum = sum + num; // Or sum += num
		}
		return sum;
	}

	public static double calcSum2(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

	public static double calcSum3(double[] numbers) {
		double sum = 0;
		int i = 0;
		while (i < numbers.length) {
			sum = sum + numbers[i];
			i++; // Or i = i + 1, or i += 1
		}
		return sum;
	}

	// Unlike the other three versions, this one fails for a 0-length array.
	public static double calcSum4(double[] numbers) {
		double sum = 0;
		int i = 0;
		do {
			sum = sum + numbers[i];
			i++;
		} while (i < numbers.length);
		return sum;
	}

	public static double calcAverage(double[] numbers) {
		// TODO: Return the average value of 'numbers'.
		double avr=calcSum1(numbers)/numbers.length;
		return avr;
	}

	public static int numPositive(double[] numbers) {
		// TODO: Return the count of how many of the array entries are greater than or
		// equal to zero.
		int PositiveCount=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=0) {
				PositiveCount++;
			}
		}
		return PositiveCount;
	}

	public static int numInRange(double[] nums, double lowerBound, double upperBound) {
		// TODO: Return the count of how many of the array entries are between the two
		// bounds, inclusive.
		int Range=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>lowerBound && nums[i]<upperBound) {
				Range++;
			}
		}
		return Range;
	}

}
