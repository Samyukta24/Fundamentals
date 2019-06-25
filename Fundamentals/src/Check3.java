
public class Check3 {
	public static void main(String args[]) {
        //PROGRAM TO FIND WHETHER THERE IS A COMMAND LINE AGRGUMENT OR NOT AND SEPERATES BY COMMA
        if (args.length ==0)
            {
            System.out.println("No Values");
    }
       int size=args.length;
       for(int i=0;i<size;i++) {
    	   if(i==size-1) {
    		  System.out.println(args[i]); 
    	   }
    	   else
    		   System.out.print(args[i]+",");
       }
        }
       
	}
	

