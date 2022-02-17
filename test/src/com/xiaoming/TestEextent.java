package com.xiaoming;


public class TestEextent {
	public static void main(String[] args) {
//		PC pc= new PC("a", "b", "c", "d");
//		NotePad np= new NotePad("e", "f", "g", "h");
//		
//		pc.print_info();
//		np.print_info();
		int m = -1;
		int n = 3;
		System.out.println(4 % 6);
			
			
		
		
	}
}



class Computer {
	private String CPU;
	private String memory;
	String disk;
//	public Computer(String CPU, String memory, String disk) {
//		this.CPU = CPU;
//		this.memory = memory;
//		this.disk = disk;
//	}
	
	
	public String getDetail() {
		
		return CPU + "" + memory + "" + disk   ;
	}
}

//class PC extends Computer {
//
//	String brand;
//
//	public PC(String CPU, String memory, String disk, String brand) {
//		super(CPU, memory, disk);
//		this.brand = brand;
//	}
//	public void print_info() {
//		System.out.println(getDetail() + "brand" + brand);
//	}
//	
//}
//
//class NotePad extends Computer{
//	String color;
//	public NotePad(String CPU, String memory, String disk, String color) {
//		super(CPU, memory, disk);
//		this.color = color;
//	}
//	public void print_info() {
//		System.out.println(getDetail() + "color" + color);
//	}
	
//}
