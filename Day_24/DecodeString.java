package CP_Practice.Day_24;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        decodeString("3[a2[c]]");
    }

    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                c.push(s.charAt(i));
            } else {
                StringBuilder sb = new StringBuilder();
                while (c.peek() != '[') {
                    sb.append(c.pop());
                }
                c.pop();
                sb.reverse();
                StringBuilder k = new StringBuilder();
                while (!c.isEmpty() && Character.isDigit(c.peek())) {
                    k.append(c.pop());
                }
                k.reverse();
                int n = Integer.parseInt(k.toString());
                for (int j = 0; j < n; j++) {
                    for (int o = 0; o < sb.length(); o++) {
                        c.push(sb.charAt(o));
                    }
                }
            }
        }

        while (!c.isEmpty()) {
            res.append(c.pop());
        }
        res = res.reverse();
        System.out.println(res.toString());
        return res.toString();
    }
}
