package CP_Practice.Day_07;

import java.util.*;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t == "") {
            return "";
        }

        int[] ans = { -1, -1 };
        String res = "";
        int resLen = Integer.MAX_VALUE;
        HashMap<Character, Integer> count = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (!count.containsKey(t.charAt(i))) {
                count.put(t.charAt(i), 1);
                continue;
            }
            count.put(t.charAt(i), count.get(t.charAt(i)) + 1);
        }
        // System.out.println(count);

        int have = 0, need = count.size();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!window.containsKey(c)) {
                window.put(c, 1);
            } else {
                window.put(c, window.get(c) + 1);
            }

            if (count.containsKey(c) && count.get(c).equals(window.get(c))) {
                have++;
            }

            while (have == need) {
                if (i - left + 1 < resLen) {
                    resLen = i - left + 1;
                    ans[0] = left;
                    ans[1] = i;
                }
                if (window.get(s.charAt(left)) > 0) {
                    window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                }
                if (count.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < count.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }
        }
        if (ans[0] != -1) {
            res = s.substring(ans[0], ans[1] + 1);
        }
        return res;
    }
}
