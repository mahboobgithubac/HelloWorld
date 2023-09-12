package com.org.coding_questions;
import java.util.Scanner;

// 3 ways to reverse a number
public class NumberReverse {
	public static void main(String[] args) {
		// 1st way
     System.out.print("enter a number \t");
     Scanner sc= new Scanner(System.in);
	 int number=sc.nextInt();
	 int rev=0;
	 int temp=number;
	 while(number>0) {
		 rev=number%10+rev*10;
		 number/=10;
	 }
	System.out.println("Reversed number is : "+rev);
	
	// 2nd way recursive 
	number=temp;
	System.out.println("recursive "+reverse(number));
	
	//3rd way
	int n=temp;
	StringBuffer sb=new StringBuffer(String.valueOf(n));
	sb.reverse();
	System.out.println("String way "+Integer.parseInt(String.valueOf(sb)));
	}

	static int revs=0;
	static int base=1;
	private static int reverse(int number) {
		if(number>0) {
			reverse(number/10);
			revs+=(number%10)*base;
			base*=10;
		}
		
		return revs;
	}


}
