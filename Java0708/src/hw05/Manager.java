<<<<<<< HEAD
package hw05;

public class Manager extends PermanentStaffs {

	//常數
	public static final int TRANSPORTATION_AWOLLANCE = 3000;
	
	//建構子
	public Manager(String name, String gender, String arrivedDate, String phoneNumber, String email) {
		super(name, gender, arrivedDate, phoneNumber, email);	
	}
	
	//覆寫月薪方法
	@Override
	public void PrintSalary() {
		int performanceBonus = 10000;
		int salary = BASIC_SALARY + LUNCH_AWOLLANCE + performanceBonus + TRANSPORTATION_AWOLLANCE;
		System.out.print("當月薪資");
		System.out.println("\t月薪: " + salary + "元 (主管)");
		System.out.println();
	}
}
=======
package hw05;

public class Manager {

}
>>>>>>> branch 'master' of git@github.com:syuan0902/FirstJava.git
