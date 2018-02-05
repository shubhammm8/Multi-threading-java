package otherstuff;

public class CommandLineEx {

	public static void main(String[] args) {
		String in="wow";
		int i=0;
		
		while(in.equals("exit")){
			System.out.println("the command line -  "+i+" - "+args[i]);
			i++;
			in=args[i];
			
		}
		

	}

}
