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
			
			move(Num-1, a, c,b);  //����Ϊ����ʱ ,�ѳ����һ���̣�����Ķ��ŵ�b�̣�����c��

			//��ʱֻʣ���һ�����̴�a�ŵ�c��
			System.out.println(a+"->" + c);
			move(Num-1, b, a, c);   //�Ѻ�������һ�Ѵ�b���ƶ���c�̣�����a��

		}
		
	}
}
