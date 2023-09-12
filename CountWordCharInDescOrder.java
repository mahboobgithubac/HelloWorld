package com.org.coding_questions;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordCharInDescOrder {

	public static void main(String[] args) {
		String sentence= "hello world this is student technique youtube channel";
		Map<Integer, List<String>> wordCountLength = Arrays.asList(sentence.split(" "))
		.stream()
		.collect(Collectors.groupingBy(String::length));
		
		wordCountLength.entrySet()
		.stream()
		.sorted((e1,e2)-> e2.getKey()-e1.getKey())
		.forEach(e-> System.out.println(e.getKey()+ " = "+ e.getValue()));
		
	}
}
