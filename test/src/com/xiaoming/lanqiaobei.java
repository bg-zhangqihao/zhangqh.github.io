package com.xiaoming;

public class lanqiaobei {
	public static void main(String[] args) {

		int count = 0; // ��¼1�ĸ���
		int card = 2021; // ��Ƭ�ĸ�������card - countС�ڵ���0�˳�����
		int i = 1;
		
		while (true) {
			int m = i;
			//m����ǰ��
			//while(m>0)���㵱ǰ������1�ĸ���
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
