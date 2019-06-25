
public class Check12 {
	public static void main(String args[]) {
		int n=10,i,flag=0;
		
		for(i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.print(n+ " is prime");
		}
		else
			System.out.print(n+ " is not prime");
	}

}
