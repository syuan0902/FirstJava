package TryArray;

public class OneDimArray {
	public static void main(String[] args) {
		
		//宣告一個資料型別為int的x陣列, 新增5個儲存int資料的空間
//		int[] x = new int[5]; 
//		
//		System.out.println("此陣列有 " + x.length + "個儲存int資料的空間");
//		
//		System.out.println("x矩陣第一個空間的值是 " + x[0]); //索引值從0開始
//		System.out.println("x矩陣第二個空間的值是 " + x[1]); //預設初值為0
//		System.out.println("x矩陣第三個空間的值是 " + x[2]);
//		System.out.println("x矩陣第四個空間的值是 " + x[3]);
//		System.out.println("x矩陣第五個空間的值是 " + x[4]);
//		System.out.println("x矩陣第六個空間的值是 " + x[5]); //超出陣列範圍
		
		//賦值1
//		int[] y = new int[] {1, 2, 3, 4, 5};
//		
//		System.out.println("y矩陣第一個空間的值是 " + y[0]); 
//		System.out.println("y矩陣第二個空間的值是 " + y[1]);
//		System.out.println("y矩陣第三個空間的值是 " + y[2]);
//		System.out.println("y矩陣第四個空間的值是 " + y[3]);
//		System.out.println("y矩陣第五個空間的值是 " + y[4]);
//		
		//賦值2
//		int[] z = {5, 4, 3, 2, 1};
//		
//		//賦值3
//		z[0] = 9;
//		z[1] = 8;
//		z[2] = 7;
//		z[3] = 6;
//		z[4] = 5;
//		
//		System.out.println("z矩陣第一個空間的值是 " + z[0]); 
//		System.out.println("z矩陣第二個空間的值是 " + z[1]);
//		System.out.println("z矩陣第三個空間的值是 " + z[2]);
//		System.out.println("z矩陣第四個空間的值是 " + z[3]);
//		System.out.println("z矩陣第五個空間的值是 " + z[4]);
		
		//用for迴圈讀出陣列內的資料
//		int[] arr = {38, 92, 74, 88, 11};
//		
//		for (int i = 0 ; i < arr.length; i++) { //i是arr陣列的索引值
//			System.out.println("arr[" + i + "] = " + arr[i]);
//		}
		
		//用for-each迴圈讀出陣列內的資料
		int k = 0;
		int[] arr = {38, 92, 74, 88, 11};
		for (int j : arr) { //j是arr陣列的值
			System.out.println("arr[" + k + "] = " + j);
			k++;
		}
	}	
}
