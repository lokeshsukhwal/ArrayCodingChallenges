/**
 *  This program is demonstrate to merge two array
 */
package com.app.lokesh;

import java.util.Arrays;

public class MegeTwoArray {

	public static void main(String[] args) {
		int [] a = {10,20,30};
		int [] b = {40,50,60};
		int [] c = new int [a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[i+ a.length] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
