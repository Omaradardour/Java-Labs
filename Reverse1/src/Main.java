import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> al = new ArrayList<String>();
al.add("Omar");
al.add("Ayoub");
al.add("Firas");
System.out.println(al);
	Collections.shuffle(al,new Random());
	System.out.println(al);
	
	Collections.reverse(al);
	System.out.println(al);

}
}
