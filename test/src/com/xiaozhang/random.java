package com.xiaozhang;
import java.util.Scanner;

import java.util.List;










public class random {
		public static void main(String [] args) {
		
			Scanner myScanner  = new Scanner(System.in);
			
			int array1[] = {0, 1, 2};
			
			
		do {
		
		int arrNew[] = new int[array1.length + 1];  //ÿ��ѭ��������һ��
		
		for(int i=0 ; i<array1.length; i++) {   //ԭ���������Ԫ�ظ�ֵ���µ�����
			arrNew[i] = array1[i]; 
		}
		
		System.out.println("����Ҫ�����Ԫ��:");
		int s1 = myScanner.nextInt(); 
		arrNew[arrNew.length-1] = s1;
		array1 = arrNew;  
		for(int i=0 ; i<arrNew.length; i++) {   //ѭ����ӡ����
			System.out.print( "���ݺ��Ԫ��" );
			System.out.print( array1[i] );
		}
		
		System.out.println("�Ƿ������� y/n��");
		char s = myScanner.next().charAt(0); 
		
		if(s=='n') {
			System.out.println("�˳�");
			
			
			 break;
		}
		
		}while(true);
		
		
		
	}
}
