
public class HelloRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from a thread!");
		for (int i = 0; i < 20; i++) {
			try {
				// Thread.sleep((long) (Math.random() * 900 + 100));
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread().getName());

		}
	}

	public static void main(String args[]) throws InterruptedException {
		long x = System.currentTimeMillis();
		Thread t1 = (new Thread(new HelloRunnable()));
		Thread t2 = (new Thread(new HelloRunnable()));
		Thread t3 = (new Thread(new HelloRunnable()));
		Thread t4 = (new Thread(new HelloRunnable()));
		Thread t5 = (new Thread(new HelloRunnable()));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		long y = System.currentTimeMillis();
		long h = y - x;
		System.out.println(h);

		// HelloRunnable t1 = new HelloRunnable();
//		HelloRunnable t2 = new HelloRunnable();
//		HelloRunnable t3 = new HelloRunnable();
//		HelloRunnable t4 = new HelloRunnable();
//		HelloRunnable t5 = new HelloRunnable();

		// t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
	}

}