package data;

public class StackArray implements Stack {
	int[] arr;
	int top;
	int k;
	
	public StackArray()
	{
		 arr = new int[128];
		 top=0;	
	}
	
	StackArray(int s)
	{
		arr = new int[s];
		top=0;
	}
	@Override
	public void push(int d) {
		// TODO Auto-generated method stub
		arr[top]=d;
		top++;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(top>0)
		{
			top=top-1;
			return arr[top];
		}
		else
			return -1;
	}
	
	public String toString()
	{
		String out="";
		
		out=out+"[";
		
		int k=top;
		
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
