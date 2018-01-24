public class LinkListStack {

	LinkList li = new LinkList();

	public void push(int data) {
	    li.insertFirst(data);
	}

	public void pop() {
	    while(!li.isEmpty()){
	    li.deleteFirst();
	    }
	}
}

public class LinkList {

	private Node first = null;

	public void insertFirst(int data) {
    	Node n = new Node(data);
    	n.next = first;
    	first = n;
	}

	public Node deleteFirst() {
	    Node temp = first;
	    first = first.next;
	    return temp;
	}


	public boolean isEmpty() {
	    return (first == null);
	}
}

public class Node {

	public int data;
	public Node next;

	public Node(int data) {
    	this.data = data;
	}
}
public class LinkListStackDemo {

	public static void main(String[] args) {
    	LinkListStack st = new LinkListStack();

    	st.push(50);
    	st.push(70);
    	st.push(190);
    	st.pop();

	}
 }