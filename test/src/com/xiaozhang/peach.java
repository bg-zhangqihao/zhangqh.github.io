package com.xiaozhang;


import java.util.Scanner;




class T{
	//findWay����ר�Ų����Թ���·�����ҵ��˾ͷ���true û���ҵ��ͷ���false
	//mapΪ�Թ�. i��jΪС��λ�ã���ʼ��λ��Ϊ(1,1)  �յ�λ��Ϊ(6��5)
	//map 0������  1���ϰ��� 2Ϊ��������ͨ· 3Ϊ�����߹������߲�ͨ
	//��map[6][5]Ϊ2ʱ�����ݹ飬����ͼ�����
	//��ȷ��С����·�Ĳ��� ��->��->��->��
	public boolean findWay(int map[][], int i, int j) {
		if(map[6][5] == 2) {   //���յ�λ��ֱ�Ӿͷ���True
			return true;
		}else {
			if(map[i][j] == 0) {   //0���������
				map[i][j] = 2;    //�����λ�ÿ�����ͨ
				//ʹ����·���ԣ������Ƿ��������ͨ
				if(findWay(map, i+1, j)) {  //������
					return true;
				}else if(findWay(map, i, j+1)) { //������
					return true;
				}else if(findWay(map, i-1, j)) {  //������
					return true;
				}else if(findWay(map, i, j-1)) {    //������
					return true;
				}else {
					map[i][j] = 3;  //�����߹��߲�ͨ
					return false;
				}
				
			}else {
				return false;   // ֻ����1  3 ����������߲�ͨ�ķ���false,��2���߹���
			}
		}
		
		
	}
}


	
public class peach {
	public static void main(String[] args) {
		System.out.println("=====���õ�ǰ��ͼ���======");
		int map[][] = new int[8][7];
		//map 0�����ϰ�������ߣ� 1�����ϰ��� ,���Թ��ĵ�һ�� ���һ�У� ��һ�У� ���һ�� ����Ϊ1
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(i==0 || i==map.length - 1 || j==0 || j==map[i].length-1 || (i==3&&j==1) || (i==3&&j==2)) {
					map[i][j] = 1; 
				}
			}
			
		}
//		map[2][1] = 1;
		map[2][2] = 1;
//		map[1][2] = 1;
		//�����鿴��ͼ
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		T t1 = new T();
		t1.findWay(map, 1, 1);
		System.out.println("\n====��·�����====");
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
