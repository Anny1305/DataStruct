package arraysProg;

public class SumofNonAdjacentNumber {

	private static int CalculateMaxSum(int[] arr) {
		int max =0;
		
		for(int i =0;i<arr.length;i++)
		{
			int sum =0;
			for (int j = i; j < arr.length; j=j+2) 
			{
				sum = sum+arr[j];
			}
			if(max<sum)
				max= sum;
			
		}
		return max;
	}
	
	public static void main(String[] args) {
      int [] arr = {5,5,10,40,50,35};
   
      int result = CalculateMaxSum(arr);
      System.out.println(result);
		
	}


}
