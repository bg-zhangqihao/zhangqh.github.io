package com.xiaoming;

import java.util.Scanner;

public class loop1 {
	// 四个方向
	// 往下{1,0} x不断加 y不变
	// 往左{0，1}
	// 往上{-1,0}
	// 往左{0,-1}
	public static void main(String[] args) {

		int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

		Scanner myScanner = new Scanner(System.in);
		int m = myScanner.nextInt();
		int n = myScanner.nextInt();
		int loop[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int a = myScanner.nextInt();
				loop[i][j] = a;
			}
		}
		// x=-1是第一个打印的就是-1 d来标记转弯处 ，sum记录打印的个数
		int x = -1, y = 0, d = 0, sum = 1;
		while (sum < m * n) {
			sum++;
			// nextx,nexty来检测下一个x y位置是否到达边界
			int nextx = x + dir[d][0], nexty = y + dir[d][1];
			// 要么达到边界，要么这个位置-1是被访问过的
			if (nextx < 0 || nexty < 0 || nextx >= m || nexty >= n || loop[nextx][nexty] == -1) {
				d = (d + 1) % 4;
				x = x + dir[d][0];
				y = y + dir[d][1];
			} else {
				x = nextx;
				y = nexty;
			}

			System.out.print(loop[x][y] + " ");
			loop[x][y] = -1;
		}
	}
}