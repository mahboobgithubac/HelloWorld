package com.org.java8sort;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountAdjacentCharacter {
	public static void main(String[] args) {
		String str = "aaaabbbbbbccdddddbbbb";
		StringBuffer sb=new StringBuffer();
		char[] charArr=str.toCharArray();
		int countadj=1;
		for(int i=0;i<charArr.length;i++) {
			sb.append(charArr[i]);
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]!=charArr[j]){
					break;

				}i++;
				countadj++;
			}
			sb.append(countadj);
			countadj=1;
		}
		System.out.println(sb);//output  a4b6c2d5b4
		//	String result2 = Arrays.stream()
		//	        .mapToObj(s -> s.charAt(0) + s.length())
		//	        .collect(Collectors.joining());
		//	

		Map < Character, Long > resultMap = str
				.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		resultMap.forEach((k, v) -> {
			//         if (v > 1) {
			//             System.out.print("At 25 "+k + " : " + v);
			System.out.print(""+k + v);   //output  a4b10c2d5
			//         }
		});
		//	String result1 = Arrays.stream(str.split("(?<=(.))(?!\\1)"));
		System.out.println();

		String check[]=str.split("(?<=(.))(?!\\1)");//5
		System.out.println(check.length);
		String result = Arrays.stream(str.split("(?<=(.))(?!\\1)"))
				.map(s -> s.length() + Character.toString(s.charAt(0)))
				.collect(Collectors.joining());  //
		System.out.println(result);
	}
}
