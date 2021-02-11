package sorting;

public class BubbleSort {
	public int[] sort(int[] arr) {
		
		boolean swapped = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		return arr;
	}
}
