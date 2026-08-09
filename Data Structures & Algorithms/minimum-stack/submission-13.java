class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val); 

        // val is <= to account for multiple instances of pushing the minimum
        if(minStack.isEmpty() || val <= minStack.get(minStack.size()-1)){
            minStack.add(val);
        }
    }
    
    public void pop() {
        int last = stack.remove(stack.size()-1);
        
        if(last == minStack.get(minStack.size()-1)){
            minStack.remove(minStack.size()-1);
        }
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}


