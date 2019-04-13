//Runtime: 43 ms, faster than 87.16% of Java online submissions for Implement Queue using Stacks.
//Memory Usage: 33 MB, less than 100.00% of Java online submissions for Implement Queue using Stacks.

class MyQueue {
    Stack<Integer> fir;
    Stack<Integer> sec;
    int prev;
    /** Initialize your data structure here. */
    public MyQueue() {
        fir = new Stack<>();
        sec = new Stack<>();
        prev = 0;
    } 
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(fir.size()==0) prev= x;
        while(fir.size()!=0) sec.push(fir.pop());
        fir.push(x);
        while(sec.size()!=0) fir.push(sec.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(fir.size()==0) return sec.pop();
        else return fir.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(fir.size()==0) return sec.peek();
        else return fir.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (fir.size()==0 && sec.size()==0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */