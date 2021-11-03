
import java.util.*;

public class LastNameComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.Last_name.compareTo(o2.Last_name);
	}
}

class SortbyGrade implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return a.GradeBook_num - b.GradeBook_num;
		
	}
}
class SortbyGrp implements Comparator<Student>{

public int compare(Student g1, Student g2) {
	// TODO Auto-generated method stub
	return g1.GroupName.compareTo(g2.Last_name);
	
}
}
