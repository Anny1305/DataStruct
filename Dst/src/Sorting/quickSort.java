package Sorting;
import java.util.Arrays;

public class quickSort {
	
	private static void qSort(int[] arr, int p, int r) 
	{
		if(p<r)
		{
		int pivot = partition(arr,p,r);
		qSort(arr,p,pivot-1);
		qSort(arr,pivot+1,r);
		}
	}
	
	static int partition(int[]arr, int p ,int r)
	{
		
		int key =arr[r];
		int i=p-1;
		
		for(int j=p;j<r;j++)
		{
			if(arr[j]<=key)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp;
		
		return (i+1);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = { 9, 6, 7, 5, 0, 8, 2, 7, 1, 3, -8 };
		
		qSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));		
		
		
	}

	

}
