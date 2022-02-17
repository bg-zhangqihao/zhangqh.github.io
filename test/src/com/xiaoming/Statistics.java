package com.xiaoming;

import java.util.Scanner;

import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = myScanner.nextInt();
		}

		// ÏÈ½øÐÐÅÅÐò
		Arrays.sort(a);

		int count = 1;
		long k = a[0]; //
		for (int i = 1; i < a.length; i++) {
			if (a[i] != k) {
				System.out.println(k + " " + count);
				k = a[i];
				count = 1;
				
			} else {
				count++;
			}
			if(i==a.length-1) {
				System.out.println(k + " " + count);
			}
			
		}
	
	}

}
