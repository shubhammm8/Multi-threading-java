package AllConcept;

public class CallMain {

	public static void main(String[] args){
		OuterClass o=new OuterClass();
		OuterClass.InnerClass ab=o.new InnerClass();
		ab.start();
	}

}
