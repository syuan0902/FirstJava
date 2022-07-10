package hw03;

public class Sales {

	public static void main(String[] args) {
		int sum1 = 0; //Jean的銷售總額
		int sum2 = 0; //Tom的銷售總額
		int sum3 = 0; //Tina的銷售總額
		
		int[] prices = {12, 16, 10, 14, 15}; //各商品單價
		
		int[][] amounts = {{33, 32, 56, 45, 33}, //Jean在某月的各商品銷售數量
						{77, 33, 68, 45, 23}, //Tom在某月的各商品銷售數量
						{43, 55, 43, 67, 65}}; //Tina在某月的各商品銷售數量
		
		for (int i = 0; i < amounts.length; i++) { //銷售員人數 (列)
			
			if (i == 0) { //銷售員Jean
				for (int j = 0; j < amounts[i].length; j++) { //商品種類數量 (行)
					for (int k = 0; k < prices.length; k++) { //商品單價 (行)
						
						if (j == k) { 
							sum1 += amounts[i][j] * prices[k];	
						}
					}
				}
				System.out.println("Jean的銷售總額為 " + sum1 + "元");
			}
			
			if (i == 1) { //銷售員Tom
				for (int j = 0; j < amounts[i].length; j++) { //商品種類數量 (行)
					for (int k = 0; k < prices.length; k++) { //商品單價 (行)
						
						if (j == k) { 
							sum2 += amounts[i][j] * prices[k];
						}
					}
				}
				System.out.println("Tom的銷售總額為 " + sum2 + "元");
			}
			
			if (i == 2) { //銷售員Tina
				for (int j = 0; j < amounts[i].length; j++) { //商品種類數量 (行)
					for (int k = 0; k < prices.length; k++) { //商品單價 (行)
						
						if (j == k) { 
							sum3 += amounts[i][j] * prices[k];
						}
					}
				}
				System.out.println("Tina的銷售總額為 " + sum3 + "元");
			}
		}
	}
}
