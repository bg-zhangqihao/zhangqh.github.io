package com.xiaozhang;
import java.util.Scanner;







/**
 * @author zhang
 * @version 1.2
 * 
 * */
public class hello {

	public static void main(String[] args) {
	
	for(int i=1; i<=5; i++) { //���ƴ�ӡ������
		
			for(int m=5-i; m>0;m--) {  //����ÿ�пո�������һ�п�4�����һ�п�0��
				System.out.print(" ");
			}
				
		for(int j=1; j<=2*i-1; j++) {   //����ÿһ�д򼸸�*
			
			if(j==1 || j==2*i-1 ||i==5) {
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
			
		System.out.print("\n");
		
		}
	
    
	
	
	}
		
	
}
	

		




