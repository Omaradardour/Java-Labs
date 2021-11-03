package shapes;
public class Demo extends Thread{
	
}
public class void Main {String[]args){
	try {
		System.out.println("A");
		Thread.currentThread().interrupt();
		System.out.println("B");
		Thread.currentThread().join();
		System.out.println("C");
		
	}catch (InterruptedException ex) {
		System.out.println("D");
	}
	System.out.println("E");
}

}
