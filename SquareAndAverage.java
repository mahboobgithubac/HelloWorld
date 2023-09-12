package com.org.coding_questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndAverage {
	public static void main(String[] args) {
		List<Integer> details = Arrays.asList(1, 2, 11, 12);
		Double result = details.stream().map(i->i*i)
		.filter(i->i<100)
		.collect(Collectors.averagingInt(i->i));
		System.out.println(result);
	}
}

//output 2.5

