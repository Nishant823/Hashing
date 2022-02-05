package hashing;
import java.util.*;

public class FrequencyOfAnArrayElement {
	public static int frequency(int[]arr,int num)
	{
		HashMap<Integer,Integer> sb=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(sb.containsKey(arr[i]))
			{
				sb.put(arr[i],sb.get(arr[i])+1);	
			}
			else
			{
				sb.put(arr[i],1);
			}
		}
		return sb.get(num);
		
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
		int freq=frequency(arr,arr[n-1]);
		System.out.println(freq);
		sc.close();

	}

}
