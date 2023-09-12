package com.org.coding_questions;

public class ReverseNoWithoutUsingVariable {
	
	public static void main(String[] args) {
		int x=10;//48438
		int y=5;//485584
		//swap the value
//		x=x+y; //15
//		y=x-y; //10
//		x=x-y; //5
//		System.out.println("value of x="+x +" and value of y="+y);
		//xor 
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("value of x="+x +" and value of y="+y);
	}

}
