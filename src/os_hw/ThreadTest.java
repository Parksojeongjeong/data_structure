package os_hw;

import java.util.Random;

class ThreadE extends Thread {

	String name;
	int count;
	static int sum = 0; 
	Random random;

	public ThreadE(String name, int count) {
		this.name = name;
		this.count = count;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				sum = sum + i;
				int mili_second = random.nextInt(5);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sum);
	}
}

public class ThreadTest {

	public static void main(String args[]) {
		ThreadE threadOne = new ThreadE("one", 5);
		ThreadE threadTwo = new ThreadE("two", 5);

		threadOne.start();
		threadTwo.start();

	}
}

