package task09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class MyComparator implements Comparator<Circle> {
	public int compare(Circle o1, Circle o2) {
        
		return Double.compare(o1.getArea(),o2.getArea());
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = Math.random();
		List<Circle> arrayList = new ArrayList<Circle>();
		while (r > 0.5) {
			arrayList.add(new Circle(r));
			r = Math.random();
		}		
		System.out.println(arrayList);
		MyComparator myComparator = new MyComparator();
		arrayList.sort(myComparator);
		System.out.println(arrayList);
		
		///////////////////   --- Linked list ---  /////////////////////////////
		LinkedList<Circle> ll = new LinkedList<Circle>(); 
		System.out.println("-- linked list -- ");
		r = Math.random();
		while(r > 0.5) {
			ll.add(new Circle(r));
			r = Math.random();
		}
		System.out.println(ll);		
		ll.sort(myComparator);
		System.out.println(ll);	
	}

}
