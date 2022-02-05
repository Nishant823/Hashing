package hashing;
import java.util.*;

public class LongestSubArrayWithEqual0sand1sOpitmized {
	public static int subArray(int[]arr)
	{
		int prefix_sum=0;int maxLen=0;int n=arr.length;
		HashMap<Integer,Integer> sb=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=(arr[i]==0)?-1:1;
		}
		for(int i=0;i<n;i++)
		{
			prefix_sum=prefix_sum+arr[i];
			if(prefix_sum==0)
			{
				maxLen=i+1;
			}
			if(sb.containsKey(prefix_sum+n)==true)
			{
				maxLen=Math.max(maxLen,i-sb.get(prefix_sum+n));
			}
			else
			{
				sb.put(prefix_sum+n,i);
			}
		}
		return maxLen;
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
		int count=subArray(arr);
		System.out.println("The the longest sub Array is of size: "+count);
		
		sc.close();

	}

}
