package com.xiaoming;

import java.util.Scanner;

public class loop {
	// �����ĸ�����
	// ����{1,0} x=1 y=0 x����+1 y����
	// ����{0,1} x=0 y=1 x���䣬 y����+1
	// ����{-1,0} x=-1 y=0 x���ϼ��� y����
	// ����{0,-1} x=0 y=-1 x���䣬y���ϼ���
	static int[][] dir = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int loop[][] = new int[m][n];
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				loop[i][j] = sc.nextInt();
		// x=-1�Ǳ�����Ѿ���ȡ����sum��¼����˶��ٸ���
		int x = -1, y = 0, sum = 1;
		while (sum < m * n) {
			sum++;
			// ������
			while (x + 1 < m && loop[x + 1][y] != -1) {
				System.out.print(loop[++x][y] + " ");
				loop[x][y] = -1;

			}
			// ������
			while (y + 1 < n && loop[x][y + 1] != -1) {
				System.out.print(loop[x][++y] + " ");
				loop[x][y] = -1;
			}
			// ������
			while (x > 0 && loop[x - 1][y] != -1) {
				System.out.print(loop[--x][y] + " ");
				loop[x][y] = -1;
			}
			// ������
			while (y > 0 && loop[x][y - 1] != -1) {
				System.out.print(loop[x][--y] + " ");
				loop[x][y] = -1;
			}
		}
	}
}