package hashing;
import java.util.Scanner;

public class LongestSubArrayWithEqual0sand1s {
	public static int subArray(int[]arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int c0=0,c1=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==0)
				{
					c0++;
				}
				if(arr[j]==1)
				{
					c1++;
				}
				if(c0==c1)
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
		System.out.print("Enter the number of element in array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=subArray(arr);
		System.out.println("The subArray with equal 0s and 1s is: "+count);
		sc.close();

	}

}
