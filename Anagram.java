package string_problems;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter 1st string :- ");
		String input1= scanner.nextLine().toLowerCase().replace(" ", "");
		System.out.print("Enter 2nd string :-");
		String input2= scanner.nextLine().toLowerCase().replace(" ", "");
		if(input1.length() != input2.length())
		{
			System.out.println("Sorry it's not Anagram . Please exit !!");
		}
		for(int i=0;i<input1.length();i++)
		{
			char ch= input1.charAt(i);
			int indexinput2= input2.indexOf(ch);
			if(indexinput2 != -1)
			{
				input2= input2.substring(0,indexinput2)+ input2.substring(indexinput2+1);
			}else
			{
				System.out.println("Not an anagram " +ch+ "" );
				return;
			}
		}
		if(input2.isEmpty())
		{
			System.out.println("yess the strings are anagrams ");
		}else
		{
			System.out.println("not sorry!!");
		}
		

	}

}
