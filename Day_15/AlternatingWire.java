package CP_Practice.Day_15;

import java.util.*;

public class AlternatingWire {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            solve(s);
        }
    }

    public static void solve(String s) {
        Stack<Character> w = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (w.isEmpty())
                w.push(s.charAt(i));
            else {
                if (s.charAt(i) == w.peek())
                    w.pop();
                else {
                    w.push(s.charAt(i));
                }
            }
        }

        if (w.isEmpty()) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
