package cool;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Task1 {
	private static Scanner relation;

	public static Boolean isDigit(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

	public static void printMatrix(String R, int dim, Set<Integer> set) {
	    StringBuilder str = new StringBuilder(R);
	    String [][] matrix = new String[dim][dim];
	    Integer[] arr = set.toArray(new Integer[set.size()]);
	    int start, end;
	    while(str.indexOf("(") != -1){
	        start = str.lastIndexOf("(");
	        end = str.indexOf(")", start);
	        int x = Integer.parseInt(str.substring(start+1, str.indexOf(",", start)).trim());
	        int y = Integer.parseInt(str.substring(str.indexOf(",", start)+1, end).trim());
	        matrix[x-1][y-1]="X";
	        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).toString());
	    }
	    System.out.print("R |");
		for(int a : arr) {
			System.out.print(a + "|");
		}
		for(int j = 0; j<dim; j++) {
			System.out.println();
			if(j == 9) {
				System.out.print(arr[j] + "|");
			}
			if(j < 9) {
				System.out.print(arr[j] + " |");
			}
			for(int k=0; k<dim; k++) {
				if(matrix[j][k] == null) {
					matrix[j][k] = " ";
				}
				System.out.print(matrix[j][k] + "|");
			}
		}
	}
	
	
	public static void main(String[] args) {
		relation = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.println("Input relation : \nR = ");
		String R = relation.nextLine();
		for (int i = 0; i < R.length(); i++) {
			if (isDigit(R.charAt(i))) {
				if (isDigit(R.charAt(i + 1))) {
					set.add(10);
					i += 2;
					continue;
				} else {
					set.add(R.charAt(i) - '0');
				}
			}
		}
		int num = 0;
		for (int i = 0; i < R.length(); i++) {
			if (isDigit(R.charAt(i)) && isDigit(R.charAt(i+2))) {
				if((R.charAt(i) - '0') == (R.charAt(i+2) - '0')){
					num++;
				}
			}
		}
		if(num == set.size()) {
			System.out.println("The Relation is reflexive");
		}
		else {
			System.out.println("The Relation is not reflexive");
		}
		printMatrix(R, set.size(), set);
	}
}
