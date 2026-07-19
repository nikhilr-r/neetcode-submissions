class MinStack {
    Stack<Integer> st;       // main stack for values
    Stack<Integer> minStack; // stack to track minimums

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        // if minStack is empty or val <= current min, push to minStack too
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = st.pop();
        // if removed element is current min, pop from minStack too
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

