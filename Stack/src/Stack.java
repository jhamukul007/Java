import java.util.EmptyStackException;

public class Stack {

	private Linked top;
	private int length;
	
	

	public Stack(Linked top, int length) {
		top = null;
		length =0;
	}
	
	public Stack() {
	}

	public void push(int data) {
		Linked t=new Linked(data);
		t.setNext(top);
		top=t;
		length++;
	}
	public void display() {
		Linked t=top;
		for(;t!=null;t=t.getNext())
        System.out.println(t.getData());			
		}
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public int pop() {
		if(isEmpty()) {
            throw new EmptyStackException();
		}
		else {
			int res=top.getData();
			top=top.getNext();
			length--;
			return res;
		}
	}		
		public int peek() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			return top.getData();
	}
	public static void main(String[] args) {
		Stack s=new Stack();
        s.push(30);	
        s.push(45);
        s.push(12);
        s.push(67);
	    s.display();
	    System.out.println("Top Element is:"+s.peek());
	}
}
