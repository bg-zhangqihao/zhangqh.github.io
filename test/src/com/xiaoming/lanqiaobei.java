package com.xiaoming;

public class lanqiaobei {
	public static void main(String[] args) {

		int count = 0; // 记录1的个数
		int card = 2021; // 卡片的个数，当card - count小于等于0退出程序
		int i = 1;
		
		while (true) {
			int m = i;
			//m代表当前数
			//while(m>0)计算当前数包含1的个数
			while (m > 0) {
				if (m % 10 == 1) {
					count++;
				}
				m = m/10;
			}
			
			if(card-count<=0) {
				break;
			}
			i++; 
		}
		System.out.println(i);
	}
}
