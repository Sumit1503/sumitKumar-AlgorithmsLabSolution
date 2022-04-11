package in.currencydenomination.driver;

import java.util.Scanner;

import in.currencydenomination.services.CurrencyServices;

public class Driver {
	
	public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of currency denomination");
			int sizeDenominationArray = sc.nextInt();
			
			int[] denominationArray = new int[sizeDenominationArray];
			
			System.out.println("Enter the currency denominations value");			
			for(int i = 0; i < sizeDenominationArray; i++) {
				denominationArray[i] = sc.nextInt();
			}
			
					
			System.out.println("Enter the amount you want to pay");
			int amountToPay = sc.nextInt();
			
			CurrencyServices currencyDenomination = new CurrencyServices();
			currencyDenomination.minimumDenomination(denominationArray, amountToPay);
			
			sc.close();
		
	}

}
