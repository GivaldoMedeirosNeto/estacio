package thread;

public class ExemploThread2 implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				System.out.print("*");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}
