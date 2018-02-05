package wait_notify_notifyAll;

public class WaiterThread implements Runnable {
public Message msg;
public WaiterThread(Message m){
	this.msg=m;
}
	@Override
	public void run() {
		System.out.println("hi guys im first thread"+Thread.currentThread().getName());
		synchronized (msg){
			try {
				msg.wait();
				
				System.out.println("I m back alive n i m thread  "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
