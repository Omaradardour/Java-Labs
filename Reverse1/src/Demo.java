
public class Demo {
public static void main(String[] args)throws Exception {
	Thread x =new Thread();
	x.start();
	x.wait();
	System.out.println("doone");
}
}
