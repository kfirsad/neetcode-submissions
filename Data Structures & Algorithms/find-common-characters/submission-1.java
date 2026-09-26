class Solution {
    public List<String> commonChars(String[] words) {
        char[] firstWord = words[0].toCharArray();
        int[] map = new int[26];
        List<String> answer = new ArrayList<String>();

        for (char c : firstWord) {
            map[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            char[] currWord = words[i].toCharArray();
            int[] currWordMap = new int[26];

            for (char c : currWord) {
                currWordMap[c - 'a']++;
            }

            for (int x = 0; x <= 25; x++) {
                map[x] = Math.min(map[x], currWordMap[x]);
            }
        }

        for (int i = 0; i <= 25; i++) {
            for (int x = 0; x < map[i]; x++) {
                answer.add(String.valueOf((char) (i + 'a')));
            }
        }

        return answer;
    }
}
