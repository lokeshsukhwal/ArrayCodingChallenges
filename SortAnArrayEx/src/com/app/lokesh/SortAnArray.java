/**
 * This program is demonstrate Sort An Array Ascending and descending order 
 */
package com.app.lokesh;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int[] a = { 10, 45, 35, 86, 74, 25 };
		
		/**
		 * this logic is sort an array without predefined method
		 */
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("********* With pre-definded method *********");
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
