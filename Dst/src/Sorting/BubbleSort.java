package Sorting;
import java.util.Arrays;

public class BubbleSort {
	
	static void bsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int swapped =0;
			for(int j=0;j<arr.length-1-i;j++)
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped =1;
			}
			
			if(swapped ==0)
				break;
			
		}
		
		
	}
	
	static void print(int[] x)
	{
		System.out.println(Arrays.toString(x));
	}
	
	
	public static void main(String[] args) 
	{
		int[] x= {5,1,6,2,3,0,3,45,6,7,4};
		bsort(x);
		
		print(x);
		
	}

}
