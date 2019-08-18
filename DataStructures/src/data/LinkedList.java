package data;

public class LinkedList implements List {

	private int data;
	LinkedList next;
	
	LinkedList head;
	
	public LinkedList()
	{
		data=0;
		next=null;
	}
	
	LinkedList(int data)
	{
		this.data=data;
		next=null;
	}
	
	public void add(int d)
	{
		if(head==null)
		{
			head=new LinkedList(d);
		}
		else
		{
			LinkedList temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next= new LinkedList(d);
		}
	}
	
	public void display()
	{
		LinkedList temp= head;
		
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		System.out.print(temp.data);
	}
	
	public boolean contains(int d)
	{
		LinkedList temp=head;
		
		while(temp!=null)
		{
			if(temp.data==d)
			{
				return true;
			}
			temp=temp.next;
		}
		
		return false;
	}
	
	public void insertAtFirst(int d)
	{
		
	}

	@Override
	public int get(int d) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString()
	{
		String op="";
		
		LinkedList temp= head;
		
		while(temp.next!=null)
		{
			op=op+temp.data+"->";
			temp=temp.next;
		}
		
		op=op+temp.data;
		
		return op;
	}

}
