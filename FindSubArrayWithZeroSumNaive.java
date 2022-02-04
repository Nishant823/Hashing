package hashing;
import java.util.Scanner;

public class FindSubArrayWithZeroSumNaive {
	public static boolean zeroSumSubArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				
				if(sum==0)
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
		System.out.print("Enter the number of element in array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean sumZero=zeroSumSubArray(arr);
		if(sumZero==true)
		{
			System.out.println("The array contain the sub array with zero sum ");
		}
		else
		{
			System.out.println("The array does not contain the sub array with zero sum ");
		}
		sc.close();

	}

}
