package CP_Practice.Day_20;

import java.util.Scanner;
import java.util.Stack;

public class BinaryStringToSubsequence {

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
        Stack<Integer> so = new Stack<>();
        Stack<Integer> sz = new Stack<>();
        int num = 1;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (so.isEmpty()) {
                    sz.push(num);
                    res[i] = num;
                    num++;
                } else {
                    res[i] = so.peek();
                    sz.push(res[i]);
                    so.pop();
                }
            }

            else {
                if (sz.isEmpty()) {
                    so.push(num);
                    res[i] = num;
                    num++;
                } else {
                    res[i] = sz.peek();
                    so.push(res[i]);
                    sz.pop();
                }
            }
        }

        System.out.println(num - 1);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
