package com.syuan.hw01;

public class Electricity {
	static int tatalUsePowr = 1500; //總用電量
	static boolean commercialPower = false; //是否為營業用電
	static double electricityBill; //電費
	
	public static void main(String[] args) {
		
		if (commercialPower == true) { //營業用電
			CommercialPowerBill();
			System.out.println("Your electricity bill is " + (int)electricityBill + " dollars.");
		}
		
		else { //非營業用電
			NonCommercialPowerBill();
			System.out.println("Your electricity bill is " + (int)electricityBill + " dollars.");
		}
	}

	static void CommercialPowerBill() { //營業用電電費
		int usePowerA = 330 , usePowerB = 700, usePowerC = 1500;
		final double rateA = 2.12, rateB = 2.91, rateC = 3.44, rateD = 5.05; 
		
		if (tatalUsePowr <= usePowerA) { // 總用電量 <= 330度
			electricityBill = tatalUsePowr * rateA;
		}
		else { // 總用電量 > 330度
			if(tatalUsePowr <= usePowerB) { // 總用電量 <= 700度
				electricityBill = (usePowerA * rateA) + 
								(tatalUsePowr - usePowerA) * rateB;
			}
			else { // 總用電量 > 700度
				if(tatalUsePowr <= usePowerC) { // 總用電量 <= 1500度
					electricityBill = (usePowerA * rateA) + 
									(usePowerB - usePowerA) * rateB +
									(tatalUsePowr - usePowerB) * rateC;
				}
				else { // 總用電量 > 1500度
					electricityBill = (usePowerA * rateA) + 
							(usePowerB - usePowerA) * rateB +
							(usePowerC - usePowerB) * rateC +
							(tatalUsePowr - usePowerC) * rateD;	
				}
			}
		}	
	}
	
	static void NonCommercialPowerBill() { //非營業用電電費
		int usePower1 = 120 , usePower2 = 330, usePower3 = 500, usePower4 = 700 ,usePower5 = 1000;	
		final double rate1 = 1.63, rate2 = 2.1, rate3 = 2.89, rate4 = 3.94, rate5 = 4.6, rate6 = 5.03; 
		
		if (tatalUsePowr <= usePower1) { // 總用電量 <= 120度
			electricityBill = tatalUsePowr * rate1;
		}
		else if (tatalUsePowr > usePower1 && tatalUsePowr <= usePower2) { // 120 < 總用電量 <= 330度
			electricityBill = (usePower1 * rate1) + 
							(tatalUsePowr - usePower1) * rate2;
		}
		else if (tatalUsePowr > usePower2 && tatalUsePowr <= usePower3) { // 330 < 總用電量 <= 500度
			electricityBill = (usePower1 * rate1) + 
					(usePower2 - usePower1) * rate2 +
					(tatalUsePowr - usePower2) * rate3;
		}
		else if (tatalUsePowr > usePower3 && tatalUsePowr <= usePower4) { // 500 < 總用電量 <= 700度
			electricityBill = (usePower1 * rate1) + 
					(usePower2 - usePower1) * rate2 +
					(usePower3 - usePower2) * rate3 +
					(tatalUsePowr - usePower3) * rate4;
		}
		else if (tatalUsePowr > usePower4 && tatalUsePowr <= usePower5) { // 700 < 總用電量 <= 1000度
			electricityBill = (usePower1 * rate1) + 
					(usePower2 - usePower1) * rate2 +
					(usePower3 - usePower2) * rate3 +
					(usePower4 - usePower3) * rate4 +
					(tatalUsePowr - usePower4) * rate5;
		}
		else { // 總用電量 > 1000度
			electricityBill = (usePower1 * rate1) + 
					(usePower2 - usePower1) * rate2 +
					(usePower3 - usePower2) * rate3 +
					(usePower4 - usePower3) * rate4 +
					(usePower5 - usePower4) * rate5 +
					(tatalUsePowr - usePower5) * rate6;
		}
	}	
}
