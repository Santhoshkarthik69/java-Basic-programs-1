package java_basic_programs;
import java.util.Scanner;
public class Add_binaryStrings 
{
	static void operation(String a, String b)
	{
		int x=Integer.parseInt(a,2);
		int y=Integer.parseInt(b,2);
		int sum=x+y;
		String result=Integer.toBinaryString(sum);
	    System.out.println("binary value :"+result);
	}
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    //only binary values
	System.out.println("enter a value :");
	String a=sc.next();
	System.out.println("enter a value :");
	String b=sc.next();
	Add_binaryStrings.operation(a, b);
	}
}
