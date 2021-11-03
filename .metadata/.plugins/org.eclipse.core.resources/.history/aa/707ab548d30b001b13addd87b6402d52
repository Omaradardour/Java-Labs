package shapes;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle []circles =new Circle[100];
	double sum=0;
	double big_area=0;
	for(int i=0;i<circles.length;i++) {
double radius=10*Math.random();
circles[i]=new Circle(radius);
sum=sum+circles[i].getArea();
big_area=big_area+circles[i].getArea();
if(circles[i].getArea() > big_area) {
	big_area = circles[i].getArea();
}

	}
	double small_area = circles[0].getArea();
	for (int i = 0; i < 100; i++) {
		if(circles[i].getArea() < small_area) {
			small_area= circles[i].getArea();
		}
	}
	
System.out.println("The sum of the area = "+sum);
System.out.println("The biggest area is = "+ big_area);
System.out.println("The smallest area is = "+small_area);

	}

}
