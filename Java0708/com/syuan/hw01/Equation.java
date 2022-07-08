package com.syuan.hw01;

public class Equation {

	public static void main(String[] args) {
		int a = 9 , b = 8, c = 7; //任意三值
		int x = 0;
		int ans;
		//int count = a * x * x + b * x + c = 0;
		
		ans = (b * b) - 4 * a * c;
		
		if (ans > 0) { //有兩個不相等的實根
			System.out.println(x);
		}
		
		else if (ans == 0) { //有兩個相等的實根
			System.out.println(x);
		}
		
		else { //沒有實根
			System.out.println("沒有實根");
		}

	}

}
