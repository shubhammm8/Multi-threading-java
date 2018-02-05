package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx implements Callable<String>{

	@Override
	public String call() throws Exception {
		String s="hi i m "+Thread.currentThread().getName()+Thread.currentThread().getId();
		return s;
	}
	
	public static void main(String[] args){
		
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		List<Future<String>> li=new ArrayList<Future<String>>();
		Callable<String> callable=new CallableEx();
		for(int i=0;i<50;i++){
			
			
			Future<String> f=es.submit(callable);
			li.add(f);
		}
		for(Future<String> f:li){
			try {
				System.out.println("hi the returned object is --- "+f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
