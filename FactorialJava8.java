package com.org.java8sort;

import java.util.stream.LongStream;

public class FactorialJava8 {
	public static long factorialStreams(long n) {

		  return LongStream.rangeClosed(1, n)
		      .reduce(1, (long a, long b) -> a * b);
		}
public static void main(String[] args) {
	System.out.println(factorialStreams(5));
	
//System.out.println(5*4*3*2*1);
}
}
//120