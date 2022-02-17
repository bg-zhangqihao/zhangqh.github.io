package com.xiaoming;

import java.util.Scanner;

public class BickleParking {
	public static void main(String[] args) {
		doublelink local[] = new doublelink[10000];
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt(); // 有几辆车
		int num = myScanner.nextInt(); // 第一辆车编号

		doublelink frist = new doublelink(); // 把头结点设成frist
		frist.data = num;
		frist.prior = null;
		frist.next = null;

		local[num] = frist; // 把头结点地址给local
		
		for (int i = 1; i < n; i++) {
			int x = myScanner.nextInt();
			int y = myScanner.nextInt();
			int z = myScanner.nextInt();
			doublelink xx = new doublelink(); // xx是doublelink类型的地址
			xx.data = x;
			local[x] = xx;

			doublelink yy = new doublelink(); // yy是doublelink类型的地址
			yy = local[y]; // local[y] 是null
			
			if (z == 0) {  //把x插在y的前面
				xx.next = yy;
				if(yy.prior != null) {  //y不是头结点
					xx.prior = yy.prior;
					yy.prior.next =xx;
				}else {
					xx.prior = null;
				}
				yy.prior = xx;
			}
			if(z==1) {   //把y插在x的前面
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