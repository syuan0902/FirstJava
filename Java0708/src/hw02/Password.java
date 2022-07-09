package hw02;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int InputTimes = 0; //輸入次數
		int limitTimes = 3; //輸入次數上限
		int password = 9527; //密碼
		
		do {
			InputTimes++; //輸入次數加1
			System.out.println("請輸入四位數密碼");
			int customerInput = scanner.nextInt(); //讀取客戶輸入
			
				if(customerInput == password) { //客戶輸入正確
					System.out.println("密碼輸入正確, 歡迎使用本系統!");
					break;
				}
				else { //客戶輸入錯誤
					if(InputTimes < limitTimes) { //客戶輸入次數小於輸入次數上限
						System.out.println("密碼輸入錯誤, 請重新輸入密碼\n");
					}
					else { //客戶輸入次數大於等於輸入次數上限
						System.out.println("密碼輸入錯誤已達三次! 卡片沒收 : )");
					}
				}	
		} while (InputTimes != limitTimes); //輸入不等於輸入次數上限
		scanner.close();
	}
}
