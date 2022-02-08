package hashing;
import java.util.*;

public class SubArraysWithSumK {
	public static int subArrays(int[]arr,int k)
	{
		HashMap<Integer,Integer>sb=new HashMap<Integer,Integer>();
		int count=0;
		int prefix_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefix_sum=prefix_sum+arr[i];
			if(prefix_sum==k)
			{
				count++;
			}
			if(sb.containsKey(prefix_sum-k))
			{
				count=count+sb.get(prefix_sum-k);
			}
			if(sb.containsKey(prefix_sum))
			{
				sb.put(prefix_sum,sb.get(prefix_sum)+1);
			}
			else
			{
				sb.put(prefix_sum,1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum: ");
		int k=sc.nextInt();
		int no=subArrays(arr,k);
		System.out.println("The subArrays with sum is: "+no);
		sc.close();

	}

}
