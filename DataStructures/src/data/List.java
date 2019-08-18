package data;

public interface List extends Struct {
	void add(int d);
	
	void display();
	
	int get(int d) ;
	
	boolean contains(int d);
	
	void insertAtFirst(int d);
}
