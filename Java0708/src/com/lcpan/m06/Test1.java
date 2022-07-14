package com.lcpan.m06;

public class Test1 {

	public static void main(String[] args) {
		//建立父物件並用參數傳值給變數 Parent1(10)
		Parent1 parent = new Parent1(10);
		//使用父物件的printData()方法
		parent.printData();
		
		//方法一: 建立子物件並用參數傳值給變數 Child1(11, 22)
		Child1 child = new Child1(11, 22);
		//使用子物件的printData()方法
		child.printData();
		
		//方法二: 建立不含參數的子物件
		Child1 c1 = new Child1();
		//透過setter設定子物件的變數值
		c1.setField1(100);
		c1.setField2(200);
		//使用子物件的printData()方法
		c1.printData();
	}
}
