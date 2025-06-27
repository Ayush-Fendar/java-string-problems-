// Toggler 
package string_problems;
import java.util.Scanner;
public class Toggler {

	public static void main(String[] args) {
		System.out.print("Enter the input :");
		Scanner Scanner =new Scanner(System.in);
		String input = Scanner.nextLine();
		String  result="";
		//String letter= "abcdefghiklmnopqrstuvwxyz";
		for(int i=0 ;i< input.length();i++)
		{
		char ch= input.charAt(i);
		if(Character.isLowerCase(ch))
		{
			result += Character.toUpperCase(ch);
		}else if(Character.isUpperCase(ch))
		{
			result += Character.toLowerCase(ch);
		}else
		{
			result += Character.toString(ch); 
		}
		}
		
		System.out.println("result :" +result);
	}

}
