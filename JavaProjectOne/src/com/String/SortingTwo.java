package com.String;

import java.util.Arrays;

public class SortingTwo {

	public static void main(String[] args) {
		String s = "Sai is a good boy";
		s= s.replace(" ", "");
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String sorted_new = new String(ch);
		System.out.println(sorted_new);


	}

}
