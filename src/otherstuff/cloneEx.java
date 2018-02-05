package otherstuff;

public class cloneEx implements Cloneable{
	private int id;
	private String name;
	cloneEx(int id,String name){
		this.id=id;
		this.name=name;
		
	}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
	public static void main(String[] args){
		cloneEx ce=new cloneEx(1,"messi");
		
		
	try {
		cloneEx ce2=(cloneEx)ce.clone();
		
		System.out.println(ce.id+"   "+ce.name);
		System.out.println(ce2.id+"   "+ce2.name);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
}
