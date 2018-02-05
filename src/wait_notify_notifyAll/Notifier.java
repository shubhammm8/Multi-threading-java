package wait_notify_notifyAll;

public class Notifier implements Runnable{
	public Message m;
	
	@Override
	public void run() {
		System.out.println("hi  im notifier");
		try {
			Thread.sleep(2000);
			synchronized(m){
				
				m.notifyAll();
				System.out.println("i m notifying...");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
}
