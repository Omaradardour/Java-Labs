
public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating square with side 10");
		Square s = new Square(10);
		System.out.println("Width:  " + s.getWidth());
		System.out.println("Area:   " + s.getArea());
		
		System.out.println("Setting width to 5");
		s.setWidth(5);

		System.out.println("Width:  " + s.getWidth());
		System.out.println("Area:   " + s.getArea());
		System.out.println("Setting height to 6");
		s.setHeight(6);
		System.out.println("Width:  " + s.getWidth());
		System.out.println("Area:   " + s.getArea());
		System.out.println("Setting area to 49");
		s.setArea(49);
		System.out.println("Width:  " + s.getWidth());
		System.out.println("Area:   " + s.getArea());
	}

}
