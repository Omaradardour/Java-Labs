import java.util.*;

class Car {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Car> cars = new HashSet<Car>();
		Car a1 = new Car(30000, "Bmw");
		Car a2 = new Car(25000, "Audi");
		Car a3 = new Car(30000, "Bmw");
		cars.add(a1);
		cars.add(a2);
		cars.add(a3);
		HashSet <Car> newcars = new HashSet<Car>();
		Car a4 = new Car(35000, "Mercides");
		Car a5 = new Car(40000, "Porch");
		Car a6 = new Car(15000, "Dacia");
		cars.add(a4);
		cars.add(a5);
		cars.add(a6);
newcars.addAll(cars);

		for (Car a : newcars) {
			System.out.println(a.price + " " + a.name);
			
		}

	}

	int price;
	String name;

	public Car(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "price " + price + " name " + name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

}
