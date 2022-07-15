package hw05;

public class SalesPerson extends PermanentStaffs {
	
	//建構子
	public SalesPerson(String name, String gender, String arrivedDate, String phoneNumber, String email) {
		super(name, gender, arrivedDate, phoneNumber, email);
	}
	
	//覆寫月薪方法
	@Override
	public void PrintSalary() {
		int salesBonus = 5000; //銷售獎金
		int salary = BASIC_SALARY + LUNCH_AWOLLANCE + salesBonus;
		System.out.print("當月薪資");
		System.out.println("\t月薪: " + salary + "元 (銷售員)");
		System.out.println();
	}
}
