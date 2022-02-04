package hashing;
import java.util.Scanner;


public class SubArrayWithGivenSumNaive {
	public static boolean subArray(int[]arr,int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			int curr_sum=0;
			for(int j=i;j<arr.length;j++)
			{
				curr_sum=curr_sum+arr[j];
				if(curr_sum==sum)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum to find: ");
		int sum=sc.nextInt();
		boolean subArray=subArray(arr,sum);
		if(subArray)
		{
			System.out.println("The sum is present in the array ");
		}
		else
		{
			System.out.println("The sum is not present in the array ");
		}
		sc.close();

	}

}
