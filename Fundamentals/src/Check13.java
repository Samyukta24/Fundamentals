
public class Check13 {
	public static void main(String args[]) {
		int i,j,flag=0;
	for(i=10;i<=99;i++)
		{
		flag=0;
		for(j=2;j<=(i/2);j++)
		{
			if(i%j==0)
			{
				flag=1;
			}
		}
		
		if(flag==0)
		{
			System.out.println(i);
		}
		}
		
	

}


}
