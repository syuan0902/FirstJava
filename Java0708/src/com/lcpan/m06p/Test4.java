package com.lcpan.m06p;

public class Test4 {

	public static void main(String[] args) {
		Point1 p1 = new Point1(10, 10);
		Point1 p2 = new Point1(10, 10);
		System.out.println(p1.equals(p2));
		System.out.println("p1的類別全名@hash code是 " + p1);
		System.out.println(p1.toString());
		
		//point2 overrided toString方法
		Point2 p3 = new Point2(10, 10);
		Point2 p4 = new Point2(10, 10);
		System.out.println(p3.equals(p4));
		System.out.println(p3);
	}

}
