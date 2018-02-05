package Synchronised;

class Count{
	int count;
//synchronized keyword is used for locking down the counter
	public synchronized void counter(){
		count++;
	}
	
	
}
public class SyncroniseExample {
public static void main(String[] args) throws Exception{
	
	Count c=new Count();
	Thread t1=new Thread(new Runnable(){
		public void run(){
			for(int i=0;i<1000;i++)c.counter();
		}
		
	});
	Thread t2=new Thread(new Runnable(){
		public void run(){
			for(int i=0;i<1000;i++)c.counter();
		}
		
	});
	t1.start();
	t2.start();
	t1.join();//wait for t1  to complete
	t2.join();//wait for t2 to complete
	System.out.println(c.count);
	
}
	
	
}
