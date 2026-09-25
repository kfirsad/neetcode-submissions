class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minNumbers;

    public MinStack() {
        stack = new ArrayDeque<>();
        minNumbers = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minNumbers.isEmpty()){
            minNumbers.push(val);
        }else if (minNumbers.peek() >= val) {
            minNumbers.push(val);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (minNumbers.peek().equals(x)) {
            minNumbers.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(!minNumbers.isEmpty()){
            return minNumbers.peek();
        }else{
          return 0;
        }
    }
}
