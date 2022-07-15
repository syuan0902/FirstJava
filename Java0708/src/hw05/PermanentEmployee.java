package hw05;

import java.util.Calendar;

public abstract class PermanentEmployee extends Staff {
	private int basicSalary;
	public static int LUNCH_ALLOWANCE = 3000;
	
	public PermanentEmployee(String name, int gender, Calendar arrivedDate, int phoneNumber, String email) {
		super(name, gender, arrivedDate, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
	
}
