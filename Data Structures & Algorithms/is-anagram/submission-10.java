class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();

        char[] chart = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : chart) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
