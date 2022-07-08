package com.syuan.hw02;

public class Factor {

	public static void main(String[] args) {
		int number = 36;
		System.out.print(number + " 的因數為 ");
		
		for (int i = 1; i <= number ; i++) {
			if (number % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
