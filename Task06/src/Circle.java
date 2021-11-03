
public class Circle {
	
	
	private double radius;
		public double getRadius() {
				return radius;
			}
			public void setRadius(double radius) {
				this.radius = radius;
			}
			double getArea () {
				double area= (double) (Math.PI * radius * radius);
				return area;
			}
		
		Circle(double radius){
			this.radius=radius;
		}
		}


