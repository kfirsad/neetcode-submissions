class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String newString = new String(sArray);
            if(map.containsKey(newString)){
                List<String> list = map.get(newString);
                list.add(s);
            }else{
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(newString, list);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }
}
