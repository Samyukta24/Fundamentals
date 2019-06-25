//Floyd's Triangle
public class Check16 {
	public static void main(String args[]) {
		int i,j;
		if(args.length==0)
		{
			System.out.println("please enter the number");
		}
		else
			for(i=1;i<=Integer.parseInt(args[0]);i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println(" " );
			}
	}

}