package com.lcpan.mo6_1;

public class B extends A {
	private int b;
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void print() {
		super.print();
		System.out.println("b = " + b);
		
	}

	
	
	

}
