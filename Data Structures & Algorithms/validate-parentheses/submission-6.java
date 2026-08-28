class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();        
        char[] sChars = s.toCharArray();

        for(char c : sChars){
            if(c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else{
                if (stack.isEmpty() || stack.pop() != c) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
