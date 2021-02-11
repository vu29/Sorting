package sorting;

public class NewSort {
	int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j > 0 && arr[j] > key) {
				arr[j+1] = arr[j--];
			}
			arr[j+1] = key;
		}
		
		return arr;
	}
}
