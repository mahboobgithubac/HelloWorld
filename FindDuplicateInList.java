package com.org.coding_questions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInList {
	public static void main(String[] args) {
		List<String> listWithDuplicates =
		 Arrays.asList("apple", "banana", "pear", "apple", "orange", "banana");
		
		//output : [apple,banana]
		
		//1st way
		List<String> duplicates = listWithDuplicates.stream()
		.collect(Collectors.groupingBy(s->s))
		.entrySet()
		.stream()
		.filter(e->e.getValue().size()>1)
		.map(e->e.getKey())
		.collect(Collectors.toList());
		
		System.out.println(duplicates);
		
		//2nd way
		Set<String> uniqueSet=new HashSet<>();
		
		List<String> duplicates1=listWithDuplicates.stream()
		.filter(e-> !uniqueSet.add(e))
		.collect(Collectors.toList());
		
		System.out.println(duplicates1);
	}
}
