package com.xiaoming;

import java.time.Year;
import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Scanner;


public class sort {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt(); // 要排序的个数
		int a[] = new int[n];
		String arr[] = new String[n];
		String ans = "";
		String temp;
		int j = 0;
		for (int i = 0; i < n; i++) {
			int m = myScanner.nextInt(); // 具体哪n个数
			a[i] = m;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = a[i] + "";
		}

		for (int k = n - 1; k > 0; k--) {
			for (int i = 0; i < k; i++) {
				if (arr[i].compareTo(arr[i + 1]) < 0) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			ans +=arr[i];
		}
		System.out.println(ans);
}
}