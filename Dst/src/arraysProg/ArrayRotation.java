package arraysProg;

import java.util.Arrays;

public class ArrayRotation {
	
	public static void arrayRotate(int arr[],int number) {
		while(number>0) {
			
			int temp=arr[0];
			for(int i=1;i<arr.length;i++){
				arr[i-1]=arr[i];
		    }
			
			arr[arr.length-1]=temp;
			number--;
	
		}
	}
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		arrayRotate(arr, 2);
		
		System.out.println(Arrays.toString(arr));

	}

}
