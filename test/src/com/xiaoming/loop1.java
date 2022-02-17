package com.xiaoming;

import java.util.Scanner;

public class loop1 {
	// �ĸ�����
	// ����{1,0} x���ϼ� y����
	// ����{0��1}
	// ����{-1,0}
	// ����{0,-1}
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
		// x=-1�ǵ�һ����ӡ�ľ���-1 d�����ת�䴦 ��sum��¼��ӡ�ĸ���
		int x = -1, y = 0, d = 0, sum = 1;
		while (sum < m * n) {
			sum++;
			// nextx,nexty�������һ��x yλ���Ƿ񵽴�߽�
			int nextx = x + dir[d][0], nexty = y + dir[d][1];
			// Ҫô�ﵽ�߽磬Ҫô���λ��-1�Ǳ����ʹ���
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