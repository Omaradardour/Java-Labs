import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentContainer list = new StudentContainer();
		Student a1 = new Student(1111);
		Student a2 = new Student(2222);
		Student a3 = new Student(3333);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list);
		System.out.println("---");
		System.out.println(list.size());
		System.out.println("----");
//list.clear();
//System.out.println(list);
//System.out.println("---");
		System.out.println(list.get(0));
		System.out.println("---");
		Student a4 = new Student(4444);
		System.out.println(list.set(1, a4));
		System.out.println("---");
		System.out.println(list);
		System.out.println("---");
		System.out.println(list.remove(0));
		System.out.println("---");
		System.out.println(list);
		System.out.println("---");
		System.out.println("***");

		System.out.println(Arrays.toString(list.toArray()));
		System.out.println("---");
		System.out.println("***");
		StudentContainer container = new StudentContainer();
		Student a6 = new Student(5555);
		Student a7 = new Student(6666);
		Student a8 = new Student(7777);

		container.add(new Student(8888));
		container.add(new Student(9999));
		container.add(new Student(1101));
		container.add(new Student(1201));
		container.add(new Student(1301));
		container.add(new Student(1401));
		container.add(new Student(1501));
		container.add(new Student(1601));
		container.add(new Student(1701));
		container.add(new Student(1801));

		System.out.println("----");
		System.out.println(container);
		Iterator<Student> iterator = container.iterator();

		for (Student student : container) {
			System.out.println(student);
		}
//		System.out.println(iterator.hasNext());
//
//		while (iterator.hasNext()) {
//
//			iterator.next();
//			iterator.remove();
//
//		}
		System.out.println("Size:" + container.size());
		System.out.println(container);
		iterator = container.iterator();
		while (iterator.hasNext()) {

			Student student = iterator.next();
			int grade = student.GradeBook_num;
			int SumOdd = 0, tmp = 0;
			while (grade > 0) {
				tmp = grade % 10;
				SumOdd += tmp;
				grade = grade / 10;
			}
			System.out.println(SumOdd);
			if (SumOdd % 2 != 0) {
//				container.set(container.size()-1, student);
//				container.set(i, container.get(container.size()-1));
//				iterator.remove();
				iterator.remove();

			}

		}
		System.out.println(container);

//		System.out.println("iterator with removing the last element:");
//		iterator.remove();
//		for (Student student : container) {
//			System.out.println(student);
//
//		}
	}

}
