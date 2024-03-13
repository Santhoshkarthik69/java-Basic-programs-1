package java_basic_programs;

public class Print_small_Alphabets 
{
	public static void main(String[] args) 
	{
		char c;
		System.out.println("Small letters");
		for(c='a';c<='z';++c)
		{	
			System.out.print(" "+c);
		}
	}
}
