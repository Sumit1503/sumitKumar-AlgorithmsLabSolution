package in.paymoney.driver;

import java.util.Scanner;

import in.paymoney.services.PayMoneyServices;

public class PayMoneyDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int sizeTransactionArray = sc.nextInt();
		int[] transactionArray = new int[sizeTransactionArray];
		int i = 0;
		System.out.println("Enter the values of array");
		for(i = 0; i < sizeTransactionArray; i++) {
			transactionArray[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the total number of targets that needs to be achieved");
		int numberOfTargets = sc.nextInt();
		System.out.println();
		
		for(i = 0; i < numberOfTargets; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			PayMoneyServices.checkTarget(transactionArray, target);
			System.out.println();
		}	
		sc.close();
	}

}
