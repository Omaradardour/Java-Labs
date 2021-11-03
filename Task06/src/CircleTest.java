
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Circle c = new Circle(10 * Math.random());
			System.out.println("Circle " + i);
			System.out.println("Radius: " + c.getRadius());
			System.out.println("Area: "+c.getArea());
			System.out.println("---");
	}

	}
}


