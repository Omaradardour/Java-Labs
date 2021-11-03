
public class Student {

	public Student(String first_name, String last_name, int GradeBook_num, String GroupName) {
		super();
		this.First_name = first_name;
		this.Last_name = last_name;
		this.GradeBook_num = GradeBook_num;
		this.GroupName = GroupName;

	}

	String First_name;
	String Last_name;
	int GradeBook_num;
	String GroupName;

	@Override
	public String toString() {
		return "GroupName=" + GroupName + " First_name=" + First_name + ", Last_name=" + Last_name + ", Gradebook_num="
				+ GradeBook_num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((First_name == null) ? 0 : First_name.hashCode());
		result = prime * result + GradeBook_num;
		result = prime * result + ((Last_name == null) ? 0 : Last_name.hashCode());
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
		Student other = (Student) obj;
		if (First_name == null) {
			if (other.First_name != null)
				return false;
		} else if (!First_name.equals(other.First_name))
			return false;
		if (GradeBook_num != other.GradeBook_num)
			return false;
		if (Last_name == null) {
			if (other.Last_name != null)
				return false;
		} else if (!Last_name.equals(other.Last_name))
			return false;
		return true;
	}

}
