package com.xiaozhang;

import java.util.Random;
import java.util.Scanner;



public class method {

	public static void main(String[] args) {
		computer c = new computer();
		Tom tom = new Tom();
		tom.OutGame(c);

	}
}

class computer {

	public int randomm() {
		// 0代表石头， 1代表剪刀， 2代表布

		Random r = new Random();
		int Num = r.nextInt(3);
		System.out.println("电脑出:" + Num);
		return Num;

	}

}


class Tom {
	Scanner myScanner = new Scanner(System.in);
	

	public void OutGame(computer c) {
		System.out.println("开始游戏~~~输入0-2之间的数，输入-1退出游戏");

		int count1 = 0; // 记录Tom下赢电脑的次数
		int count2 = 0; // 记录Tom下输给电脑的次数
		while (true) {

			int OutTom = myScanner.nextInt();
			System.out.println("Tom出:" + OutTom);
			int OutComputer = c.randomm();

			if (OutTom < 0 || OutTom > 2) {
				System.out.println("不符合规范，请输入0-2之间的正整数");
				return;
			}

			else if (OutTom == 0 && OutComputer == 1) {
				count1++;
				System.out.println("Tom胜,目前赢的次数为:" + count1);
			} else if (OutTom == 1 && OutComputer == 2) {
				count1++;
				System.out.println("Tom胜,目前赢的次数为:" + count1);
			} else if (OutTom == 2 && OutComputer == 0) {
				count1++;
				System.out.println("Tom胜,目前赢的次数为:" + count1);
			} else if (OutTom == OutComputer) {
				System.out.println("平局");
			}

			else {
				count2++;
				System.out.println("Tom输的次数：" + count2);
			}
		}

	}

}
