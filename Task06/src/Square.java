
public class Square extends Rectangle {
	private double width;
	
public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	private double height;
	
public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
double getArea () {
	return width*width;
}
public Square(double width) {
	super (width, width);
	this.width = width;	
}
void setArea (double a) {
	this.width = Math.sqrt(a);
}
}
