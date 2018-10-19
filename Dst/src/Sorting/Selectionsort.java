package Sorting;

public class Selectionsort {
	
	private static void selectionSort(int[] arr) 
	{
	
		for(int i=0;i<arr.length;i++)
		{
			int min =arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
				
			}
			
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
			
			
		}
		
		
		
		
		
	}
	
	static void print(int[] arr)
	{
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,7,34,4,9,0,3,8,6};
		
		selectionSort(arr);
		print(arr);
		
		
	}

	

}
