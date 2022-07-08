package com.syuan.hw02;

public class Expression {

	public static void main(String[] args) {
		
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 49; i += 2) {
			sum1 += i * i; 
			//System.out.println("總和為 " + sum1);
		}
		for (int j = 2; j <= 50; j += 2) {
			sum2 += j * j;  
			//System.out.println("總和為 " + sum2);
		}
		System.out.println("總和為 " + (sum1 - sum2));
	}
}
