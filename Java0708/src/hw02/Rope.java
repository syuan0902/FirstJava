package hw02;

public class Rope {

	public static void main(String[] args) {
		int day = 0; //天數
		double ropeLong = 3000; //繩長

		while (ropeLong >= 5) {
			day++; //加一天
			ropeLong /= 2; //繩長減一半
			
		}
		System.out.println("到了第 " + day + "天, 繩子的長度才會小於5公尺");
	}

}
