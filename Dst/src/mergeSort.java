import java.util.Arrays;

public class mergeSort {

	static void msort(int[] arr,int p,int r)
	{
		if(p<r)
		{
		    int q =(p+r)/2;
			msort(arr,p,q);
			msort(arr,q+1,r);
			merge(arr,p,q,r);
		}

	}


	public static void merge(int[] arr,int p,int q,int r)
	{
		int sizeofLeftArray=q-p+2;
		int sizeofRightArray=r-q+1;

		int[] leftArray = new int[sizeofLeftArray];
		int[] rightArray = new int[sizeofRightArray];
		int lindex=0,rindex=0;

		for(int i=p;i<=q;i++)
		{
			leftArray[lindex]=arr[i];
			lindex++;
		}
		leftArray[lindex]=Integer.MAX_VALUE;

		for(int j=q+1;j<=r;j++)
		{
			rightArray[rindex]=arr[j];
			rindex++;
		}
		rightArray[rindex]=Integer.MAX_VALUE;

		int i=0,j=0;
		for(int k=p;k<=r;k++)
		{
			if(leftArray[i]<rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}

		}


	}



public static void main(String[] args) {

	int arr[] = { 9, 6, 7, 5, 0, 8, 2, 7, 1, 3, -8 };

	msort(arr,0,arr.length-1);

	System.out.println(Arrays.toString(arr));
	//System.out.println("time complexity: O(nlogn) ");

}

}
