package hashing;
import java.util.*;

public class LongestSubArrayWithGivenSumOptimized {
	public static int LongestSubArray(int []arr,int sum)
	{
		HashMap<Integer,Integer> sb=new HashMap<Integer,Integer>();
		int res=0,prefix_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefix_sum=prefix_sum+arr[i];
			if(prefix_sum==sum)
			{
				res= i+1;
			}
			if(sb.containsKey(prefix_sum)==false)
			{
				sb.put(prefix_sum,i);
			}
			if(sb.containsKey(prefix_sum-sum))
			{
				res=Math.max(res,i-(sb.get(prefix_sum-sum)));
			}
		}
		return res;
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
		System.out.print("Enter the sum: ");
		int sum=sc.nextInt();
		int len=LongestSubArray(arr,sum);
		System.out.println(len);
		sc.close();

	}

}
