package com.xiaozhang;


import java.util.Scanner;




class T{
	//findWay方法专门查找迷宫的路径，找到了就返回true 没有找到就返回false
	//map为迷宫. i和j为小球位置，初始化位置为(1,1)  终点位置为(6，5)
	//map 0可以走  1有障碍物 2为可以走是通路 3为曾经走过，但走不通
	//当map[6][5]为2时结束递归，否则就继续找
	//先确定小球找路的策略 下->右->上->左
	public boolean findWay(int map[][], int i, int j) {
		if(map[6][5] == 2) {   //在终点位置直接就返回True
			return true;
		}else {
			if(map[i][j] == 0) {   //0代表可以走
				map[i][j] = 2;    //假设此位置可以走通
				//使用找路策略，看看是否真的能走通
				if(findWay(map, i+1, j)) {  //往下走
					return true;
				}else if(findWay(map, i, j+1)) { //往右走
					return true;
				}else if(findWay(map, i-1, j)) {  //往上走
					return true;
				}else if(findWay(map, i, j-1)) {    //往左走
					return true;
				}else {
					map[i][j] = 3;  //尝试走过走不通
					return false;
				}
				
			}else {
				return false;   // 只能是1  3 两种情况是走不通的返回false,但2是走过了
			}
		}
		
		
	}
}


	
public class peach {
	public static void main(String[] args) {
		System.out.println("=====设置当前地图情况======");
		int map[][] = new int[8][7];
		//map 0是无障碍物可以走， 1是有障碍物 ,将迷宫的第一行 最后一行， 第一列， 最后一列 设置为1
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
		//遍历查看地图
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		T t1 = new T();
		t1.findWay(map, 1, 1);
		System.out.println("\n====找路的情况====");
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
