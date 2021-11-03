package shapes;

public class Circle {
public double radius;
 double getArea() {
	double area=Math.PI*radius*radius;
	return area;
}
Circle(double radius){
	this.radius=radius;
}
}
