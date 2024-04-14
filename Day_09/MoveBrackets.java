package CP_Practice.Day_09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets {
    public static void solve(String s) {
        int moves = 0;
        Stack<Character> b = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (b.isEmpty()) {
                    moves++;
                } else {
                    b.pop();
                }
            }

            else {
                b.push('(');
            }
        }

        System.out.println(moves);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            solve(s);
        }
    }
}
