package com.lcpan.mo6_1;

public class C  extends B {
	private int c;
	
	public C(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	public void print() {
		super.print();
		System.out.println("c = " + c);
	}

}
