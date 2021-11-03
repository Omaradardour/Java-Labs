
public class DemosntrateOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Adder.add(12, 12));
System.out.println(Adder.add(12.3,12.89));
	}

}
class Adder{
	//Method Overloading: changing data type of arguments
public static int add(int a,int b) {
	return a+b;
}
public static double add(double a,double b) {
	return a+b;
}
}