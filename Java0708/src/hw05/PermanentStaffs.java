package hw05;

//抽象類別
public abstract class PermanentStaffs extends Staffs {
	
	//常數
	public static final int BASIC_SALARY = 25250; //本薪
	public static final int LUNCH_AWOLLANCE = 2400; //午餐津貼
	
	//建構子
	public PermanentStaffs(String name, String gender, String arrivedDate, String phoneNumber, String email) {
		super(name, gender, arrivedDate, phoneNumber, email);	
	}

	//永久員工月薪方法
	public void PrintSalary() {
		int salary = BASIC_SALARY + LUNCH_AWOLLANCE;
		System.out.print("當月薪資");
		System.out.println("\t月薪: " + salary + "元 (一般職員)");
		System.out.println();
	};
}
