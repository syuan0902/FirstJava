package com.lcpan.m06;

public class Child1 extends Parent1 {
	//成員變數field2
	private int field2;
	
	//建構子, 會自動補父物件的建構子 super();
	public Child1() {
	}
	
	//建構子
	public Child1(int field1, int field2) {
		//呼叫父物件的建構子 (要放在第一個敘述)
		super(field1);
		this.field2 = field2;	
	}
	//getter 取得成員變數field2
	public int getField2() {
		return field2;
	}
	//setter 設定成員變數field2
	public void setField2(int field2) {
		this.field2 = field2;
	}
	
	//與父物件的方法同名, overwrite
	public void printData() {
		//使用父物件的方法 super.方法
		super.printData();
		System.out.println("field2 : " + field2);
	}
}
