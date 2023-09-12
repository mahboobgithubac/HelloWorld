package com.org.coding_questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToList {

	public static void main(String[] args) {
		String str="1,2,3,4,10";
		List<String> list = Arrays.asList(str.split(","));
		System.out.println(list);//will print list of string
		//to convert List of String to list of int
		List<Integer> resultList = list.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println("resultList==>"+resultList);
	}
}
