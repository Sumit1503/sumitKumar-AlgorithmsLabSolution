package in.paymoney.services;

public class PayMoneyServices {

	public static void checkTarget(int[] transactionArray, int target) {

		int sum =0;
		int i = 0;
		int size= transactionArray.length;
		boolean flag = false;
		
		for(i = 0; i< size; i++) {
			sum += transactionArray[i];
			if(sum >= target) {
				flag = true;
				System.out.println("Target achieved after " + (i+1) + " transactions");			
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Given target is not achieved ");
		}
		
	}

}
