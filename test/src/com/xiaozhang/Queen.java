package com.xiaozhang;



public class Queen {
	int max = 8;
	int arr[] = new int[max];
	static int count = 0;  //用来计数摆放皇后的次数
	//主函数入口
	public static void main(String[] args) {
		Queen queen= new Queen();
		queen.check(0);
		System.out.println("一共有"+ count +"种解法");
	}



	public void check(int n){
		if(n == max) {
			showanswer();
			return;
		}
		for(int i=0; i < max; i++) {  
			arr[n] = i;  //先把新皇后的摆放到第一列 ，count+1以后，这里的i也就随之+1
			
			if(backTrack(n) ) {
				check(n + 1);
				
			}
			////每次检测摆放皇后位置不符合规则，那么就不断的往第二列，第三列...
		}
	}

	
	private boolean backTrack(int n) {
		for(int i=0; i<n; i++) {   
		//n是新摆放皇后的位置， 与 之前成功摆放的检测 是否在同一列 或者在同一个斜线上
		//arr[n] == arr[i];  是否在同一列
		//Math.abs(n-i) == arr[n] - arr[i];
		if(arr[n] == arr[i] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
			return false;
		}
			
		}
		return true;
	}
	
	public void showanswer() {
		count++ ;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + 1 + " ");
		}
		System.out.println();
	}
}
