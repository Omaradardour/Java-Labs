package task03;

public class One {
public static int square (int x) {
	return x*x;
}
public static int power (int x,int y) {
	int p=1;
	for(int i=0;i<y;i++) {
		p=x*p;
		
	}
	return p;
}
public static void power (A a,int y) {
	int p=1;
	for(int i=0;i<y;i++) {
		p=a.x*p;
		
	}
	System.out.println(p);
}
public static void power(int[] array, int y) {
	// Raise each element of an array to the 'y'th power.
	int [] actual = { 1, 2, 3, 4, 5 };
	 y = 4;
	 for(int i=0; i<actual.length; i++) {
			System.out.print(One.power(actual[i], y)  + " ");
}
}
}


