package ARRAY;

import java.util.Arrays;

public class SortCharectors {
	//sortusinginbuiltmethod
	
	public static void main(String[] args) {
		String s1 = "PRAMODHG";
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
}