package hw05;

public class Test {

	public static void main(String[] args) {
		
		Staffs[] staff = { new BasicStaffs("騙人布", "男", "1984-11-11", "0972-111111", "pupu11@gmail.com"),
				new Manager("娜美", "女", "1987-08-08", "0917-888888", "nami11@icloud.com"),
				new SalesPerson("香吉士", "男", "1985-09-02", "0988-777777", "sunkist92@icloud.com"),
				new TemporaryStaffs("喬巴", "無", "2022-07-15", "0956-222222", "choupa520@hotmail.com")
		};
		
		for (Staffs eachStaff : staff) {} 
	}

}
