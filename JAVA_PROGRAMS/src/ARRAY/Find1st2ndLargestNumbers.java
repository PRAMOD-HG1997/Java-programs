package ARRAY;

import java.util.Arrays;

public class Find1st2ndLargestNumbers {
	public static void main(String[] args) {
		int [] a= {1, 2, 3, 4 ,5,7};
		Arrays.sort(a);
		System.out.println("First Largest "+a[a.length-1]);
		System.out.println("Second Largest "+a[a.length-2]);
		System.out.println("First Smallest "+a[0]);
		System.out.println("Second Smallest "+a[1]);
	}
	
}
