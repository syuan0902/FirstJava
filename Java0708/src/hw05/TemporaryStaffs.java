package hw05;

public class TemporaryStaffs extends Staffs {
	
	//常數
	public static final int HOURLY_WAGE = 168 ;
	
	//建構子
	public TemporaryStaffs(String name, String gender, String arrivedDate, String phoneNumber, String email) {
		super(name, gender, arrivedDate, phoneNumber, email);
		
	}
	
	//實作臨時員工時薪方法
	@Override
	public void PrintSalary() {
		int workHour = 120;
		int salary = workHour * HOURLY_WAGE;
		System.out.print("當月薪資");
		System.out.println("\t薪資: " + salary + "元 (臨時員工)");
		System.out.println();
	}
}
