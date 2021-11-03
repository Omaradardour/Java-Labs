import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin...");

		ConstructorEx a = new ConstructorEx(3);
		System.out.println(Arrays.toString(a.array));
		System.out.println("---");

		int[] array = new int[5];

		ConstructorEx b = new ConstructorEx(array);
		Arrays.fill(array, 1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b.array));
		System.out.println("---");

		Arrays.fill(array, 2);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b.array));
		System.out.println("---");

		ConstructorEx c = new ConstructorEx(array, true);
		Arrays.fill(array, 3);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(c.array));
		System.out.println("---");

		ConstructorEx d = new ConstructorEx(array, false);
		Arrays.fill(array, 4);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(d.array));

		System.out.println("Done.");
	}

}
