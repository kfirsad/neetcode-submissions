class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedString = new String(sArray);
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            List<String> currList = map.get(sortedString);
            currList.add(s);
        }

        return new ArrayList<>(map.values());
    }
}
