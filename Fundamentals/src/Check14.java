
public class Check14 {
	public static void main(String args[]) {
		int n=29,i,flag=0;
		if(n==0||n==1)
		{
			System.out.println(n+" neither prime nor composite");
		}
		
		for(i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0&&n!=0&&n!=1)
		{
			System.out.print(n+ " is prime");
		}
		else if(n!=0&&n!=1)
			System.out.print(n+ " is not prime");
	}

}

