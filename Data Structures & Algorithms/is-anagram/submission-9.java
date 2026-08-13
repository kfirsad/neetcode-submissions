class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char c : sArray){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for(char c : tArray){
            int newCount = countMap.getOrDefault(c, 0) - 1;
            if(newCount < 0){
                return false;
            }
            countMap.put(c, newCount);
        }

        return true;
    }
}
