package in.currencydenomination.services;

public class SortDenomination {
	
	public static void descendingOrder(int[] array, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			
			descendingOrder(array,left,mid);
			
			descendingOrder(array,mid+1,right);

			mergeArray(array, left, mid, right);


		}
		
	}

	public static void mergeArray(int[] array, int left, int mid, int right) {
		int l1 = mid-left+1;
		int l2 = right-mid;

		int leftArray[]= new int[l1];
		int rightArray[]= new int[l2];

		int i =0;
		for(i=0; i < l1; i++) {
			leftArray[i]= array[left+i];
		}
		

		int j = mid+1;
		for(i=0; i<l2; i++) {
			rightArray[i] = array[j];
			j++;
		}
		
		
		int m=0, n=0, k=left;
		
		while(m<l1 && n<l2) {
			if(leftArray[m]>rightArray[n]) {
				array[k]=leftArray[m];
				m++;
			}
			else {
				array[k]=rightArray[n];
				n++;
			}
			k++;
		}
		
		while(m<l1) {
			array[k]=leftArray[m];
			m++;
			k++;
		}
		
		while(n<l2) {
			array[k]=rightArray[n];
			n++;
			k++;
		}

	}
		
}


