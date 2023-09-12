package com.org.java8sort;
public class InterviewPrograms11 
{
	/*
	 * Input string =AAAADDDCCCA 
	 * Output= A4D3C3A1
	 */
	public static void main(String[] args) 
	{
		String s = "AAAADDDCCCAA";
		int count = 1;
		String re = "" ;
		for (int i = 0 ; i <=s.length()-1; i++ )
		{
			if ( i == s.length()-1 & count == 1 )
			{
				re = re + s.charAt(i)+count;
				break ;
			}
			if ( s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				re = re + s.charAt ( i ) + count ;
				count = 1 ;
			}

		}
		System.out.println ( re ) ;
	}
}