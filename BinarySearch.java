package com.org.coding_questions;

public class BinarySearch {
	static int binary(int arr[],int target) {
	int l=0;
	int r=arr.length-1;
	while(l<=r) {
		int mid=l+(r-l)/2;  //(l+r)/2;
		System.out.println("value " +arr[mid]);
		if(arr[mid]==target) {
			return mid;
		}else if(target>arr[mid]) {
			l=mid+1;
		}else {
			r=mid-1;
		}
	}
	return -1;
	}
	
	public static void main(String[] args) {
		int ar[]= {1,4,6,8,12,24,25,30,45};
		System.out.println(binary(ar,40));
	}
}
