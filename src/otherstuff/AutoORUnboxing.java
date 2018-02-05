package otherstuff;

public class AutoORUnboxing {
public static void main(String[] args){
	
	Integer i=9;
	int take1=i.intValue();
	System.out.println("Object Converted into primitive type   "+take1);
	Integer take2=Integer.valueOf(take1);
	System.out.println("primitive agian convereted to object type "+take2);
}
	
}
