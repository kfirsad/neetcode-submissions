class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = Map.of(
            '{', '}',
            '(', ')',
            '[', ']'
        );

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(map.get(c));
            }else{
                if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }

        return stack.isEmpty();
}
}
