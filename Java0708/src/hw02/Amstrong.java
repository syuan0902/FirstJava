package hw02;

public class Amstrong {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			int sum = 0;
			
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <10; k++ ) {
					sum = i*100 + j*10 + k;
					
					if(sum == i*i*i + j*j*j + k*k*k) {
						System.out.print(sum + ", ");
						
					}
				}
			}
		}
		System.out.print("為Amstrong數");	
	}
}
