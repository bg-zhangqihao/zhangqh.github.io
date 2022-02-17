package com.xiaoming;

import java.util.Scanner;

public class FBI {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		String s = myScanner.next();
		PostOrder(0, s.length() - 1, s);
	}

	public static void PostOrder(int l, int r, String s) {
		int mid = (l + r) / 2; // 获取中间部分
		if (l != r) {
			PostOrder(l, mid, s);
			PostOrder(mid + 1, r, s);
		}
	

	int flag1 = 0, flag2 = 0;
	for(int i=l; i<=r; i++) {
		if(s.charAt(i) =='0')flag1=1;
		if(s.charAt(i) =='1')flag2=1;
	}
	if(flag1==1&&flag2==0)System.out.print("B");
	if(flag1==0&&flag2==1)System.out.print("I");
	if(flag1==1&&flag2==1)System.out.print("F");
	}
}
