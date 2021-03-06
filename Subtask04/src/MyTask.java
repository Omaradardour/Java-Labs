import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyTask implements Runnable {
	private String string;

	public MyTask(String string) {
		this.string = string;
	}

	// TODO Auto-generated constructor stub
	

	public void run() {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName() + ":" + string);
		
			try {
				// Thread.sleep((long) (Math.random() * 900 + 100));
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread().getName() + ":"+ string);

		}
	}

	public class Main {
	public static void main(String[] args)  throws InterruptedException{
		
	

// Create an executor.
ExecutorService executor = Executors.newFixedThreadPool(10);
for( int i =1; i<=10;++i) {
	

// Add a runnable task and execute it.
Runnable task = new MyTask("task" +1);
executor.execute(task);

// Wait for termination.
executor.shutdown();
do {
	System.out.println(Thread.currentThread().getName() + ": waiting...");
	executor.awaitTermination(10, TimeUnit.SECONDS);


	



	
} while (!executor.isTerminated());}
}
	}
	