package Sorting;
import java.util.Arrays;

public class InsertionSort2 {
	
	static void Sort(int [] arr)
	{
		
		for(int j=1;j<arr.length;j++)
		{
			int key=arr[j];
			int i=j-1;
			
			while(i>=0 && arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		
	}
	
	

	public static void main(String[] args) {

     int arr[] = {9,6,7,5,0,8,2,7,1,3,-8};
     
     Sort(arr);
     
     System.out.println(Arrays.toString(arr));		

	}

}
