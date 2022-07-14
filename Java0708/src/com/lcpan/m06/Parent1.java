package com.lcpan.m06;

public class Parent1 {
	//成員變數field1
	private int field1;
	
	//沒參數的建構子
	public Parent1() {
	}
	
	//建構子
	public Parent1(int field1) {
		this.field1 = field1;
	}
	//getter 取得成員變數field1
	public int getField1() {
		return field1;
	}
	//setter 設定成員變數field1
	public void setField1(int field1) {
		this.field1 = field1;
	}
	//printData()方法
	public void printData() {
		System.out.println("field1 : " + field1);
	}

}
