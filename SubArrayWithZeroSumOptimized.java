package hashing;
import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithZeroSumOptimized {
	public static boolean zeroSum(int[]arr)
	{
		HashSet<Integer>sb=new HashSet<Integer>();
		int prefixSum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefixSum=prefixSum+arr[i];
			if(sb.contains(prefixSum))
			{
				return true;
			}
			if(prefixSum==0)
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
		System.out.println("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean zeroSum=zeroSum(arr);
		if(zeroSum){
			System.out.println("The sub array with zero sum is present in the array");
		}
		else
		{
			System.out.println("The sub array with zero sum is not present");
		}
		sc.close();
		

	}

}
