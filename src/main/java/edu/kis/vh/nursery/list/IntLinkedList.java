package edu.kis.vh.nursery.list;

public class IntLinkedList {
	
	public final int MINUS = -1;
	
    Node last;
    int INDEX
    ;

    public void push(int INDEX) {
        if (last == null)
            last = new Node(INDEX);
        else {
            last.next = new Node(INDEX);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return MINUS;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return MINUS;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
