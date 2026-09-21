class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, (a,b) -> Integer.compare(a.length(), b.length()));
        Set<String> result = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList<>(result);
    }
}