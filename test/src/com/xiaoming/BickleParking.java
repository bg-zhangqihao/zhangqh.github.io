package com.xiaoming;

import java.util.Scanner;

public class BickleParking {
	public static void main(String[] args) {
		doublelink local[] = new doublelink[10000];
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt(); // �м�����
		int num = myScanner.nextInt(); // ��һ�������

		doublelink frist = new doublelink(); // ��ͷ������frist
		frist.data = num;
		frist.prior = null;
		frist.next = null;

		local[num] = frist; // ��ͷ����ַ��local
		
		for (int i = 1; i < n; i++) {
			int x = myScanner.nextInt();
			int y = myScanner.nextInt();
			int z = myScanner.nextInt();
			doublelink xx = new doublelink(); // xx��doublelink���͵ĵ�ַ
			xx.data = x;
			local[x] = xx;

			doublelink yy = new doublelink(); // yy��doublelink���͵ĵ�ַ
			yy = local[y]; // local[y] ��null
			
			if (z == 0) {  //��x����y��ǰ��
				xx.next = yy;
				if(yy.prior != null) {  //y����ͷ���
					xx.prior = yy.prior;
					yy.prior.next =xx;
				}else {
					xx.prior = null;
				}
				yy.prior = xx;
			}
			if(z==1) {   //��y����x��ǰ��
				xx.prior = yy;
				if(yy.next != null) {
					xx.next = yy.next;
					yy.next.prior = xx;
					
				}else {
					xx.next = null;
				}
				yy.next = xx;
				
			}
			
		}
		while(frist != null) {
			System.out.println(frist.data + " ");
			frist = frist.next;
		}
	}
}

class doublelink {
	int data;
	doublelink prior, next;

	public doublelink() {

	}

	public doublelink(int data, doublelink prior, doublelink next) {
		super();
		this.data = data;
		this.prior = prior;
		this.next = next;
	}

}