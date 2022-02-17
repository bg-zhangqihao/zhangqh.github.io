package com.xiaoming;

class sub extends Base{
	public sub() {
		System.out.println("子类sub()构造器被调用...");
	}
	public sub(String name) {
		super("jack");
		System.out.println("子类sub有参构造器被调用");
	}
	public void sayOk() {

		
	}
}
