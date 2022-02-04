package hashing;
import java.util.Scanner;

public class LongestSubarrayWithGivenSum {
	public static int LargestLen(int[]arr,int sum)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int curr_sum=0;
			for(int j=i;j<arr.length;j++)
			{
				curr_sum=curr_sum+arr[j];
				if(curr_sum==sum)
				{
					res=Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Entert the number of element in array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum to find: ");
		int sum=sc.nextInt();
		int len=LargestLen(arr,sum);
		System.out.println(len);
		sc.close();
		

	}

}
