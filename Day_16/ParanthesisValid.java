package CP_Practice.Day_16;

import java.util.*;

public class ParanthesisValid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solve(s);
        }
    }

    public static void solve(String s) {
        // int res = 0;
        // int max = 0;
        // Stack<Character> c = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // if (c.isEmpty())
        // res = 0;
        // if (s.charAt(i) == '<')
        // c.push('<');
        // else {
        // if (c.isEmpty())
        // break;
        // else {
        // c.pop();
        // res += 2;

        // }
        // }
        // max = Math.max(max, res);
        // }
        // System.out.println(max);
        int res = 0;
        int max = 0;
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (c.isEmpty() && s.charAt(i) == '<')
                res = 0;
            if (s.charAt(i) == '<')
                c.push('<');
            else if (c.isEmpty()) {
                break;
            } else if (c.peek() == '<') {
                c.pop();
                res += 2;
            } else {
                break;
            }
            max = Math.max(max, res);
        }
        System.out.println(max);
    }
}
