package thread;

public class TesteThread {

	public static void main(String[] args) {
		
		//ExemploThread thread = new ExemploThread();
		//thread.start();
		
		ExemploThread2 thread2 = new ExemploThread2();
		Thread t = new Thread(thread2);
		t.start();
		
		try {
			for(int i = 0; i <= 20; i++) {
				System.out.print("-");
				Thread.sleep(500);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
