package com.org.coding_questions;

public class LinearSearch {
	public static void main(String[] args) {
		
		int ar[]= {2,5,3,8,12,67,11,9};
		int val=12;
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			if(val==ar[i]) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("value is presented.");
		}else {
			System.out.println("value is not presented.");
		}
		
	}

}
