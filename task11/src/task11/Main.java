package task11;

import java.lang.Thread.State;

class PrintMessageTask implements Runnable {
	private String text;
	private long delay;
	private int number;

	public PrintMessageTask(String text, long delay, int number) {
		this.text = text;
		this.delay = delay;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < number; i++) {
			try {
				Thread.sleep(delay);
				System.out.println(text);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
				return;
			}
		}
	}

	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Main {
	public static void main(String args[]) throws InterruptedException {

		int x = 0;
		long startTime = System.currentTimeMillis();
		// Runnable run = new PrintMessageTask("abc", 1000, 5);
		Thread[] threadArray = new Thread[20];
		for (int i = 0; i < 20; i++) {
			Runnable run1 = new PrintMessageTask("efg" + i, (int) (Math.random() * 100) + 50,
					(int) (Math.random() * 5) + 5);

			Thread thread = new Thread(run1);
			threadArray[i] = thread;
			threadArray[i].start();

		}
		Thread.sleep(5000);
		// for (int j = 0; j < 20; j++) {
//			threadArray[j].join(1000);
//		}
		for (int j = 0; j < 20; j++) {
			threadArray[j].interrupt();

		}

		long elapsedMillis = System.currentTimeMillis() - startTime;
		System.out.println("Time: " + elapsedMillis);
	}
}