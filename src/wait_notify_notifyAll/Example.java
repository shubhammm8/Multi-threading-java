package wait_notify_notifyAll;

public class Example {
	public static void main(String[] args){
	Message m=new Message("lelo");
	WaiterThread w1=new WaiterThread(m);
	new Thread(w1,"Wow").start();
	
	WaiterThread w2=new WaiterThread(m);
	new Thread(w2,"Wow2").start();
	
	Notifier n=new Notifier();
	n.m=m;
	new Thread(n,"notifier").start();
    System.out.println("All the threads are started");
	
	
	}
}
