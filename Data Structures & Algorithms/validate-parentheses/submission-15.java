class Solution {
    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        Map<Character,Character> map = Map.of(
            '{', '}',
            '[', ']',
            '(', ')'
        );

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                queue.push(map.get(c));
            }else if(queue.isEmpty() || queue.pop() != c){
                return false;
            }

        }

        return queue.isEmpty();

    }
}
