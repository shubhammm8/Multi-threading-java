package AllConcept;


interface Profile{
	public void Name();
	
}

public class MultithreadingInAnonymousClass {

	public static void main(String[] args) {
	
		Profile p=new Profile(){

			@Override
			public void Name() {
				System.out.println("Messi");
				
			}
			
		};
		p.Name();
	
		
		
		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
System.out.println("I m running inside a thread in anonymous class");
			}
			
		});
		t.start();
		

	}

}
