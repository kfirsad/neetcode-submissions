class Solution {
    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        char[] sArray = s.toCharArray();

        for(char c : sArray){
            if(c == '{'){
                queue.push('}');
            }else if(c == '['){
                queue.push(']');
            }else if(c == '('){
                queue.push(')');
            }else if(queue.isEmpty() || queue.pop() != c){
                return false;
            }

        }

        return queue.isEmpty();

    }
}
