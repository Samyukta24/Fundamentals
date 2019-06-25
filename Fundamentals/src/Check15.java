//Sum of digits of a number
public class Check15{
  public static void main(String args[]) {
		int temp=0,sum=0;
		for(int n=1234;n>0;n=n/10)
		{
		  temp=n%10;
		  sum=sum+temp;
		}
		
		System.out.println(sum);
		
		
	}

}
