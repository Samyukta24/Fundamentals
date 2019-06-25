
public class Check5 {
	public static void main(String args[]) {
		char c=7;
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			System.out.println("Alphabet");
		}
		else if(c>=0 && c<=9)
			System.out.println("Digit");
		else
			System.out.println("Anything else");
	}

}
