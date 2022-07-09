package hw02;

public class Stars {
	static void printStar(int starNumber) {
		
	}
	
	public static void main(String[] args) {
		
		//方法一 while 迴圈
//		String star = "";
//		int spawnStarRound = 1; //產生星星的回數
//		while (spawnStarRound <= 5) { //產生星星的回數 <=5
//			spawnStarRound++; //產生星星的回數加1
//		 	star += "*";
//		 	System.out.println(star);		
//		}
		 	
		//方法二 for 迴圈
		String star = "";
		for (int i = 1; i <= 5; i++) { //i = 產生星星的回數
			star += "*";
		 	System.out.println(star);	
		}
	}
}
