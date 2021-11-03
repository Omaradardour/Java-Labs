import java.util.*;
public class Maps {

	static void getEmployees(HashMap<String, String> Emp, String key) {
		 key = key.toLowerCase();
		 System.out.println(Emp.get(key));
		 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String , String> Employees = new HashMap<String ,String>();
Employees.put("a1234"	,"Steve Jobs");
Employees.put("a1235",	"Scott McNealy");
Employees.put("a1236"	,"Jeff Bezos");
Employees.put("a1237"	,"Larry Ellison");
Employees.put("a1238"	,"Bill Gates");
getEmployees(Employees , "A1234");


Map< Integer, String> Num = new HashMap< Integer, String>();
Num.put( 1, "One");
Num.put(2, "Two");   
Num.put(3, "Three");
Num.put(4, "Four");
Num.put(5, "Five");
System.out.println(Num.get(3));




} 

}
	

