package hashing;
import java.util.*;
class Hash{
	int bucket;
	ArrayList<LinkedList<Integer>>table;
	Hash(int b)
	{
		bucket=b;
		table=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++)
		{
			table.add(new LinkedList<Integer>());
		}
	}
	void insert(int key)
	{
		int i=key%bucket;
		table.get(i).add(key);
	}
	void remove(int key)
	{
		int i=key%bucket;
		table.get(i).remove((Integer)i);
		
	}
	boolean search(int key)
	{
		int i=key%bucket;
		System.out.println(table.get(i));
		return table.get(i).contains(key);
	}
}

public class ArrayListLinkedListChainingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hash sb=new Hash(7);
		
		int[]arr=new int[7];
		for(int i=0;i<7;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<7;i++)
		{
			sb.insert(arr[i]);
		}
		System.out.println(sb.search(55));
		
		sc.close();

	}

}
