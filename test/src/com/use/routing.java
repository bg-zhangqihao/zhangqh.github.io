package com.use;

public class routing {

	public static void main(String[] args) {
		int n = 2021;
		int floyd[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i == j)
					floyd[i][j] = 0;
				else {
					if (Math.abs(i - j) <= 21) {
						floyd[i][j] = lcm(i+1, j+1);
					}
				}

			}

		}

		// 遍历中间节点
		for (int i = 0; i < n; i++) {
			// 遍历入度
			for (int j = 0; j < n; j++) {
				// 遍历出度
				for (int k = 0; k < n; k++) {

					if (floyd[j][i] != 0 && floyd[i][k] != 0
							&& (floyd[j][k] == 0 || floyd[j][i] + floyd[i][k] < floyd[j][k])) {
						floyd[j][k] = floyd[j][i] + floyd[i][k];
					}
				}
			}
		}
		System.out.println(floyd[0][n - 1]);
	}

	public static int gcd(int m, int n) {

		if (m % n == 0) {
			return n;
		}
		return gcd(n, m % n);
	}

	public static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}

}
