/**
 * This program is demonstrate to find the duplicate element in array
 */
package com.app.lokesh;

public class DuplicateElement {

	public static void main(String[] args) {

		int[] a = { 5, 6, 4, 2, 5, 4, 8, 9, 3, 7, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
