import java.util.Scanner;

public class String_rev 
{

	public static void main(String[] args) 
	{
		String str;
		char ch;
		String rev="";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String:");
		str=sc.next();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			rev=rev+ch;	
		}		
		System.out.println("Reverse of String is:"+ rev);
	}

}
