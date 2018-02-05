package otherstuff;

public class CallBy {

	int id=9;
	void changeId(int id){
		id=id+9;
		System.out.println(id);
	}
	
	public void changeIdbyObject(CallBy o){
		o.id=o.id+9;
		
	}
	public static void main(String[] args) {
		CallBy a=new CallBy();
		a.changeId(9);
		System.out.println("the value of changed id is - "+a.id);
		a.changeIdbyObject(a);
		System.out.println("the value when passing the object to the class is - "+a.id);
		
		
	}

}
