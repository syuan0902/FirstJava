package hw01;

public class Refund {

	public static void main(String[] args) {
		int shouldPay = 538; //應付金額
		int realPay = 1000; //實付金額
		int refund = realPay - shouldPay; //找錢
		int money;  //鈔票 or 硬幣
		
		System.out.println("應找" + refund + "元");
		
		if (realPay == shouldPay) { //實付金額 = 應付金額
			System.out.println("不必找錢");
		}
		
		else { //實付金額 != 應付金額
			if (realPay < shouldPay) { //實付金額 < 應付金額
				System.out.println("金額不足");
			}
			else { //實付金額 > 應付金額
				
				if (refund >= 500) {
					money = refund / 500; //找錢 / 500的商數
					refund %= 500; //找錢 / 500的餘數
					System.out.println(money + " 張500元");
				}
				
				if (refund >= 100) {
					money = refund / 100; //(找錢 / 500的餘數) / 100的商數
					refund %= 100; //(找錢 / 500的餘數) / 100的餘數
					System.out.println(money + " 張100元");
				}
				
				if (refund >= 50) {
					money = refund / 50; //((找錢 / 500的餘數) / 100的餘數) / 50的商數
					refund %= 50; // ((找錢 / 500的餘數) / 100的餘數) / 50的餘數
					System.out.println(money + " 個50元");
				}
				
				if (refund >= 10) {
					money = refund / 10; // (((找錢 / 500的餘數) / 100的餘數) / 50的餘數) / 10的商數
					refund %= 10; // (((找錢 / 500的餘數) / 100的餘數) / 50的餘數) / 10的餘數
					System.out.println(money + " 個10元");
				}
				
				if (refund >= 5) {
					money = refund / 5; // ((((找錢 / 500的餘數) / 100的餘數) / 50的餘數) / 10的餘數) / 5的商數
					refund %= 5; // ((((找錢 / 500的餘數) / 100的餘數) / 50的餘數) / 10的餘數) / 5的餘數
					System.out.println(money + " 個5元");
				}
				
				if (refund >= 1) {
					System.out.println(refund + " 個1元");
				}
			}
		}
	}
}
