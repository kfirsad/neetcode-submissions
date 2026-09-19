class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> set = Set.of("+", "*", "-", "/");
        
        for(int i = 0; i < tokens.length; i++){
            if(!set.contains(tokens[i])){
               stack.push(Integer.parseInt(tokens[i]));
            }else{
                int first = stack.pop();
                int second = stack.pop();
                int curr = 0;
                switch(tokens[i]){
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
