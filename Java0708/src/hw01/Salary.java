package hw01;

public class Salary {

	public static void main(String[] args) {

		int workingHours = 80; //總工時
		double salary; //薪資
		int baseMoney = 150; //基本時薪
		final double RATE1 = 1.25 , RATE2 = 1.5; //加薪倍率
		int workTime1 = 60 , workTime2 = 80; //工時區間
		
		// 方法一
		if (workingHours <= workTime1) { //總工時 <= 60
			salary = workingHours * baseMoney;
		} 
		else if (workingHours > workTime1 && workingHours <= workTime2) { // 60 < 總工時 <= 80
			salary = (workTime1 * baseMoney) + 
					(workingHours - workTime1) * baseMoney * RATE1;
		} 
		else { // 總工時 > 80
			salary = (workTime1 * baseMoney) + 
					((workTime2-workTime1) * baseMoney * RATE1) + 
					(workingHours - workTime2) * baseMoney * RATE2;
		}
		System.out.println("Your salary is " + (int) salary + " dollars.");

		// 方法二
		if (workingHours <= workTime1) { //總工時 <= 60
			salary = workingHours * baseMoney;
		}
		else { //總工時 > 60
			if (workingHours <= workTime2){ //總工時 <= 80
				salary = (workTime1 * baseMoney) + 
						(workingHours - workTime1) * baseMoney * RATE1;
			}
			else { //總工時 > 80
					salary = (workTime1 * baseMoney) + 
							((workTime2-workTime1) * baseMoney * RATE1) + 
							(workingHours - workTime2) * baseMoney * RATE2;
			}
		}
		System.out.println("Your salary is " + (int) salary + " dollars.");	
	}			
}
