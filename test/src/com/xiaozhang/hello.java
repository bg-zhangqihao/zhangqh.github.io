package com.xiaozhang;
import java.util.Scanner;







/**
 * @author zhang
 * @version 1.2
 * 
 * */
public class hello {

	public static void main(String[] args) {
	
	for(int i=1; i<=5; i++) { //控制打印的行数
		
			for(int m=5-i; m>0;m--) {  //控制每行空格数，第一行空4格，最后一行空0格
				System.out.print(" ");
			}
				
		for(int j=1; j<=2*i-1; j++) {   //控制每一行打几个*
			
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
	

		




