package com.String;

import java.util.Scanner;

public class RemoveVowles {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a string");
     String str=sc.nextLine();
     String newStr=str.replaceAll("[AEIOUaeiou]", "");
     System.out.println("with out vowles");
     System.out.println(newStr);
	}

}
