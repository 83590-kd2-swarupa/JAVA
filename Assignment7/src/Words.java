import java.util.Scanner;

public class Words 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String:");
		str=sc.nextLine();
		
		String[] arr=str.split(" ");
		System.out.println("Number of Words in a String are "+ arr.length +".");
	}
}
