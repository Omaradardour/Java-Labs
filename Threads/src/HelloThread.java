
public class HelloThread extends Thread {

	public void run() {
		System.out.println("Hello from a thread!");
		for (int i = 1; i < 20; i++) {
			try {
				Thread.sleep((long) (Math.random() * (1000 - 100)));
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		(new HelloThread()).start();
		HelloThread t1 = new HelloThread();
		HelloThread t2 = new HelloThread();
		HelloThread t3 = new HelloThread();
		HelloThread t4 = new HelloThread();
		HelloThread t5 = new HelloThread();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}