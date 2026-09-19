class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<String> set = Set.of("+", "*", "-", "/");
        
        for(String token : tokens){
            if(!set.contains(token)){
               stack.push(Integer.parseInt(token));
            }else{
                int first = stack.pop();
                int second = stack.pop();
                int curr = 0;
                switch(token){
                    case "+":
                    curr = first + second;
                    break;

                    case "*":
                    curr = first * second;
                    break;

                    case "-":
                    curr = second - first;
                    break;

                    case "/":
                    curr = second / first;
                    break;
                }
                stack.push(curr);         
            }
        }

        return stack.pop();
    }
}
