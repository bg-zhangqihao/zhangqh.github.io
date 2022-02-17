package com.xiaoming;

public class lanqiaobei1 {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("====当前矩阵======");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	  System.out.println("=====环形取数======");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==0||i==a.length||j==a[i].length) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println(" ");
		}
		
		
	}
}