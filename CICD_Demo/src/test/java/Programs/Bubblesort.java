package Programs;

import java.util.Iterator;

public class Bubblesort {

	public static void main(String[] args) {
	
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		int n = arr.length;
		for (int i = 0; i <n-1; i++) {
			for (int j = 0; j <n-1; j++) {
				if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
