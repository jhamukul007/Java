package com.string.problem;

import java.util.Scanner;

public class FindTheNumberOfOccurance 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character:");
		String c=sc.next();
		String s="abcdefghijjkfaasdlldkf";
		int count=s.length()-s.replaceAll(c, "").length();
		System.out.println("occurance of char "+c+" is: "+count);
		
	}
}
