//Runtime: 47 ms, faster than 91.15% of Java online submissions for Min Stack.
//Memory Usage: 38.7 MB, less than 91.07% of Java online submissions for Min Stack.

class MinStack {
    Stack<Integer> min;
    Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
        min.push((min.size()==0)?x:Math.min(min.peek(),x));
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
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