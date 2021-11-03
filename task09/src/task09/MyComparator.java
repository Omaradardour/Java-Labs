package task09;

import java.util.Comparator;


	class MyComparator implements Comparator<Circle> {
		public int compare(Circle o1, Circle o2) {
			// TODO: Implement comparison algorithm here.
			return (int) (o1.area - o2.area);
		}
	}



