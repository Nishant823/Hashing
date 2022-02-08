package hashing;
import java.util.*;

public class LongestSubArrrayWithZeroSum {
	public static int longestSubArray(int[] arr)
	{
		
		HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
		
		int prefix_sum=0;
		int maxLen=0;
		for(int i=0;i<arr.length;i++)
		{
			prefix_sum=prefix_sum+arr[i];
			if(prefix_sum==0)
			{
				maxLen=i+1;
			}
			if(hash.containsKey(prefix_sum))
			{
				maxLen=Math.max(maxLen,i-hash.get(prefix_sum));
			}
			else
			{
				hash.put(prefix_sum,i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxLen=longestSubArray(arr);
		System.out.println("The longest length is :"+maxLen);
		sc.close();

	}

}
