import data.Array;
import data.DynamicArray;
import data.Struct;
import data.LinkedList;
import data.StackArray;


public class Main
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		
		Array a = new Array(6);
		
		Struct s = new Array(20);
		
		a.add(5);
		a.add(7);
		a.add(8);
		a.add(7);
		a.add(9);
		a.add(3);
		
		s.add(6);
		s.add(10);
		a.display();
		System.out.println(a.contains(7));	
		s.display();
		
		System.out.println();
		
		DynamicArray d = new DynamicArray();
		
		for(int i=0;i<=10;i++)
		{
			d.add(i*i);
		}
		
		System.out.println(d.get(7));
		
		System.out.println(d);
		
		System.out.println();
		
		LinkedList l = new LinkedList();
		
		l.add(5);
		
		l.add(7);
		
		l.add(14);
		
		System.out.println(l);
		
		StackArray st = new StackArray();
		
		st.push(5);
		st.push(7);
		st.push(8);
		st.push(3);
		
		System.out.println(st);
		
		System.out.println(st.pop());
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
	}
}
