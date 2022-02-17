package com.xiaoming;

public class Base {
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	public Base(){
		System.out.println("父类Base()被调用.....");	
	}
	public Base(String name){
		System.out.println("指定一个参数的父类构造器");
	}
	public int getN4() {
		return n4;
	}
	public void test100(){
		System.out.println("test100");
	}
	protected void test200() {
		System.out.println("test200");
	}
	void test300() {
		System.out.println("test300");
	}
	private void test400() {
		System.out.println("test400");
	}
	public void calltest400() {
		test400();
	}
}


