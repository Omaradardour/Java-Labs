import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stu = new ArrayList<Student>();
		Student a1 = new Student("Omar", "Adardour", 1231, "1stGr");
		Student a2 = new Student("Ayoub", "Elhaddadi", 2345, "2thGr");
		Student a3 = new Student("Youssef", "Elbermaki", 3451, "1stGr");
		Student a4 = new Student("Ayoub", "Elhaddadi", 2345, "1stGr");
		Student a5 = new Student("Omar", "Ait mouh", 9999, "2thGr");
		Student a6 = new Student("Saad", "Ait Jamil", 8888, "3thGr");
		// LinkedList<Student> stud = new LinkedList<Student>();
//		Student s1 = new Student("Maik", "Ross", 4567 ,"");
//		Student s2 = new Student("Harvi", "Specter", 1671);
//		Student s3 = new Student("Luis", "Lit", 1781);
//		Student s4 = new Student("Raichel", "Zain", 7890);
//		Student s5 = new Student("Dona", "Polson", 8901);
//		Student s6 = new Student("Harvi", "Specter", 1671);
		HashSet<Student> studd = new HashSet<Student>();
		stu.add(a1);
		stu.add(a2);
		stu.add(a3);
		stu.add(a4);
		stu.add(a5);
		stu.add(a6);
		// stud.add(s1);
//		stud.add(s2);
//		stud.add(s3);
//		stud.add(s4);
//		stud.add(s5);
//		stud.add(s6);
		studd.addAll(stu);
//		studd.addAll(stud);

//for(Student st :studd){
//	System.out.println(st);
//	int i=0;
//	Student arr[] = new Student[studd.size()];
//	 for(Student stt:studd){ 
//         arr[i++] = stt; 
//       } 
//	 	
//       for (Student n : arr) 
//           System.out.println(n); 
//   } 
		Student arr[] = studd.toArray(new Student[0]);
		System.out.println(Arrays.toString(arr));
		LastNameComparator lnc = new LastNameComparator();
		Arrays.sort(arr, lnc);
		System.out.println(Arrays.toString(arr));
		SortbyGrade Sg = new SortbyGrade();
		Arrays.sort(arr, Sg);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Sg.reversed());
		System.out.println(Arrays.toString(arr));
		ArrayList<Student> ArrayToColl = new ArrayList<Student>(Arrays.asList(arr));
		System.out.println(ArrayToColl);

		Iterator<Student> rem = ArrayToColl.iterator();
		while (rem.hasNext()) {
			Student i = rem.next();
			int c = number_of_digits(i.GradeBook_num);
			int d = 1;
			for (int j = 1; j < c; j++) {
				d *= 10;
			}
			if ((i.GradeBook_num % 10 == 1) && (i.GradeBook_num / d == 1)) {
				rem.remove();
				System.out.println(ArrayToColl);
			}
		}
		Iterator<Student> remL = ArrayToColl.iterator();
		while (remL.hasNext()) {
			Student l = remL.next();
			if ((l.GradeBook_num % 10 == 1)) {
				remL.remove();
				System.out.println(ArrayToColl);
			}
		}
		System.out.println("---");
		System.out.println(stu);
		// HashMap<String, ArrayList<Student>> map = new HashMap<String,
		// ArrayList<Student>>();
		TreeMap<String, ArrayList<Student>> map = new TreeMap<>(Collections.reverseOrder());
		for (Student m : stu) {
			if (!map.containsKey(m.GroupName)) {
				map.put(m.GroupName, new ArrayList<Student>());
			}

			map.get(m.GroupName).add(m);
		}
		for (String key : map.keySet()) {
			System.out.println(key);
			System.out.println("\t" + map.get(key));
		}
		// TreeMap<String, ArrayList<Student>> sort = new
		// TreeMap<>(Collections.reverseOrder());
		// ort.putAll(map);
		System.out.println("----");

		System.out.println(map);
		System.out.println("----");
		StudentContainer<Integer> list = new StudentContainer();
		
		
		
		
	

	}

	static int number_of_digits(int n) {
		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

}
