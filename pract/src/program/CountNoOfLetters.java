package program;

import java.util.Scanner;

public class CountNoOfLetters {

	public static void main(String[] args) 
	{
		Scanner scr;
		scr = new Scanner(System.in);
		System.out.println("enter a string"); 
		String str=scr.nextLine();
		
		count(str);

	}
	public static void count( String str)
	{
		char[] ch=str.toCharArray();
		int letter=0;
		int number=0;
		int space=0;
		int other=0;
		for (int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
				letter++;
			else if(Character.isDigit(ch[i]))
				number++;
			else if(Character.isSpaceChar(ch[i]))
				space++;
			else 
				other++;
			
			}
		System.out.println(letter);
		System.out.println(number);
		System.out.println(space);
		System.out.println(other);
		
	}

}
