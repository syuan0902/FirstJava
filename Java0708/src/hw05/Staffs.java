package hw05;

//抽象類別
public abstract class Staffs {
	
	//類別變數
	private String name;	
	private String gender;
	private String arrivedDate; //到職日
	private String phoneNumber;
	private String email;

	//建構子
	public Staffs(String name, String gender, String arrivedDate, String phoneNumber, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.arrivedDate = arrivedDate;
		this.phoneNumber = phoneNumber;
		this.email = email;
		PrintBasicInformation( );
		PrintSalary( );
	}
	
	//基本資料
	public void PrintBasicInformation() {
		System.out.print("基本資料\t");
		System.out.print("姓名: " + name + ", ");
		System.out.print("性別: " + gender + ", ");
		System.out.println("到職日: " + arrivedDate + ", ");
		System.out.print("\t電話: " + phoneNumber + ", ");
		System.out.println("email: " + email);
	};
	
	//宣告月薪方法
	public abstract void PrintSalary( );
	
	//封裝
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getArrivedDate() {
		return arrivedDate;
	}
	
	public void setArrivedDate(String arrivedDate) {
		this.arrivedDate = arrivedDate;
	}
}
