package com.xiaoming;

import java.util.Scanner;

public class loop {
	// 定义四个方向
	// 往下{1,0} x=1 y=0 x不断+1 y不变
	// 往右{0,1} x=0 y=1 x不变， y不断+1
	// 往上{-1,0} x=-1 y=0 x不断减少 y不变
	// 往左{0,-1} x=0 y=-1 x不变，y不断减少
	static int[][] dir = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int loop[][] = new int[m][n];
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				loop[i][j] = sc.nextInt();
		// x=-1是标记着已经读取过，sum记录输出了多少个数
		int x = -1, y = 0, sum = 1;
		while (sum < m * n) {
			sum++;
			// 往下走
			while (x + 1 < m && loop[x + 1][y] != -1) {
				System.out.print(loop[++x][y] + " ");
				loop[x][y] = -1;

			}
			// 往右走
			while (y + 1 < n && loop[x][y + 1] != -1) {
				System.out.print(loop[x][++y] + " ");
				loop[x][y] = -1;
			}
			// 往上走
			while (x > 0 && loop[x - 1][y] != -1) {
				System.out.print(loop[--x][y] + " ");
				loop[x][y] = -1;
			}
			// 往左走
			while (y > 0 && loop[x][y - 1] != -1) {
				System.out.print(loop[x][--y] + " ");
				loop[x][y] = -1;
			}
		}
	}
}