
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			Rectangle r = 
				new Rectangle(10 * Math.random(), 20 * Math.random());
			System.out.println("Width:  " + r.getWidth());
			System.out.println("Height: " + r.getHeight());
			System.out.println("Area:   " + r.getArea());
			System.out.println("---");
	}

}
}