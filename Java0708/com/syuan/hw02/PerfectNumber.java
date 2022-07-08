package com.syuan.hw02;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 100;
		System.out.print("100以內的完美數有: ");
		for (int i = 2; i < number; i++) { //i的迴圈條件
			int sum = 0; 
			
			for (int j = 1; j < i; j++) { //j的迴圈條件
				if (i % j == 0) { //如果j是i的因數
					sum += j; //累加j
				}
			}
			
			if (sum == i) { //如果j的和等於i
				System.out.print(i + ", ");
			}
		}
	}
}
