package hw02;

public class Rabbit {

	public static void main(String[] args) {
		
		int rabbitAmount = 1; //兔子數量
		
		while (rabbitAmount != 0) { //當兔子數量不等於0
			rabbitAmount++; //兔子數量加1
			
			if(rabbitAmount%3 == 1) { //兔子數量除以3的餘數為1
				
				if(rabbitAmount%5 == 3) { //兔子數量除以5的餘數為3
					
					if(rabbitAmount % 7 == 2) {	//兔子數量除以7的餘數為2
						break; //滿足條件就離開迴圈
					}
				}
			}
		}
		System.out.println("最少有" + rabbitAmount + "隻兔子");
	}

}
