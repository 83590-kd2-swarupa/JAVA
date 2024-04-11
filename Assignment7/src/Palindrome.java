import java.util.Scanner;

public class Palindrome
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
		
		if(str.equals(rev))
		{
			System.out.println(str + " is Palindrome.");
		}
		else
		{
			System.out.println(str + " is Not Palindrome.");
		}
		
	}

}
