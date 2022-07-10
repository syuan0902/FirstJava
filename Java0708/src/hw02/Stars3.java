package hw02;

public class Stars3 {

	public static void main(String[] args) {
		int n = 5; //列數
		
		for(int i = 1; i <= n; i++) { //分列
			for (int j = n; j > i; j--) { //空白數
				System.out.print(" ");
			}
			for (int k = 1; k < i*2; k++) { //星星數
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
