package task02;

public class loopEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printNums1(10);
		 printNums2(9);
		 printNums3(7);
	}
			public static void printNums1(int upperLimit) {
				for(int i=0;i<=upperLimit;i++) {
					System.out.println(i);
		}
				System.out.println("---------------");
			}
				public static void printNums2(int a) {
					for(int i=0;i<a;i=i+2) {
						System.out.println(i);
					}
					System.out.println("----------");
				}
				public static void printNums3(int b) {
					for(int i=b;i>=0;i--) {
						System.out.println(i);
					}
				}
			}

