package CP_Practice.Day_15;

import java.util.Stack;

public class RemoveSubstring {

    public static void main(String[] args) {
        int a = maximumGain("aabbaaxybbaabb", 5, 4);
        System.out.println(a);
    }

    public static int maximumGain(String s, int x, int y) {
        char cf = 'b', cn = 'a';
        int nmin = 0, nmax = 0;
        int min = y, max = x;
        if (y > x) {
            max = y;
            min = x;
            cf = 'a';
            cn = 'b';
        }
        // System.out.println(max + " " + cf + " " + min + " " + cn);
        int res = 0;
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (c.isEmpty() || s.charAt(i) != cf) {
                c.push(s.charAt(i));
            } else {
                if (c.peek() == cn) {
                    c.pop();
                    nmax++;
                    // res += max;
                } else {
                    c.push(cf);
                }
            }
        }
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < c.size(); i++) {
            newS.append(c.elementAt(i));
        }
        // System.out.println(c);
        c.clear();

        for (int i = 0; i < newS.length(); i++) {
            if (c.isEmpty() || newS.charAt(i) != cn) {
                c.push(newS.charAt(i));
            } else {
                if (c.peek() == cf) {
                    c.pop();
                    nmin++;
                    // res += min;
                } else {
                    c.push(cn);
                }
            }
        }
        if (x == y) {
            res = x * Math.max(nmin, nmax) + y + Math.min(nmin, nmax);
        } else {
            res = nmax * max + nmin * min;
        }
        return res;
    }
}
