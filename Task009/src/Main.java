import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r = Math.random();
		List<Circle> al = new ArrayList<Circle>();

		while (al.size() <= 10) {
			if (r < 0.5) {
				al.add(new Circle(r));
				break;
			}
			al.add(new Circle(r));

			r = Math.random();
		}
		System.out.println(al);

		List<Circle> all = new ArrayList<Circle>();
		all.add(new Circle(3));
		all.add(new Circle(2));
		all.add(new Circle(1));
		System.out.println(all);

		MyComparator Cmp = new MyComparator();
		all.sort(Cmp);
		
		System.out.println(all);
	}

}
