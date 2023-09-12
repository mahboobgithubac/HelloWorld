package com.org.java8sort;

import java.util.HashSet;

public class TestCodeHashCode {
public static void main(String[] args) {
System.out.println("Main started");
HashSet<String> hs=new HashSet<>();
hs.add(null);
hs.add(null);
hs.add("abc");
System.out.println(hs.size());
}
}
