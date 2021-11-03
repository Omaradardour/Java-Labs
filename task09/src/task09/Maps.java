package task09;

import java.util.HashMap;

public class Maps {
	
	static void getEmployees(HashMap<String, String> map, String key) {
		 key = key.toLowerCase();
		 System.out.println(map.get(key));
	}

	public static void main(String[] args) {
	   HashMap<String, String> employees = new HashMap<String, String>();
	   employees.put("a1234", "Steve Jobs");
	   employees.put("a1235", "Scott McNealy");
	   employees.put("a1236", "Jeff Bezos");
	   employees.put("a1237", "Larry Ellison");
	   employees.put("a1238", "Bill Gates");

	   getEmployees(employees,"A1234" );
	}

}
