package com.org.java8sort;

import java.util.Map;

import java.util.stream.Collectors;

/**
 * Java 8 - Count Duplicate Characters from a String
 * 
 * @author RAMESH
 *
 */
public class CountDuplicateCharsJava8 {

    public static void main(String[] args) {

        // given input string
//        String input = "JavaJavaEEbcd";
        String input = "Mahboob Anwar";

        // convert string into stream
        Map < Character, Long > result = input
            .chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
    }
}