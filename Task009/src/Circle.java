

public class Circle {
	
	
		// TODO Auto-generated constructor stub
	private double radius;
	public int area;

	public Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		return (Math.PI * radius * radius);
	}

	public void setArea(double area) {
		radius = Math.sqrt(area / Math.PI);
	}

	public String toString() {
		return "Circle: radius = " + getRadius ()+ " " +  " Area: " + " " + getArea();
	}
	
}
