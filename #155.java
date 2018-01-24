class MinStack {
    ListNode head;
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(head == null){
            head = new ListNode(x,x);
        }else{
            ListNode newHead = new ListNode(x,Math.min(head.min, x));
            newHead.next = head;
            head = newHead;
        }
    }
    
    public void pop() {
        if(head != null){
            head = head.next;
        }
    }
    
    public int top() {
        if(head != null){
            return head.key;
    }
        return -1;
    }
    public int getMin() {
        if(head != null){
            return head.min;
        }
        return -1;
    }
}

class ListNode{
    int key;
    int min;
    ListNode next;
    ListNode(int key, int min){
        this.key = key;
        this.min = min;
        next = null;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */