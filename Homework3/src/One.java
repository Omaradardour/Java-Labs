
public class One {
	public int x;

	
	One() {
		new  One (999);
		System.out.println("One::One()");

	}
		
		
	

	One(int x) {
		System.out.println("One::One(int)");
 x=One.this.x;
		
	}





	One getInstance() {
		
		return One.this;
		
	}
	
}
