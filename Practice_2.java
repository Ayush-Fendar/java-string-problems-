//Reverse the string 
package string_problems;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to reverse:");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		String st=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			st=st+ input.charAt(i);
		}
	
		System.out.println("Reversed character :" +st);

	}

}
