package AllConcept;

public class CallEverything {

	public static void main(String[] args) {
		
		Everything e=new Everything();
		Everything.Inside ei=e.new Inside();
		ei.t.start();

	}

}
