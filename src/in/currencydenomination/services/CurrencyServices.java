package in.currencydenomination.services;

public class CurrencyServices {


	public void minimumDenomination(int array[] , int amountToPay) {

		int size = array.length;

		int remainingAmount = amountToPay;
		int countDenomination[] = new int[size];

		// arrange denomination array in descending order
		SortDenomination.descendingOrder(array, 0 , size-1);

		
		for(int i = 0; i < size ; i++) {
			if(remainingAmount >= array[i]) {		
					countDenomination[i] = remainingAmount/array[i];
					remainingAmount = remainingAmount % array[i];
			}else if(remainingAmount == 0) {
				break;
			}else {
				countDenomination[i] =0;
			}
		}
		
		
		if(remainingAmount > 0) {
			System.out.println("Exact amount cant be tendered");
		}else if(remainingAmount == 0 ) {
			System.out.println("Your payment approach in order to give minimum number of notes will be");
			for(int j =0 ;j < size; j++) {
				if(countDenomination[j] !=0) {
					System.out.println(array[j] + " : " + countDenomination[j]);
				}
			}
		}


	}

}
