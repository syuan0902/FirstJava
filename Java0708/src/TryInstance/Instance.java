package TryInstance;

public class Instance {

	// 實例變數
	String accountNo;
	double balance;

	// 建構子, 用來初始化實例變數
	public Instance(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public void printAccData() {
		System.out.println("accountNo = " + accountNo);
		System.out.println("balance " + balance);
	}

	public static void main(String[] args) {
		//Instance 是類別型別 (類別名稱成為型別)
		//a 是區域變數 (參用reference)
		//new 宣告物件的關鍵字 
		//Instance("124654", 50000.0) 用建構子做出來的新物件, 含2個參數
		Instance a = new Instance("124654", 50000.0);
		//透過區域變數取得建構子的方法
		a.printAccData();
	}
}
