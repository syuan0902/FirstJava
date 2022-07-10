package hw02;

public class Interest {

	public static void main(String[] args) {
		int year = 1;
		double sum1 = 0, sum2 = 0;
		
		while (year >=1) {
			sum1 = 100000 * ( 1 + (0.1 * year)); //柯南的存款(單利)
			sum2 = 100000 * Math.pow(1+0.05, year); //小蘭的存款(複利)
			
			if (sum2 > sum1) { //當小蘭的存款大於柯南的存款
				System.out.println("到了第 " + year + " 年, 小蘭的存款會大於柯南的存款");
				break;
			}
			year++; //加1年
		}
	}
}
