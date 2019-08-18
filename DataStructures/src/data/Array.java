package data;

public class Array implements ArraySet {
	int[] arr;
	public int size;
	int k;
	
	public Array(int size)
	{
		this.size=size;
		arr=new int[size];
		k=0;
	}
	
	public void add(int d)
	{
		arr[k]=d;
		k++;
	}
	
	public void display()
	{
		System.out.print("[");
		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]);
			if(i<k-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public int get(int d)
	{
		return arr[d];
	}
	
	public boolean contains(int d)
	{
		for(int i=0;i<k;i++)
		{
			if(arr[i]==d)
				return true;
		}
		return false;
	}
	
	public String toString()
	{
		String out="";
		
		out=out+"[";
		
		for(int i=0;i<k;i++)
		{
			out=out+arr[i];
			if(i<k-1)
				out=out+", ";
		}
		out=out+"]";
		
		return out;
	}
}
