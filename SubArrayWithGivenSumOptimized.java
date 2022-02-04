package hashing;
import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithGivenSumOptimized {
	public static boolean subArray(int[]arr,int sum)
	{
		HashSet<Integer> sb=new HashSet<Integer>();
		int prefixSum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefixSum=prefixSum+arr[i];
			if(prefixSum==sum)
			{
				return true;
			}
			if(sb.contains(prefixSum-sum))
			{
				return true;
			}
			sb.add(prefixSum);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum to find: ");
		int sum=sc.nextInt();
		boolean subArray=subArray(arr,sum);
		if(subArray)
		{
			System.out.println("Hence the sum is present in the array ");
		}
		else
		{
			System.out.println("The sum is not present in the array ");
		}
		sc.close();

	}

}
