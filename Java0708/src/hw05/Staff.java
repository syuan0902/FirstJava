package hw05;

import java.util.Calendar;

public abstract class Staff {
	//成員變數
	private String name;
	private int gender;
	private Calendar arrivedDate;
	private int phoneNumber;
	private String email;

	//建構子
	public Staff(String name, int gender, Calendar arrivedDate, int phoneNumber, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.arrivedDate = arrivedDate;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// 封裝
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Calendar getArrivedDate() {
		return arrivedDate;
	}

	public void setArrivedDate(Calendar arrivedDate) {
		this.arrivedDate = arrivedDate;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 方法
	public abstract void CalculateSalary();

}
