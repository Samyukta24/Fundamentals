
public class Check19 {
	public static void main(String args[]) {
		int count=0;
		
		for(int i=1;i<=1000;i++) {
			if(i%2==0 && i%3==0 && i%5==0) {
				count++;
				System.out.println(i);
				if(count==5)
				{
					break;
				}
			}
		}
	}

}
