package com.org.coding_questions;
public class StarPattern {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<5;i++) {
			
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
			sb.append("*");
			System.out.println(sb);
		}
	}

}


//output
//*
//**
//***
//****
//*****