package hw02;

public class Prime {

	public static void main(String[] args) {
		
		int number = 100;
		System.out.print(number + " 以內的質數有: ");
		
		for (int i = 2; i <= number; i++) { //循環2-number
			
			int j = 2;
			while (i % j != 0) { //當j是i的因數,跳出迴圈
				j++;
			}	
			
			if(j == i) { //當j = i, 打印訊息
				System.out.print(i + ", ");
			}
		}			
	}
}
