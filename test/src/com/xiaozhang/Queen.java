package com.xiaozhang;



public class Queen {
	int max = 8;
	int arr[] = new int[max];
	static int count = 0;  //���������ڷŻʺ�Ĵ���
	//���������
	public static void main(String[] args) {
		Queen queen= new Queen();
		queen.check(0);
		System.out.println("һ����"+ count +"�ֽⷨ");
	}



	public void check(int n){
		if(n == max) {
			showanswer();
			return;
		}
		for(int i=0; i < max; i++) {  
			arr[n] = i;  //�Ȱ��»ʺ�İڷŵ���һ�� ��count+1�Ժ������iҲ����֮+1
			
			if(backTrack(n) ) {
				check(n + 1);
				
			}
			////ÿ�μ��ڷŻʺ�λ�ò����Ϲ�����ô�Ͳ��ϵ����ڶ��У�������...
		}
	}

	
	private boolean backTrack(int n) {
		for(int i=0; i<n; i++) {   
		//n���°ڷŻʺ��λ�ã� �� ֮ǰ�ɹ��ڷŵļ�� �Ƿ���ͬһ�� ������ͬһ��б����
		//arr[n] == arr[i];  �Ƿ���ͬһ��
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
