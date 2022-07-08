package com.syuan.hw01;

public class Season {
	
	public static void main(String[] args) {
		int month = 8; //月份
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("This is Winter."); //12-2月
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("This is Spring."); //3-5月
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("This is Summer."); //6-8月
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("This is Fall."); //9-11月
				break;
			default: 
				System.out.println("Please enter a valid number."); //非1-12月
				break;
		}
	}
}
                                      