package java_basic_programs;
import java.util.Scanner;
public class Vowels_or_Constant_checking 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character :");
        int charac=sc.next().charAt(0);
        if(charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u'
    			|| charac == 'A' || charac == 'E' || charac == 'I' || charac == 'O' || charac == 'U')
    	{
    		System.out.println("This is a vowel character"+charac);
    	}
        else
        {
        System.out.println("This is a constant character");
        }
	}
}