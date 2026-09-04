class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String c : strs){
            char[] cArray = c.toCharArray();
            Arrays.sort(cArray);
            String sortedString = new String(cArray);
            if(map.containsKey(sortedString)){
                List<String> list = map.get(sortedString);
                list.add(c);
            }else{
                List<String> list = new ArrayList<>();
                list.add(c);
                map.put(sortedString, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
