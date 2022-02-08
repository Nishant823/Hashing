package hashing;
import java.util.*;

public class SubArraysWithZeroSum {
	public static int subArrays(int[]arr)
	{
		HashMap<Integer,Integer>sb=new HashMap<Integer,Integer>();
		int count=0;
		int prefix_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefix_sum=prefix_sum+arr[i];
			if(prefix_sum==0)
			{
				count++;
			}
			if(sb.containsKey(prefix_sum))
			{
				count=count+sb.get(prefix_sum);
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
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int no=subArrays(arr);
		System.out.println("The number of subarray is :"+no);
		
		sc.close();

	}

}
