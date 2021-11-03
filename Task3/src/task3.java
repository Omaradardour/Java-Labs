
import java.util.Scanner;

public class task3 {
	private static Scanner predicate;
	public static Boolean isSubstring(StringBuilder S, String sub) {
		if (S.indexOf(sub) >= 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		predicate = new Scanner(System.in);
		System.out.println("Input predicate :");
		String Pr = predicate.nextLine();
		StringBuilder str = new StringBuilder(Pr.trim());      
		
		// Let  X = {x1, x2},  Y={y1, y2}
		Boolean[] Px1 = {false, false, false, false, false, false, false, false,true,  true, true,  true, true,  true,  true, true};
		Boolean[] Px2 = {false, false, false, false, true,  true,  true,  true, false, false,false, false,true,  true,  true, true};
		Boolean[] Py1 = {false, false, true,  true,  false, false, true,  true, false, false,true,  true, false, false, true, true};
		Boolean[] Py2 = {false, true,  false, true,  false, true,  false, true, false, true, false, true, false, true,  false,true};
		Boolean left = null, right=null, result = null;
		int op_ind = str.lastIndexOf("(")-2;
		int i = 0;
			while(i < 16) {				
				if(isSubstring(str, "!")) {
					op_ind = str.lastIndexOf("(")-3;
					if(str.indexOf("!") == 5) {
						Px1[i] = !Px1[i];
						Px2[i] = !Px2[i];
					}
					if(str.indexOf("!") == 10) {
						Py1[i] = !Py1[i];
						Py2[i] = !Py2[i];
					}
					if((str.indexOf("!") == 5) && (str.lastIndexOf("!") == 11)) {
						Px1[i] = !Px1[i];
						Px2[i] = !Px2[i];
						Py1[i] = !Py1[i];
						Py2[i] = !Py2[i];
					}
				}
				
			if(str.charAt(0) == '\u2200' && str.charAt(2) == '\u2203' && str.charAt(op_ind) == '\u2228') {  // '\u2200' is unicode for ∀ (for all)
				left = (Px1[i] || Py1[i])||(Px1[i] || Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] || Py1[i])||(Px2[i] || Py2[i]);
				result = left && right;
			}
			if(str.charAt(0) == '\u2200' && str.charAt(2) == '\u2203' && str.charAt(op_ind) == '\u2227') {  // '\u2200' is unicode for ∀ (for all)
				left = (Px1[i] && Py1[i])||(Px1[i] && Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] && Py1[i])||(Px2[i] && Py2[i]);
				result = left && right;				
			}
			if(str.charAt(0) == '\u2203' && str.charAt(2) == '\u2200'&& str.charAt(op_ind) == '\u2228') {
				left = (Px1[i] || Py1[i])&&(Px1[i] || Py2[i]);
				right = (Px2[i] || Py1[i])&&(Px2[i] || Py2[i]);
				result = left || right;
			}
			if(str.charAt(0) == '\u2203' && str.charAt(2) == '\u2200'&& str.charAt(op_ind) == '\u2227') {
				left = (Px1[i] && Py1[i])&&(Px1[i] && Py2[i]);
				right = (Px2[i] && Py1[i])&&(Px2[i] && Py2[i]);
				result = left || right;
			}
			
			if(str.charAt(0) == '\u2203' && str.charAt(2) == '\u2203' && str.charAt(op_ind) == '\u2227') {
				left = (Px1[i] && Py1[i])||(Px1[i] && Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] && Py1[i])||(Px2[i] && Py2[i]);
				result = left || right;	
			}
			if(str.charAt(0) == '\u2203' && str.charAt(2) == '\u2203' && str.charAt(op_ind) == '\u2228') {
				left = (Px1[i] || Py1[i])||(Px1[i] || Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] || Py1[i])||(Px2[i] || Py2[i]);
				result = left || right;	
			}
			if(str.charAt(0) == '\u2200' && str.charAt(2) == '\u2200' && str.charAt(op_ind) == '\u2227') {
				left = (Px1[i] && Py1[i])&&(Px1[i] && Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] && Py1[i])&&(Px2[i] && Py2[i]);
				result = left && right;	
			}
			if(str.charAt(0) == '\u2200' && str.charAt(2) == '\u2200' && str.charAt(op_ind) == '\u2228') {
				left = (Px1[i] || Py1[i])&&(Px1[i] || Py2[i]);           // '\u2203' is unicode for ∃     (Exist)
				right = (Px2[i] || Py1[i])&&(Px2[i] || Py2[i]);
				result = left && right;	
			}
			      /// \u2228 is unicode for logical OR (∨)
			
			     /// \u2227 is unicode for logical AND (∧)
		
		if (result == true) {
			if(isSubstring(str, "!")) {
				op_ind = str.lastIndexOf("(")-3;
				if(str.indexOf("!") == 5) {
					Px1[i] = !Px1[i];
					Px2[i] = !Px2[i];
				}
				if(str.indexOf("!") == 10) {
					Py1[i] = !Py1[i];
					Py2[i] = !Py2[i];
				}
				if((str.indexOf("!") == 5) && (str.lastIndexOf("!") == 11)) {
					Px1[i] = !Px1[i];
					Px2[i] = !Px2[i];
					Py1[i] = !Py1[i];
					Py2[i] = !Py2[i];
				}
			}
			System.out.println("The predicate is not contradiction \nBecause the predicate is true at: ");
			System.out.println("Px1 =" + Px1[i] + " |Px2 =" + Px2[i] + "| Py1= " + Py1[i] + "| Py2= " + Py2[i]);
			break;
		}
			i++;
		}
			if(result == false) {
					System.out.println("The predicate is contradiction");
			
			}
			
	}
}
	