package com.xiaozhang;




public class HanoiTower {
	public static void main(String []  arg) {
		
	
		U t1 = new U();
		t1.move(2,'A', 'B', 'C');
	}
}

class U{
	public void move(int Num, char a, char b, char c) {
		if(Num == 1) {
			System.out.println(a+"->"+ c);
		}else {
			
			move(Num-1, a, c,b);  //当盘为两个时 ,把除最后一个盘，其余的都放到b盘，借助c盘

			//这时只剩最后一个大盘从a放到c上
			System.out.println(a+"->" + c);
			move(Num-1, b, a, c);   //把合起来的一堆从b盘移动到c盘，借助a盘

		}
		
	}
}
