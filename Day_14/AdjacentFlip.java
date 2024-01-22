package CP_Practice.Day_14;

import java.util.Scanner;
import java.util.Stack;

public class AdjacentFlip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            solve(s);
        }
    }

    public static void solve(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!a.isEmpty() && a.peek() == s.charAt(i))
                a.pop();
            else
                a.push(s.charAt(i));
        }
        if (a.size() <= 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
