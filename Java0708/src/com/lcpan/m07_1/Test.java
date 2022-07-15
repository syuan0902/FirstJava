package com.lcpan.m07_1;

public class Test {

	public static void main(String[] args) {
		//A是抽象類別, 不能產生物件 (不能new)
		//B類別是A類別的子類別, 可以讓A類別的參用a指向B類別產生的物件 (多型)
		A a = new B();
		a.m1();
		a.m2();

	}

}
