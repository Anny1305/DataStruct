import java.util.Arrays;

public class InsertionSort {
	
	static void Sort(int [] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else 
					break;
			}
		}
		
	}
	
	

	public static void main(String[] args) {

     int arr[] = {9,6,7,5,0,8,2,7,1,3,-8};
     
     Sort(arr);
     
     System.out.println(Arrays.toString(arr));		

	}

}
