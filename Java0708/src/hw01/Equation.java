package hw01;
import java.util.Scanner;
public class Equation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入a的值(a != 0): ");
		int a = scanner.nextInt();
	
		System.out.println("請輸入b的值: ");
		int b = scanner.nextInt();
	
		System.out.println("請輸入c的值: ");
		int c = scanner.nextInt();
		scanner.close();
		
		double x1 , x2; //根
		double y = b*b - 4*a*c; //判斷式
	
		if (y == 0) {
			x1 = -b / 2*a;
			System.out.println("有兩個相等的實根: " + x1);
		}
	
		if (y < 0) {
			System.out.println("沒有實根");
		}
	
		if (y > 0) {
			x1 = (-b + Math.sqrt(y))  / 2*a;
			x2 = (-b - Math.sqrt(y))  / 2*a;
			System.out.println("有兩個不相等的實根: " + x1 + "和" + x2);
		}
	}
}