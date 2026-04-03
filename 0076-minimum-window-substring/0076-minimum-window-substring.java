class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();
        int formed = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (r < s.length()) {
            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char left = s.charAt(l);
                window.put(left, window.get(left) - 1);

                if (map.containsKey(left) && window.get(left) < map.get(left)) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}