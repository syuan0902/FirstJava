package hw03;

public class MaxMin {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 74, 4, -5, 2, 20, 6, -85};
		
		int maxNumber = numbers[0], minNumber = numbers[0];
		
		//For-each迴圈
		for (int i: numbers) {
			if (i > maxNumber) { //如果i大於maxNumber
				maxNumber = i; //c
			}
		}
		System.out.println("numbers矩陣中, 最大的數字是 " + maxNumber);
		
		for (int j: numbers) {
			if (j < minNumber) { //如果j小於minNumber
				minNumber = j; //將j指派給minNumber
			}
		}
		System.out.println("numbers矩陣中, 最小的數字是 " + minNumber);
	}
}
