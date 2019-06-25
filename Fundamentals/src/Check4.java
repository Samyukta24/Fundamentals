
public class Check4 {
	public static void main(String args[]) {
		String temp="NULL";
		if(args[0].compareTo(args[1])>0){
			temp=args[0];
			args[0]=args[1];
			args[1]=temp;
			
		}
	
			System.out.println(args[0]+","+args[1]);
		
	}

}
