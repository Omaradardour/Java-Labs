
public class DemonstrateOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Adder.add(13,13 ));
System.out.println(Adder.add(13, 13,13));
	}

}
class Adder{
	//1) Method Overloading: changing no. of arguments
	public static int add(int a ,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
}