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
		// 0����ʯͷ�� 1��������� 2����

		Random r = new Random();
		int Num = r.nextInt(3);
		System.out.println("���Գ�:" + Num);
		return Num;

	}

}


class Tom {
	Scanner myScanner = new Scanner(System.in);
	

	public void OutGame(computer c) {
		System.out.println("��ʼ��Ϸ~~~����0-2֮�����������-1�˳���Ϸ");

		int count1 = 0; // ��¼Tom��Ӯ���ԵĴ���
		int count2 = 0; // ��¼Tom��������ԵĴ���
		while (true) {

			int OutTom = myScanner.nextInt();
			System.out.println("Tom��:" + OutTom);
			int OutComputer = c.randomm();

			if (OutTom < 0 || OutTom > 2) {
				System.out.println("�����Ϲ淶��������0-2֮���������");
				return;
			}

			else if (OutTom == 0 && OutComputer == 1) {
				count1++;
				System.out.println("Tomʤ,ĿǰӮ�Ĵ���Ϊ:" + count1);
			} else if (OutTom == 1 && OutComputer == 2) {
				count1++;
				System.out.println("Tomʤ,ĿǰӮ�Ĵ���Ϊ:" + count1);
			} else if (OutTom == 2 && OutComputer == 0) {
				count1++;
				System.out.println("Tomʤ,ĿǰӮ�Ĵ���Ϊ:" + count1);
			} else if (OutTom == OutComputer) {
				System.out.println("ƽ��");
			}

			else {
				count2++;
				System.out.println("Tom��Ĵ�����" + count2);
			}
		}

	}

}
