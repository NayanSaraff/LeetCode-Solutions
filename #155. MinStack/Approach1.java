class MinStack {

    Stack<Integer> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<st.size();i++)
        {
            if(st.get(i) < min)
                min = st.get(i);
        }
        return min;

    }
}
