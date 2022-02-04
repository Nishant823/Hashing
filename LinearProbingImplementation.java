package hashing;
class MyHash{
	int size;
	int cap;
	int []arr;
	MyHash(int x)
	{
		cap=x;
		size=0;
		arr=new int[cap];
		for(int i=0;i<cap;i++)
		{
			arr[i]=-1;
		}
	}
	int hash(int key)
	{
		return key%cap;
	}
	boolean search(int key)
	{
		int i=hash(key);
		int h=i;
		while(arr[i]!=-1)
		{
			if(arr[i]==key)
			{
				return true;
			}
			i=(i+1)%cap;
			if(i==h)
			{
				return false;
			}
			
		}
		return false;
	}
	boolean insert(int key)
	{
		if(size==cap)
		{
			return false;
		}
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1&&arr[i]!=-2 &&arr[i]!=key)
		{
			i=(i+1)%cap;
		}
		if(arr[i]==key)
		{
			return false;
		}
		else
		{
			size++;
			arr[i]=key;
			return true;
		}
	}
	boolean delete(int key)
	{
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1)
		{
			if(arr[i]==key)
			{
				arr[i]=-2;
				return true;
			}
			i=(i+1)%cap;
			if(i==h)
			{
				return false;
			}
			
		}
		return false;
	}
		
}

public class LinearProbingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHash sb=new MyHash(7);
		sb.insert(50);
		sb.insert(27);
		sb.insert(47);
		sb.insert(49);
		sb.insert(59);
		if(sb.search(49))
		{
			System.out.println("The element is present in hash table ");
		}
		else
		{
			System.out.println("The element is not present");
		}
		if(sb.delete(49))
		{
			System.out.println("The element is deleted successfully");
		}
		else
		{
			System.out.println("The element is already deleted");
		}
		if(sb.delete(49))
		{
			System.out.println("The element is deleted successfully");
		}
		else
		{
			System.out.println("The element is already deleted");
	    }

    }
}
