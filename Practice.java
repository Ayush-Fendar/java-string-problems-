package string_problems;

public class Practice {
	public static void count(String input)
	{
		int countvowels=0;
		int countconsonents=0;
		
		String vowels= "aeiou AEIOU";
		 for(int i=0;i<input.length();i++)
		 {
			 char ch= input.charAt(i);
			 if(Character.isLetter(ch))
			 {
				 if(vowels.indexOf(ch)!= -1)
				 {
					 countvowels++;
				 }else
				 {
					 countconsonents++;
				 }	 
			 }
		 }
		 System.out.println("vowels :" +countvowels);
		 System.out.println("consonents :" +countconsonents);
		
	}
}
