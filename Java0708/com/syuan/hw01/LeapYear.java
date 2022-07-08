package com.syuan.hw01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1985; //西元年
		
		if (year % 400 == 0) { //每400年一閏
			System.out.println(year + "年是閏年");
		}
		else if (year % 100 == 0) { //每100年不閏
			System.out.println(year + "年不是閏年");
		}
		else if (year % 4 == 0) { //每4年一閏
			System.out.println(year + "年是閏年");
		}
		else {
			System.out.println(year + "年不是閏年");
		}
	}

}
