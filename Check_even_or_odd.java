package java_basic_programs;

import java.util.Scanner;

public class Check_even_or_odd 
{
static void operation(int a)
{  
		if(a%2==0)
		{
			System.out.println(" This a even number ");
		}
		else
		{
			System.out.println(" This a odd number ");
		}
}
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in); 
			System.out.println("enter a value :");
			int a=sc.nextInt();
			Check_even_or_odd.operation(a);
	}
}
