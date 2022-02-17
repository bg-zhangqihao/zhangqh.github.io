package com.xiaozhang;
import java.util.Scanner;

import java.util.List;










public class random {
		public static void main(String [] args) {
		
			Scanner myScanner  = new Scanner(System.in);
			
			int array1[] = {0, 1, 2};
			
			
		do {
		
		int arrNew[] = new int[array1.length + 1];  //每次循环都扩容一次
		
		for(int i=0 ; i<array1.length; i++) {   //原来数组里的元素赋值给新的数组
			arrNew[i] = array1[i]; 
		}
		
		System.out.println("输入要插入的元素:");
		int s1 = myScanner.nextInt(); 
		arrNew[arrNew.length-1] = s1;
		array1 = arrNew;  
		for(int i=0 ; i<arrNew.length; i++) {   //循环打印数组
			System.out.print( "扩容后的元素" );
			System.out.print( array1[i] );
		}
		
		System.out.println("是否继续添加 y/n：");
		char s = myScanner.next().charAt(0); 
		
		if(s=='n') {
			System.out.println("退出");
			
			
			 break;
		}
		
		}while(true);
		
		
		
	}
}
