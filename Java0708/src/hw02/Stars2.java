package hw02;

public class Stars2 {

	public static void main(String[] args) {
		
		//方法一
//		int sum = 5 ; //總列數
//		
//		for (int i = 0; i <= sum; i++) { //列數
//			for(int j = 1; j <= i; j++) { //空白數
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= sum-i; k++) { //星星數
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//方法二
		
		int n = 5; //列數
		
		for (int i = 1; i <=n; i++) { //分列
			for (int j = 1; j < i; j ++) { //空白數
				System.out.print(" ");
			}
			
			for (int k = 1; k <= (n-i)+1; k++) { //星星數	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}